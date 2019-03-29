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
@Entity(namespace = "ifbp",name = "BXTransCostEntity")
@Table(name = "bxtrans_cost")
public class BXTransCostEntity extends BaseEntity{
	 
    @FK(name = "pk_example", referenceTableName = "bx_header", referencedColumnName = "pk") 
    @Column(name = "pk_example")
    private java.lang.String pk_example;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "pk")
    private java.lang.String pk;
      
    @Column(name = "start_date")
    private java.util.Date start_date;
      
    @Column(name = "arriv_date")
    private java.util.Date arriv_date;
      
    @Column(name = "start_place")
    private java.lang.String start_place;
      
    @Column(name = "destination")
    private java.lang.String destination;
      
    @Column(name = "transporation")
    private java.lang.String transporation;
      
    @Column(name = "cost")
    private java.lang.Double cost;
      
    @Column(name = "bxr_gropu")
    private java.lang.String bxr_gropu;
      
    @Column(name = "bxr_department")
    private java.lang.String bxr_department;
      
    @Column(name = "cc_days")
    private java.lang.Integer cc_days;
      
    @Column(name = "other_cost")
    private java.lang.Double other_cost;
      
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
	 * 属性 start_date的Getter方法.属性名：开始日期
	 *  创建日期:2018-6-4
	 * @return java.util.Date
	 */
	public java.util.Date getStart_date () {
		return start_date;
	}
	   
	/**
	 * 属性start_date的Setter方法.属性名：开始日期
	 * 创建日期:2018-6-4
	 * @param newStart_date java.util.Date
	 */
	public void setStart_date (java.util.Date newStart_date ) {
	 	this.start_date = newStart_date;
	} 	 
	
	/**
	 * 属性 arriv_date的Getter方法.属性名：到达日期
	 *  创建日期:2018-6-4
	 * @return java.util.Date
	 */
	public java.util.Date getArriv_date () {
		return arriv_date;
	}
	   
	/**
	 * 属性arriv_date的Setter方法.属性名：到达日期
	 * 创建日期:2018-6-4
	 * @param newArriv_date java.util.Date
	 */
	public void setArriv_date (java.util.Date newArriv_date ) {
	 	this.arriv_date = newArriv_date;
	} 	 
	
	/**
	 * 属性 start_place的Getter方法.属性名：出发地
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getStart_place () {
		return start_place;
	}
	   
	/**
	 * 属性start_place的Setter方法.属性名：出发地
	 * 创建日期:2018-6-4
	 * @param newStart_place java.lang.String
	 */
	public void setStart_place (java.lang.String newStart_place ) {
	 	this.start_place = newStart_place;
	} 	 
	
	/**
	 * 属性 destination的Getter方法.属性名：目的地
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getDestination () {
		return destination;
	}
	   
	/**
	 * 属性destination的Setter方法.属性名：目的地
	 * 创建日期:2018-6-4
	 * @param newDestination java.lang.String
	 */
	public void setDestination (java.lang.String newDestination ) {
	 	this.destination = newDestination;
	} 	 
	
	/**
	 * 属性 transporation的Getter方法.属性名：交通工具
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getTransporation () {
		return transporation;
	}
	   
	/**
	 * 属性transporation的Setter方法.属性名：交通工具
	 * 创建日期:2018-6-4
	 * @param newTransporation java.lang.String
	 */
	public void setTransporation (java.lang.String newTransporation ) {
	 	this.transporation = newTransporation;
	} 	 
	
	/**
	 * 属性 cost的Getter方法.属性名：费用
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getCost () {
		return cost;
	}
	   
	/**
	 * 属性cost的Setter方法.属性名：费用
	 * 创建日期:2018-6-4
	 * @param newCost java.lang.Double
	 */
	public void setCost (java.lang.Double newCost ) {
	 	this.cost = newCost;
	} 	 
	
	/**
	 * 属性 bxr_gropu的Getter方法.属性名：报销人单位
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getBxr_gropu () {
		return bxr_gropu;
	}
	   
	/**
	 * 属性bxr_gropu的Setter方法.属性名：报销人单位
	 * 创建日期:2018-6-4
	 * @param newBxr_gropu java.lang.String
	 */
	public void setBxr_gropu (java.lang.String newBxr_gropu ) {
	 	this.bxr_gropu = newBxr_gropu;
	} 	 
	
	/**
	 * 属性 bxr_department的Getter方法.属性名：报销人部门
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getBxr_department () {
		return bxr_department;
	}
	   
	/**
	 * 属性bxr_department的Setter方法.属性名：报销人部门
	 * 创建日期:2018-6-4
	 * @param newBxr_department java.lang.String
	 */
	public void setBxr_department (java.lang.String newBxr_department ) {
	 	this.bxr_department = newBxr_department;
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
	 * 属性 other_cost的Getter方法.属性名：其他金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getOther_cost () {
		return other_cost;
	}
	   
	/**
	 * 属性other_cost的Setter方法.属性名：其他金额
	 * 创建日期:2018-6-4
	 * @param newOther_cost java.lang.Double
	 */
	public void setOther_cost (java.lang.Double newOther_cost ) {
	 	this.other_cost = newOther_cost;
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
        return "BXTransCostEntity";
    }

    @Override
    public String getNamespace() {
        return "ifbp";
    }
}