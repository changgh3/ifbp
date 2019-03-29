package com.yonyou.iuap.achievement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yonyou.ifbp.base.PageParam;
import com.yonyou.ifbp.persistence.vo.ResultMsg;
import com.yonyou.ifbp.base.BaseController;
import com.yonyou.iuap.achievement.service.AchievementService;
import com.yonyou.iuap.achievement.entity.AchievementEntity;

@Controller
@RequestMapping("/achievement")
// 请配置具体的controller路径
public class AchievementController extends BaseController<AchievementEntity> {

	@Autowired
	AchievementService service;

	@Override
	public ResultMsg page(@RequestBody PageParam pageParam) {
		try {
			Page<AchievementEntity> page = service.retrieveByPage(AchievementEntity.class, pageParam.getPageRequest(), pageParam.getSearchParams(), true);
			return this.buildSuccess(page);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg create(@RequestBody AchievementEntity entity) {
		try {
			service.create(entity, false);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg update(@RequestBody AchievementEntity entity) {
		try {
			service.update(entity);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg delete(@RequestBody AchievementEntity entity) {
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
			service.deleteByPK(AchievementEntity.class, id);
			return this.buildSuccess();
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

	@Override
	public ResultMsg getById(@RequestBody String id) {
		try {
			AchievementEntity entity = service.retrieveByPK(AchievementEntity.class, id);
			return this.buildSuccess(entity);
		} catch (Exception e) {
			return this.buildError(e.getMessage());
		}
	}

}
