package com.yonyou.iuap.course.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.ifbp.persistence.bs.dao.MetadataDAO;
import com.yonyou.ifbp.persistence.jdbc.framework.SQLParameter;
import com.yonyou.ifbp.persistence.jdbc.framework.util.FastBeanHelper;
import com.yonyou.ifbp.persistence.vo.BaseEntity;
import com.yonyou.ifbp.sm.querytemplate.entity.dto.SMQueryTemplateAggDto;
import com.yonyou.ifbp.sm.querytemplate.util.SMQueryTemplateParser;
import com.alibaba.fastjson.JSON;
import com.yonyou.ifbp.base.BaseService;
import com.yonyou.ifbp.bpm.enums.ApprovalEventEnum;
import com.yonyou.ifbp.demo.entity.BXHeaderEntity;
import com.yonyou.ifbp.demo.entity.VoucherStatusEnum;
import com.yonyou.ifbp.mvc.type.SearchParams;
import com.yonyou.iuap.course.entity.CourseEntity;
import com.yonyou.iuap.course.service.CourseService;
import com.yonyou.iuap.courseitem.entity.CourseItemEntity;
import com.yonyou.iuap.courseitem.service.CourseItemService;

@Transactional
@Service
public class CourseServiceImpl extends BaseService implements CourseService {

	@Autowired
	MetadataDAO metadataDAO;

	@Override
	public MetadataDAO getMetadataDAO() {
		return metadataDAO;
	}

	@Autowired
	CourseItemService courseItemService;

	// 主子表删除，添加事务管理
	@Override
	public <T extends BaseEntity> void deleteByPK(Class<T> cls, String pk) {
		super.deleteByPK(cls, pk);
		SearchParams searchParams = new SearchParams();
		searchParams.addCondition("course", pk);
		List<CourseItemEntity> list = courseItemService.retrieveByClause(CourseItemEntity.class,
				"select * from train_courseItem where course = '" + pk + "'", true);
		if (list != null && list.size() > 0) {
			courseItemService.deleteBatch(list);
		}
	}

	// 主子表新增，添加事务关联
	@Override
	public <T extends BaseEntity> String create(T entity, boolean withPk) {
		String id = super.create(entity, withPk);
		if (id != null && "".equals(id)) {
			List<CourseItemEntity> listCourseItem = (List<CourseItemEntity>) ((CourseEntity) entity).getCourse();
			if (listCourseItem != null && listCourseItem.size() > 0) {
				for (CourseItemEntity subEntity : listCourseItem) {
					subEntity.setCourse(id);
					courseItemService.create(subEntity, false);
				}
			}
		}
		return id;
	}
	//重写分页方法，加入搜索框的查询条件解析
	@Override
	public <T extends BaseEntity> Page<T> retrieveByPage(Class<T> cls, PageRequest pageRequest,	SearchParams searchParams, boolean transRefFlag){
		StringBuilder sql = new StringBuilder("select * from " + FastBeanHelper.getTableName(cls));
		Map<String, Object> searchParamsMap = searchParams.getSearchMap();
		SQLParameter sqlparam = new SQLParameter();
		if (null != searchParamsMap && !searchParamsMap.isEmpty()) {
			//高级查询
			String qtAggDtoJsonStr = (String) searchParamsMap.get("qtAggVO");
			SMQueryTemplateAggDto qtAggDto = JSON.parseObject(qtAggDtoJsonStr, SMQueryTemplateAggDto.class);
			String wherePart = SMQueryTemplateParser.parse(qtAggDto, null);
			if(wherePart!=null && !"".equals(wherePart)){
					sql.append( " where  "+ wherePart);
			}
		}
		Page<T> page = getMetadataDAO().queryPage(sql.toString(), sqlparam, pageRequest, cls, transRefFlag);
		return page;
	}
	
	public void approved(Map event) {
		try {
            Map<String, Object> eventMap=(Map) event.get("processInfo");
            BXHeaderEntity entity = this.retrieveByPK(BXHeaderEntity.class, null, (String)eventMap.get("businessKey"), false);
            
            if (ApprovalEventEnum.REJECT.toString().equalsIgnoreCase((String)event.get("event")) || ApprovalEventEnum.REJECT_TO_INIT.toString().equalsIgnoreCase((String)event.get("event"))) {
                entity.setSpzt(VoucherStatusEnum.审批中.toStringValue());
            } else if (ApprovalEventEnum.AGREE_END.toString().equalsIgnoreCase((String)event.get("event"))) {
                entity.setSpzt(VoucherStatusEnum.审批通过.toStringValue());
            } else if (ApprovalEventEnum.REFUSE.toString().equalsIgnoreCase((String)event.get("event"))) {
                entity.setSpzt(VoucherStatusEnum.审批未通过.toStringValue());
            }
            super.update(entity);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
	}
}
