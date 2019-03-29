package com.yonyou.iuap.enumeration.entity;

import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Entity;
import com.yonyou.ifbp.persistence.bs.jdbc.meta.model.MDEnum;
import com.yonyou.ifbp.metadata.spi.EnumItem;
/**
 * <b>此处简要描述此枚举的功能 </b>
 * <p>
 *   此处添加该枚举的描述信息
 * </p>
 *  创建日期:2019-3-27
 * @author 
 * @version 
 */
@Entity(namespace = "TrainMgt-public",name = "EnumStatus" )
public class EnumStatus extends MDEnum{
	public EnumStatus(EnumItem enumvalue){
		super(enumvalue);
	}

	
	
	
	
	public static final EnumStatus 审批失败 = MDEnum.valueOf(EnumStatus.class, String.valueOf("-1"));
	
	
	public static final EnumStatus 初始态 = MDEnum.valueOf(EnumStatus.class, String.valueOf("0"));
	
	
	public static final EnumStatus 已提交 = MDEnum.valueOf(EnumStatus.class, String.valueOf("1"));
	
	
	public static final EnumStatus 审批中 = MDEnum.valueOf(EnumStatus.class, String.valueOf("2"));
	
	
	public static final EnumStatus 审批通过 = MDEnum.valueOf(EnumStatus.class, String.valueOf("3"));
	

}