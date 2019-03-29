package com.yonyou.iuap.course.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yonyou.ifbp.base.BaseController;
import com.yonyou.ifbp.base.PageParam;
import com.yonyou.ifbp.demo.entity.VoucherStatusEnum;
import com.yonyou.ifbp.persistence.vo.ResultMsg;
import com.yonyou.ifbp.persistence.vo.pub.VOStatus;
import com.yonyou.iuap.course.entity.CourseEntity;
import com.yonyou.iuap.course.service.CourseService;
import com.yonyou.iuap.course.service.impl.CourseServiceImpl;
import com.yonyou.iuap.courseitem.service.CourseItemService;
import com.yonyou.iuap.enumeration.entity.EnumStatus;

@Controller
@RequestMapping("/course")
// 请配置具体的controller路径
public class CourseController extends BaseController<CourseEntity> {

	@Autowired
	CourseService service;
	@Autowired
	private CourseItemService subService;

	@Override
	public ResultMsg page(@RequestBody PageParam pageParam) {
		try {
			Page<CourseEntity> page = service.retrieveByPage(CourseEntity.class, pageParam.getPageRequest(), pageParam.getSearchParams(), true);
//			List<CourseEntity> list = page.getContent();
//			List<CourseEntity> newlist =  new ArrayList<CourseEntity>();
//			for(CourseEntity entity :list){
//				if(entity.getAssistant()!=null && !"".equals(entity.getAssistant())){
//					TeacherEntity entity1 = service.retrieveByPK(TeacherEntity.class, entity.getAssistant());
//					entity.setAssistant(entity1.getName());
//				}
//				if(entity.getTeacher()!=null && !"".equals(entity.getTeacher())){
//				TeacherEntity entity2 = service.retrieveByPK(TeacherEntity.class, entity.getTeacher());
//				entity.setTeacher(entity2.getName());
//				}
//				newlist.add(entity);				
//			}	
//			Page<CourseEntity> newpage = new PageImpl(newlist);
			return this.buildSuccess(page);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg create(@RequestBody CourseEntity entity) {
		try {
			entity.setDjzt(EnumStatus.初始态.toStringValue());
			service.create(entity, false);			
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg update(@RequestBody CourseEntity entity) {
		try {
			service.update(entity);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody CourseEntity entity) {
		try {
			service.delete(entity);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody String id) {
		try {
			service.deleteByPK(CourseEntity.class, id);			
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg getById(@RequestBody String id) {
		try {
			CourseEntity entity = service.retrieveByPK(CourseEntity.class, id);
			/*//构建子表查询参数
			SearchParams searchParams = new SearchParams();
			searchParams.addCondition("course", id);
			Page<CourseItemEntity> page = subService.retrieveByPage(CourseItemEntity.class, new PageRequest(0,5),searchParams , true);
			entity.setCourse(page.getContent());*/
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}
	
	@RequestMapping(value = "/approved", method = RequestMethod.POST)
	@ResponseBody
	public ResultMsg approved(@RequestBody Map event) {
		try {
			((CourseServiceImpl) service).approved(event);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	@ResponseBody
	public ResultMsg sbumit(@RequestBody String id) {
		try {
			CourseEntity entity = service.retrieveByPK(CourseEntity.class, id);
			if(entity!=null){
				entity.setDjzt(EnumStatus.审批中.toStringValue());
			}
			entity.setStatus(VOStatus.UPDATED);
			service.update(entity);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

}
