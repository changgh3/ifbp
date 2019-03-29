package com.yonyou.iuap.students.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.ifbp.persistence.bs.dao.MetadataDAO;
import com.yonyou.ifbp.base.BaseService;
import com.yonyou.iuap.students.service.StudentsService;

@Service
public class StudentsServiceImpl extends BaseService implements StudentsService {

	@Autowired
	MetadataDAO metadataDAO;

	@Override
	public MetadataDAO getMetadataDAO() {
		return metadataDAO;
	}
}
