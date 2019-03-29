package com.yonyou.ifbp.demo.entity;

import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Entity;
import com.yonyou.ifbp.persistence.bs.jdbc.meta.model.MDEnum;
import com.yonyou.ifbp.metadata.spi.EnumItem;
/**
 * <b>此处简要描述此枚举的功能 </b>
 * <p>
 *   此处添加该枚举的描述信息
 * </p>
 *  创建日期:2018-5-29
 * @author 
 * @version 
 */
@Entity(namespace = "ifbp",name = "BillStatusEnum" )
public class BillStatusEnum extends MDEnum{
	public BillStatusEnum(EnumItem enumvalue){
		super(enumvalue);
	}

	
	
	public static final BillStatusEnum 暂存 = MDEnum.valueOf(BillStatusEnum.class, String.valueOf("0"));
	
	
	public static final BillStatusEnum 保存 = MDEnum.valueOf(BillStatusEnum.class, String.valueOf("1"));
	
	
	public static final BillStatusEnum 审核 = MDEnum.valueOf(BillStatusEnum.class, String.valueOf("2"));
	
	
	public static final BillStatusEnum 签字 = MDEnum.valueOf(BillStatusEnum.class, String.valueOf("3"));
	
	
	public static final BillStatusEnum 作废 = MDEnum.valueOf(BillStatusEnum.class, String.valueOf("-1"));
	

}