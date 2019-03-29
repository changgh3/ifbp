package com.yonyou.ifbp.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.ifbp.persistence.bs.dao.MetadataDAO;
import com.yonyou.ifbp.base.BaseService;
import com.yonyou.ifbp.demo.service.BXTransCostService;

@Service
public class BXTransCostServiceImpl extends BaseService implements BXTransCostService {

	@Autowired
	MetadataDAO metadataDAO;

	@Override
	public MetadataDAO getMetadataDAO() {
		return metadataDAO;
	}
}
