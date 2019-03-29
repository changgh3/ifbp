package com.yonyou.iuap.students.enumulation;

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
@Entity(namespace = "TrainMgt-public",name = "StudentTypeEnum" )
public class StudentTypeEnum extends MDEnum{
	public StudentTypeEnum(EnumItem enumvalue){
		super(enumvalue);
	}

	
	
	public static final StudentTypeEnum 在校学生 = MDEnum.valueOf(StudentTypeEnum.class, String.valueOf("1"));
	
	
	public static final StudentTypeEnum 开发 = MDEnum.valueOf(StudentTypeEnum.class, String.valueOf("2"));
	
	
	public static final StudentTypeEnum 测试 = MDEnum.valueOf(StudentTypeEnum.class, String.valueOf("3"));
	
	
	public static final StudentTypeEnum 需求 = MDEnum.valueOf(StudentTypeEnum.class, String.valueOf("4"));
	
	
	public static final StudentTypeEnum 实施 = MDEnum.valueOf(StudentTypeEnum.class, String.valueOf("5"));
	
	
	public static final StudentTypeEnum 二次开发 = MDEnum.valueOf(StudentTypeEnum.class, String.valueOf("6"));
	
	
	public static final StudentTypeEnum 咨询 = MDEnum.valueOf(StudentTypeEnum.class, String.valueOf("7"));
	
	
	public static final StudentTypeEnum 不明确 = MDEnum.valueOf(StudentTypeEnum.class, String.valueOf("8"));
	

}