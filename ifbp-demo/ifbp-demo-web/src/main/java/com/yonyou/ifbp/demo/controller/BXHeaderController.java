package com.yonyou.ifbp.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yonyou.ifbp.base.PageParam;
import com.yonyou.ifbp.persistence.vo.ResultMsg;
import com.yonyou.ifbp.persistence.vo.pub.VOStatus;
import com.yonyou.ifbp.base.BaseController;
import com.yonyou.ifbp.demo.service.BXHeaderService;
import com.yonyou.ifbp.demo.entity.BXHeaderEntity;
import com.yonyou.ifbp.demo.entity.VoucherStatusEnum;

@Controller
@RequestMapping("/BXHeader")
// 请配置具体的controller路径
public class BXHeaderController extends BaseController<BXHeaderEntity> {

	@Autowired
	BXHeaderService service;

	@Override
	public ResultMsg page(@RequestBody PageParam pageParam) {
		try {
			Page<BXHeaderEntity> page = service.retrieveByPage(BXHeaderEntity.class, pageParam.getPageRequest(),
					pageParam.getSearchParams(), true);
			return this.buildSuccess(page);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg create(@RequestBody BXHeaderEntity entity) {
		try {
			String pk_billtype = entity.getPk_billtype();
			if (pk_billtype == null || "".equals(pk_billtype)) {
				entity.setPk_billtype("差旅费报销单");
			}
			entity.setSpzt(VoucherStatusEnum.初始态.toStringValue());
			service.create(entity, false);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg update(@RequestBody BXHeaderEntity entity) {
		try {
			if(entity.getSpzt() == null){
				entity.setSpzt(VoucherStatusEnum.初始态.toStringValue());
			}
			service.update(entity);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody BXHeaderEntity entity) {
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
			service.deleteByPK(BXHeaderEntity.class, id);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg getById(@RequestBody String id) {
		try {
			BXHeaderEntity entity = service.retrieveByPK(BXHeaderEntity.class, null, id, true);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}
	
	@RequestMapping(value = "/Approved", method = RequestMethod.POST)
	@ResponseBody
	public ResultMsg Approved(@RequestBody Map event) {
		try {
			service.Approved(event);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	@ResponseBody
	public ResultMsg sbumit(@RequestBody String id) {
		try {
			BXHeaderEntity entity = service.retrieveByPK(BXHeaderEntity.class, id);
			if(entity!=null){
				entity.setSpzt(VoucherStatusEnum.审批中.toStringValue());
			}
			entity.setStatus(VOStatus.UPDATED);
			service.update(entity);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

}
