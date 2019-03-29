package com.yonyou.ifbp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yonyou.ifbp.base.PageParam;
import com.yonyou.ifbp.persistence.vo.ResultMsg;
import com.yonyou.ifbp.base.BaseController;
import com.yonyou.ifbp.demo.service.TravelAllowanceService;
import com.yonyou.ifbp.demo.entity.TravelAllowanceEntity;

@Controller
@RequestMapping("/travelAllowance")
// 请配置具体的controller路径
public class TravelAllowanceController extends BaseController<TravelAllowanceEntity> {

	@Autowired
	TravelAllowanceService service;

	@Override
	public ResultMsg page(@RequestBody PageParam pageParam) {
		try {
			Page<TravelAllowanceEntity> page = service.retrieveByPage(TravelAllowanceEntity.class,
					pageParam.getPageRequest(), pageParam.getSearchParams(), true);
			return this.buildSuccess(page);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg create(@RequestBody TravelAllowanceEntity entity) {
		try {
			service.create(entity, false);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg update(@RequestBody TravelAllowanceEntity entity) {
		try {
			service.update(entity);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody TravelAllowanceEntity entity) {
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
			service.deleteByPK(TravelAllowanceEntity.class, id);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg getById(@RequestBody String id) {
		try {
			TravelAllowanceEntity entity = service.retrieveByPK(TravelAllowanceEntity.class, null, id, true);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

}
