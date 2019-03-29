package com.yonyou.iuap.training.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.ifbp.persistence.bs.dao.MetadataDAO;
import com.yonyou.ifbp.base.BaseService;
import com.yonyou.iuap.training.service.TrainingService;

@Service
public class TrainingServiceImpl extends BaseService implements TrainingService {

	@Autowired
	MetadataDAO metadataDAO;

	@Override
	public MetadataDAO getMetadataDAO() {
		return metadataDAO;
	}
}
