package com.yonyou.iuap.trainingteachers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yonyou.ifbp.base.PageParam;
import com.yonyou.ifbp.persistence.vo.ResultMsg;
import com.yonyou.ifbp.base.BaseController;
import com.yonyou.iuap.trainingteachers.service.TrainingTeachersService;
import com.yonyou.iuap.trainingteachers.entity.TrainingTeachersEntity;

@Controller
@RequestMapping("/trainingteachers")
// 请配置具体的controller路径
public class TrainingTeachersController extends BaseController<TrainingTeachersEntity> {

	@Autowired
	TrainingTeachersService service;

	@Override
	public ResultMsg page(@RequestBody PageParam pageParam) {
		try {
			Page<TrainingTeachersEntity> page = service.retrieveByPage(TrainingTeachersEntity.class, pageParam.getPageRequest(), pageParam.getSearchParams(), true);
			return this.buildSuccess(page);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg create(@RequestBody TrainingTeachersEntity entity) {
		try {
			service.create(entity, false);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg update(@RequestBody TrainingTeachersEntity entity) {
		try {
			service.update(entity);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody TrainingTeachersEntity entity) {
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
			service.deleteByPK(TrainingTeachersEntity.class, id);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg getById(@RequestBody String id) {
		try {
			TrainingTeachersEntity entity = service.retrieveByPK(TrainingTeachersEntity.class, id);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

}
