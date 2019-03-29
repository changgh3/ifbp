package com.yonyou.ifbp.demo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.yonyou.ifbp.persistence.bs.dao.MetadataDAO;
import com.yonyou.ifbp.persistence.jdbc.framework.SQLParameter;
import com.yonyou.ifbp.persistence.jdbc.framework.util.FastBeanHelper;
import com.yonyou.ifbp.persistence.vo.BaseEntity;
import com.yonyou.ifbp.sm.querytemplate.entity.dto.SMQueryTemplateAggDto;
import com.yonyou.ifbp.sm.querytemplate.util.SMQueryTemplateParser;
import com.alibaba.fastjson.JSON;
import com.yonyou.ifbp.base.BaseService;
import com.yonyou.ifbp.context.InvocationInfoProxy;
import com.yonyou.ifbp.demo.entity.BXHeaderEntity;
import com.yonyou.ifbp.demo.entity.VoucherStatusEnum;
import com.yonyou.ifbp.demo.service.BXHeaderService;
import com.yonyou.ifbp.mvc.type.SearchParams;
import com.yonyou.ifbp.bpm.enums.ApprovalEventEnum;

@Service
public class BXHeaderServiceImpl extends BaseService implements BXHeaderService {

	@Autowired
	MetadataDAO metadataDAO;

	@Override
	public MetadataDAO getMetadataDAO() {
		return metadataDAO;
	}
	
	@Override
	public <T extends BaseEntity> Page<T> retrieveByPage(Class<T> cls, PageRequest pageRequest,
			SearchParams searchParams, boolean transRefFlag){
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
	
	public void Approved(Map event) {
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
