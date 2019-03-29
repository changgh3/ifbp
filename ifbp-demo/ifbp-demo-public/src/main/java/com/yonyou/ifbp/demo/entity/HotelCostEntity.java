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
@Entity(namespace = "ifbp",name = "HotelCostEntity")
@Table(name = "hotel_cost")
public class HotelCostEntity extends BaseEntity{
	 
    @FK(name = "fk_id_hotelcostentity", referenceTableName = "bx_header", referencedColumnName = "pk") 
    @Column(name = "fk_id_hotelcostentity")
    private java.lang.String fk_id_hotelcostentity;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "pk")
    private java.lang.String pk;
      
    @Column(name = "start_date")
    private java.util.Date start_date;
      
    @Column(name = "leave_date")
    private java.util.Date leave_date;
      
    @Column(name = "live_days")
    private java.lang.Integer live_days;
      
    @Column(name = "cost")
    private java.lang.Double cost;
      
    @Column(name = "tax_rate")
    private java.lang.Double tax_rate;
      
    @Column(name = "tax_cost")
    private java.lang.Double tax_cost;
      
    @Column(name = "reimburs_cost")
    private java.lang.Double reimburs_cost;
      
    @Column(name = "invoice_num")
    private java.lang.String invoice_num;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
	

	/**
	 * 属性 fk_id_hotelcostentity的Getter方法.属性名：parentPK
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getFk_id_hotelcostentity () {
		return fk_id_hotelcostentity;
	}
	   
	/**
	 * 属性fk_id_hotelcostentity的Setter方法.属性名：parentPK
	 * 创建日期:2018-6-4
	 * @param newFk_id_hotelcostentity java.lang.String
	 */
	public void setFk_id_hotelcostentity (java.lang.String newFk_id_hotelcostentity ) {
	 	this.fk_id_hotelcostentity = newFk_id_hotelcostentity;
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
	 * 属性 start_date的Getter方法.属性名：入住日期
	 *  创建日期:2018-6-4
	 * @return java.util.Date
	 */
	public java.util.Date getStart_date () {
		return start_date;
	}
	   
	/**
	 * 属性start_date的Setter方法.属性名：入住日期
	 * 创建日期:2018-6-4
	 * @param newStart_date java.util.Date
	 */
	public void setStart_date (java.util.Date newStart_date ) {
	 	this.start_date = newStart_date;
	} 	 
	
	/**
	 * 属性 leave_date的Getter方法.属性名：离店日期
	 *  创建日期:2018-6-4
	 * @return java.util.Date
	 */
	public java.util.Date getLeave_date () {
		return leave_date;
	}
	   
	/**
	 * 属性leave_date的Setter方法.属性名：离店日期
	 * 创建日期:2018-6-4
	 * @param newLeave_date java.util.Date
	 */
	public void setLeave_date (java.util.Date newLeave_date ) {
	 	this.leave_date = newLeave_date;
	} 	 
	
	/**
	 * 属性 live_days的Getter方法.属性名：住宿天数
	 *  创建日期:2018-6-4
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getLive_days () {
		return live_days;
	}
	   
	/**
	 * 属性live_days的Setter方法.属性名：住宿天数
	 * 创建日期:2018-6-4
	 * @param newLive_days java.lang.Integer
	 */
	public void setLive_days (java.lang.Integer newLive_days ) {
	 	this.live_days = newLive_days;
	} 	 
	
	/**
	 * 属性 cost的Getter方法.属性名：住宿金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getCost () {
		return cost;
	}
	   
	/**
	 * 属性cost的Setter方法.属性名：住宿金额
	 * 创建日期:2018-6-4
	 * @param newCost java.lang.Double
	 */
	public void setCost (java.lang.Double newCost ) {
	 	this.cost = newCost;
	} 	 
	
	/**
	 * 属性 tax_rate的Getter方法.属性名：税率
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getTax_rate () {
		return tax_rate;
	}
	   
	/**
	 * 属性tax_rate的Setter方法.属性名：税率
	 * 创建日期:2018-6-4
	 * @param newTax_rate java.lang.Double
	 */
	public void setTax_rate (java.lang.Double newTax_rate ) {
	 	this.tax_rate = newTax_rate;
	} 	 
	
	/**
	 * 属性 tax_cost的Getter方法.属性名：税金
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getTax_cost () {
		return tax_cost;
	}
	   
	/**
	 * 属性tax_cost的Setter方法.属性名：税金
	 * 创建日期:2018-6-4
	 * @param newTax_cost java.lang.Double
	 */
	public void setTax_cost (java.lang.Double newTax_cost ) {
	 	this.tax_cost = newTax_cost;
	} 	 
	
	/**
	 * 属性 reimburs_cost的Getter方法.属性名：报销金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getReimburs_cost () {
		return reimburs_cost;
	}
	   
	/**
	 * 属性reimburs_cost的Setter方法.属性名：报销金额
	 * 创建日期:2018-6-4
	 * @param newReimburs_cost java.lang.Double
	 */
	public void setReimburs_cost (java.lang.Double newReimburs_cost ) {
	 	this.reimburs_cost = newReimburs_cost;
	} 	 
	
	/**
	 * 属性 invoice_num的Getter方法.属性名：发票号码
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getInvoice_num () {
		return invoice_num;
	}
	   
	/**
	 * 属性invoice_num的Setter方法.属性名：发票号码
	 * 创建日期:2018-6-4
	 * @param newInvoice_num java.lang.String
	 */
	public void setInvoice_num (java.lang.String newInvoice_num ) {
	 	this.invoice_num = newInvoice_num;
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
        return "HotelCostEntity";
    }

    @Override
    public String getNamespace() {
        return "ifbp";
    }
}