package com.yonyou.iuap.testenum.entity;

import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Entity;
import com.yonyou.ifbp.persistence.bs.jdbc.meta.model.MDEnum;
import com.yonyou.ifbp.metadata.spi.EnumItem;
/**
 * <b>此处简要描述此枚举的功能 </b>
 * <p>
 *   此处添加该枚举的描述信息
 * </p>
 *  创建日期:2019-3-14
 * @author 
 * @version 
 */
@Entity(namespace = "TrainMgt-public",name = "TestEnum" )
public class TestEnum extends MDEnum{
	public TestEnum(EnumItem enumvalue){
		super(enumvalue);
	}

	
	
	public static final TestEnum 签到 = MDEnum.valueOf(TestEnum.class, String.valueOf("1"));
	
	
	public static final TestEnum 问答 = MDEnum.valueOf(TestEnum.class, String.valueOf("2"));
	
	
	public static final TestEnum 临时测试 = MDEnum.valueOf(TestEnum.class, String.valueOf("3"));
	
	
	public static final TestEnum 期末测试 = MDEnum.valueOf(TestEnum.class, String.valueOf("4"));
	

}