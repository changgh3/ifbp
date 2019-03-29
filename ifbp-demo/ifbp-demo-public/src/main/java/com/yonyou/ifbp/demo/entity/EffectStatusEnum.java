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
@Entity(namespace = "ifbp",name = "EffectStatusEnum" )
public class EffectStatusEnum extends MDEnum{
	public EffectStatusEnum(EnumItem enumvalue){
		super(enumvalue);
	}

	
	
	public static final EffectStatusEnum 未生效 = MDEnum.valueOf(EffectStatusEnum.class, String.valueOf("0"));
	
	
	public static final EffectStatusEnum 已生效 = MDEnum.valueOf(EffectStatusEnum.class, String.valueOf("1"));
	

}