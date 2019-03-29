package com.yonyou.iuap.trainingstudents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yonyou.ifbp.base.PageParam;
import com.yonyou.ifbp.persistence.vo.ResultMsg;
import com.yonyou.ifbp.base.BaseController;
import com.yonyou.iuap.trainingstudents.service.TrainingStudentsService;
import com.yonyou.iuap.trainingstudents.entity.TrainingStudentsEntity;

@Controller
@RequestMapping("/trainingstudents")
// 请配置具体的controller路径
public class TrainingStudentsController extends BaseController<TrainingStudentsEntity> {

	@Autowired
	TrainingStudentsService service;

	@Override
	public ResultMsg page(@RequestBody PageParam pageParam) {
		try {
			Page<TrainingStudentsEntity> page = service.retrieveByPage(TrainingStudentsEntity.class, pageParam.getPageRequest(), pageParam.getSearchParams(), true);
			return this.buildSuccess(page);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg create(@RequestBody TrainingStudentsEntity entity) {
		try {
			service.create(entity, false);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg update(@RequestBody TrainingStudentsEntity entity) {
		try {
			service.update(entity);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody TrainingStudentsEntity entity) {
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
			service.deleteByPK(TrainingStudentsEntity.class, id);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg getById(@RequestBody String id) {
		try {
			TrainingStudentsEntity entity = service.retrieveByPK(TrainingStudentsEntity.class, id);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

}
