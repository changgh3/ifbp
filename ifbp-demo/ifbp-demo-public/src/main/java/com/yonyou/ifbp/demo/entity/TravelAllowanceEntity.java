package com.yonyou.ifbp.demo.entity;

import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Column;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Entity;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.GeneratedValue;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Id;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.FK;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.OneToMany;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Stragegy;
import com.yonyou.ifbp.persistence.jdbc.framework.annotation.Table;
import com.yonyou.ifbp.persistence.vo.BaseEntity;


/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 *   此处添加类的描述信息
 * </p>
 *  创建日期:2018-6-4
 * @author 
 * @version 
 */
@Entity(namespace = "ifbp",name = "TravelAllowanceEntity")
@Table(name = "travel_allowance")
public class TravelAllowanceEntity extends BaseEntity{
	 
    @FK(name = "pk_example", referenceTableName = "bx_header", referencedColumnName = "pk") 
    @Column(name = "pk_example")
    private java.lang.String pk_example;
      
    @Column(name = "cc_days")
    private java.lang.Integer cc_days;
      
    @Column(name = "subsidies_num")
    private java.lang.Double subsidies_num;
      
    @Column(name = "subsidies_level")
    private java.lang.String subsidies_level;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "pk")
    private java.lang.String pk;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
	

	/**
	 * 属性 pk_example的Getter方法.属性名：parentPK
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_example () {
		return pk_example;
	}
	   
	/**
	 * 属性pk_example的Setter方法.属性名：parentPK
	 * 创建日期:2018-6-4
	 * @param newPk_example java.lang.String
	 */
	public void setPk_example (java.lang.String newPk_example ) {
	 	this.pk_example = newPk_example;
	} 	 
	
	/**
	 * 属性 cc_days的Getter方法.属性名：出差天数
	 *  创建日期:2018-6-4
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getCc_days () {
		return cc_days;
	}
	   
	/**
	 * 属性cc_days的Setter方法.属性名：出差天数
	 * 创建日期:2018-6-4
	 * @param newCc_days java.lang.Integer
	 */
	public void setCc_days (java.lang.Integer newCc_days ) {
	 	this.cc_days = newCc_days;
	} 	 
	
	/**
	 * 属性 subsidies_num的Getter方法.属性名：补助金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getSubsidies_num () {
		return subsidies_num;
	}
	   
	/**
	 * 属性subsidies_num的Setter方法.属性名：补助金额
	 * 创建日期:2018-6-4
	 * @param newSubsidies_num java.lang.Double
	 */
	public void setSubsidies_num (java.lang.Double newSubsidies_num ) {
	 	this.subsidies_num = newSubsidies_num;
	} 	 
	
	/**
	 * 属性 subsidies_level的Getter方法.属性名：补贴标准
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getSubsidies_level () {
		return subsidies_level;
	}
	   
	/**
	 * 属性subsidies_level的Setter方法.属性名：补贴标准
	 * 创建日期:2018-6-4
	 * @param newSubsidies_level java.lang.String
	 */
	public void setSubsidies_level (java.lang.String newSubsidies_level ) {
	 	this.subsidies_level = newSubsidies_level;
	} 	 
	
	/**
	 * 属性 pk的Getter方法.属性名：主键
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk () {
		return pk;
	}
	   
	/**
	 * 属性pk的Setter方法.属性名：主键
	 * 创建日期:2018-6-4
	 * @param newPk java.lang.String
	 */
	public void setPk (java.lang.String newPk ) {
	 	this.pk = newPk;
	} 	 
	
	/**
	 * 属性 dr的Getter方法.属性名：dr
	 *  创建日期:2018-6-4
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}
	   
	/**
	 * 属性dr的Setter方法.属性名：dr
	 * 创建日期:2018-6-4
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	 
	
	/**
	 * 属性 ts的Getter方法.属性名：ts
	 *  创建日期:2018-6-4
	 * @return java.util.Date
	 */
	public java.util.Date getTs () {
		return ts;
	}
	   
	/**
	 * 属性ts的Setter方法.属性名：ts
	 * 创建日期:2018-6-4
	 * @param newTs java.util.Date
	 */
	public void setTs (java.util.Date newTs ) {
	 	this.ts = newTs;
	} 	 
	
    @Override
    public String getMetaDefinedName() {
        return "TravelAllowanceEntity";
    }

    @Override
    public String getNamespace() {
        return "ifbp";
    }
}