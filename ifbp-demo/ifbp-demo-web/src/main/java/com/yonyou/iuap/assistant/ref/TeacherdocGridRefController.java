package com.yonyou.iuap.assistant.ref;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.ifbp.persistence.jdbc.framework.SQLParameter;
import com.yonyou.ifbp.persistence.jdbc.framework.util.FastBeanHelper;
import com.yonyou.ifbp.ref.sdk.refmodel.model.AbstractGridRefModel;
import com.yonyou.ifbp.ref.sdk.refmodel.vo.RefViewModelVO;
import com.yonyou.iuap.teacher.entity.TeacherEntity;
import com.yonyou.iuap.teacher.service.TeacherService;

@RestController
@RequestMapping("teacherdoc/ref/")
public class TeacherdocGridRefController extends AbstractGridRefModel{
	
	@Autowired
	TeacherService teacherService;

	public RefViewModelVO getRefModelInfo(@RequestBody RefViewModelVO refViewModel) {
		super.getRefModelInfo(refViewModel);
		refViewModel.setRefName("教师档案");
		refViewModel.setRootName("教师档案");
		refViewModel.setStrFieldName(new String[]{"编码","名称"});
		refViewModel.setStrFieldCode(new String[]{"refcode","refname"});
		refViewModel.setDefaultFieldCount(5); //显示前几列
		return refViewModel;
	}
	
	@Override
	public List<Map<String, String>> filterRefJSON(@RequestBody RefViewModelVO refViewModelVO) {
		String content = refViewModelVO.getContent();
		String param = refViewModelVO.getTransmitParam();
		String id = null;
		if(StringUtils.isNotBlank(param)){
			JSONObject paramMap = (JSONObject) JSON.parse(param);
			id = String.valueOf(paramMap.get("id"));
		}
		SQLParameter sqlParam = new SQLParameter();
		String sql = "SELECT * from " + FastBeanHelper.getTableName(TeacherEntity.class) +" where 1=1";
		if(StringUtils.isNotBlank(id)){
			sql = sql + " and code =? ";
			sqlParam.addParam(id);
		}
		
		/*if(StringUtils.isNotBlank(content)){
			sql = sql + " and ( address like ? or name like ?) ";
			sqlParam.addParam("%" + content + "%");
			sqlParam.addParam("%" + content + "%");
		}*/
		List<TeacherEntity> list = teacherService.retrieveByClause(TeacherEntity.class, sql, sqlParam, false);
		
		return buildRefDataList(list);
	}

	@Override
	public Map<String, Object> getCommonRefData(@RequestBody RefViewModelVO refViewModelVO) {
		Map<String, Object> results = new HashMap<String, Object>();
		
		String param = refViewModelVO.getTransmitParam();
		String id = null;
		if(StringUtils.isNotBlank(param)){
			JSONObject paramMap = (JSONObject) JSON.parse(param);
			id = String.valueOf(paramMap.get("id"));
		}
		SQLParameter sqlParam = new SQLParameter();
		String sql = "SELECT * from " + FastBeanHelper.getTableName(TeacherEntity.class) +" where 1=1";
		if(StringUtils.isNotBlank(id)){
			sql = sql + " and code =? ";
			sqlParam.addParam(id);
		}
		List<TeacherEntity> list = teacherService.retrieveByClause(TeacherEntity.class, sql, sqlParam, false);
		
		results.put("dataList", buildRefDataList(list));
		results.put("refViewModel", refViewModelVO);
		return results;
	}

	@Override
	public List<Map<String, String>> matchBlurRefJSON(RefViewModelVO arg0) {
		return null;
	}

	@Override
	public List<Map<String, String>> matchPKRefJSON(RefViewModelVO arg0) {
		return null;
	}
	
	private List<Map<String,String>> buildRefDataList(List<TeacherEntity> list){
		List<Map<String,String>> refDataList = new ArrayList<Map<String,String>>();
		if(list!=null){
			for(TeacherEntity teachserdoc : list){
				Map<String,String> aData = new HashMap<String,String>();
				aData.put("id", teachserdoc.getId());
				//aData.put("pid", teachserdoc.get);
				aData.put("refcode", teachserdoc.getCode());
				aData.put("refname", teachserdoc.getName());
/*				aData.put("id", bankdoc.getPk_bankdoc());
				aData.put("pid", bankdoc.getPk_fatherbank());
				aData.put("refcode", bankdoc.getBankcode());
				aData.put("refname", bankdoc.getName());
*/				refDataList.add(aData);
			}
		}
		return refDataList;
	}

}
