package com.yonyou.ifbp.demo.entity;

import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Entity;
import com.yonyou.ifbp.persistence.bs.jdbc.meta.model.MDEnum;
import com.yonyou.ifbp.metadata.spi.EnumItem;
/**
 * <b>此处简要描述此枚举的功能 </b>
 * <p>
 *   此处添加该枚举的描述信息
 * </p>
 *  创建日期:2018-6-4
 * @author 
 * @version 
 */
@Entity(namespace = "ifbp",name = "AuditStatusEnum" )
public class VoucherStatusEnum extends MDEnum{
	public VoucherStatusEnum(EnumItem enumvalue){
		super(enumvalue);
	}

	
	
	public static final VoucherStatusEnum 初始态 = MDEnum.valueOf(VoucherStatusEnum.class, String.valueOf("-1"));
	
	
	public static final VoucherStatusEnum 审批中 = MDEnum.valueOf(VoucherStatusEnum.class, String.valueOf("2"));
	
	
	public static final VoucherStatusEnum 审批通过 = MDEnum.valueOf(VoucherStatusEnum.class, String.valueOf("1"));
	
	
	public static final VoucherStatusEnum 审批未通过 = MDEnum.valueOf(VoucherStatusEnum.class, String.valueOf("0"));
	
	
	public static final VoucherStatusEnum 提交态 = MDEnum.valueOf(VoucherStatusEnum.class, String.valueOf("3"));
	

}