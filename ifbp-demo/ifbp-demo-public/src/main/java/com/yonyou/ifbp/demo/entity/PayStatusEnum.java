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
@Entity(namespace = "ifbp",name = "PayStatusEnum" )
public class PayStatusEnum extends MDEnum{
	public PayStatusEnum(EnumItem enumvalue){
		super(enumvalue);
	}

	
	
	public static final PayStatusEnum 未支付 = MDEnum.valueOf(PayStatusEnum.class, String.valueOf("1"));
	
	
	public static final PayStatusEnum 支付中 = MDEnum.valueOf(PayStatusEnum.class, String.valueOf("2"));
	
	
	public static final PayStatusEnum 支付完成 = MDEnum.valueOf(PayStatusEnum.class, String.valueOf("3"));
	
	
	public static final PayStatusEnum 支付失败 = MDEnum.valueOf(PayStatusEnum.class, String.valueOf("4"));
	
	
	public static final PayStatusEnum 部分支付完成 = MDEnum.valueOf(PayStatusEnum.class, String.valueOf("20"));
	
	
	public static final PayStatusEnum 手工支付 = MDEnum.valueOf(PayStatusEnum.class, String.valueOf("99"));
	
	
	public static final PayStatusEnum 全额冲销 = MDEnum.valueOf(PayStatusEnum.class, String.valueOf("101"));
	

}