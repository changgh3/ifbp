package com.yonyou.ifbp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yonyou.ifbp.base.PageParam;
import com.yonyou.ifbp.persistence.vo.ResultMsg;
import com.yonyou.ifbp.base.BaseController;
import com.yonyou.ifbp.demo.service.HotelCostService;
import com.yonyou.ifbp.demo.entity.HotelCostEntity;

@Controller
@RequestMapping("/hotelCost")
// 请配置具体的controller路径
public class HotelCostController extends BaseController<HotelCostEntity> {

	@Autowired
	HotelCostService service;

	@Override
	public ResultMsg page(@RequestBody PageParam pageParam) {
		try {
			Page<HotelCostEntity> page = service.retrieveByPage(HotelCostEntity.class, pageParam.getPageRequest(),
					pageParam.getSearchParams(), true);
			return this.buildSuccess(page);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg create(@RequestBody HotelCostEntity entity) {
		try {
			service.create(entity, false);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg update(@RequestBody HotelCostEntity entity) {
		try {
			service.update(entity);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody HotelCostEntity entity) {
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
			service.deleteByPK(HotelCostEntity.class, id);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg getById(@RequestBody String id) {
		try {
			HotelCostEntity entity = service.retrieveByPK(HotelCostEntity.class, null, id, true);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

}
