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
@Entity(namespace = "ifbp",name = "BXBusItemEntity")
@Table(name = "bx_bus_item")
public class BXBusItemEntity extends BaseEntity{
	 
    @FK(name = "pk_example", referenceTableName = "bx_header", referencedColumnName = "pk") 
    @Column(name = "pk_example")
    private java.lang.String pk_example;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "pk")
    private java.lang.String pk;
      
    @Column(name = "pk_jkbx")
    private java.lang.String pk_jkbx;
      
    @Column(name = "tablecode")
    private java.lang.String tablecode;
      
    @Column(name = "amount")
    private java.math.BigDecimal amount;
      
    @Column(name = "rowno")
    private java.lang.Integer rowno;
      
    @Column(name = "ybje")
    private java.math.BigDecimal ybje;
      
    @Column(name = "bbje")
    private java.math.BigDecimal bbje;
      
    @Column(name = "hkybje")
    private java.math.BigDecimal hkybje;
      
    @Column(name = "hkbbje")
    private java.math.BigDecimal hkbbje;
      
    @Column(name = "zfybje")
    private java.math.BigDecimal zfybje;
      
    @Column(name = "zfbbje")
    private java.math.BigDecimal zfbbje;
      
    @Column(name = "cjkybje")
    private java.math.BigDecimal cjkybje;
      
    @Column(name = "cjkbbje")
    private java.math.BigDecimal cjkbbje;
      
    @Column(name = "groupbbje")
    private java.math.BigDecimal groupbbje;
      
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
	 * 属性 pk的Getter方法.属性名：报销单业务行标识
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk () {
		return pk;
	}
	   
	/**
	 * 属性pk的Setter方法.属性名：报销单业务行标识
	 * 创建日期:2018-6-4
	 * @param newPk java.lang.String
	 */
	public void setPk (java.lang.String newPk ) {
	 	this.pk = newPk;
	} 	 
	
	/**
	 * 属性 pk_jkbx的Getter方法.属性名：报销单标识
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_jkbx () {
		return pk_jkbx;
	}
	   
	/**
	 * 属性pk_jkbx的Setter方法.属性名：报销单标识
	 * 创建日期:2018-6-4
	 * @param newPk_jkbx java.lang.String
	 */
	public void setPk_jkbx (java.lang.String newPk_jkbx ) {
	 	this.pk_jkbx = newPk_jkbx;
	} 	 
	
	/**
	 * 属性 tablecode的Getter方法.属性名：页签编码
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getTablecode () {
		return tablecode;
	}
	   
	/**
	 * 属性tablecode的Setter方法.属性名：页签编码
	 * 创建日期:2018-6-4
	 * @param newTablecode java.lang.String
	 */
	public void setTablecode (java.lang.String newTablecode ) {
	 	this.tablecode = newTablecode;
	} 	 
	
	/**
	 * 属性 amount的Getter方法.属性名：金额
	 *  创建日期:2018-6-4
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getAmount () {
		return amount;
	}
	   
	/**
	 * 属性amount的Setter方法.属性名：金额
	 * 创建日期:2018-6-4
	 * @param newAmount java.math.BigDecimal
	 */
	public void setAmount (java.math.BigDecimal newAmount ) {
	 	this.amount = newAmount;
	} 	 
	
	/**
	 * 属性 rowno的Getter方法.属性名：行号
	 *  创建日期:2018-6-4
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getRowno () {
		return rowno;
	}
	   
	/**
	 * 属性rowno的Setter方法.属性名：行号
	 * 创建日期:2018-6-4
	 * @param newRowno java.lang.Integer
	 */
	public void setRowno (java.lang.Integer newRowno ) {
	 	this.rowno = newRowno;
	} 	 
	
	/**
	 * 属性 ybje的Getter方法.属性名：原币金额
	 *  创建日期:2018-6-4
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getYbje () {
		return ybje;
	}
	   
	/**
	 * 属性ybje的Setter方法.属性名：原币金额
	 * 创建日期:2018-6-4
	 * @param newYbje java.math.BigDecimal
	 */
	public void setYbje (java.math.BigDecimal newYbje ) {
	 	this.ybje = newYbje;
	} 	 
	
	/**
	 * 属性 bbje的Getter方法.属性名：本币金额
	 *  创建日期:2018-6-4
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getBbje () {
		return bbje;
	}
	   
	/**
	 * 属性bbje的Setter方法.属性名：本币金额
	 * 创建日期:2018-6-4
	 * @param newBbje java.math.BigDecimal
	 */
	public void setBbje (java.math.BigDecimal newBbje ) {
	 	this.bbje = newBbje;
	} 	 
	
	/**
	 * 属性 hkybje的Getter方法.属性名：还款金额
	 *  创建日期:2018-6-4
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getHkybje () {
		return hkybje;
	}
	   
	/**
	 * 属性hkybje的Setter方法.属性名：还款金额
	 * 创建日期:2018-6-4
	 * @param newHkybje java.math.BigDecimal
	 */
	public void setHkybje (java.math.BigDecimal newHkybje ) {
	 	this.hkybje = newHkybje;
	} 	 
	
	/**
	 * 属性 hkbbje的Getter方法.属性名：还款本币金额
	 *  创建日期:2018-6-4
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getHkbbje () {
		return hkbbje;
	}
	   
	/**
	 * 属性hkbbje的Setter方法.属性名：还款本币金额
	 * 创建日期:2018-6-4
	 * @param newHkbbje java.math.BigDecimal
	 */
	public void setHkbbje (java.math.BigDecimal newHkbbje ) {
	 	this.hkbbje = newHkbbje;
	} 	 
	
	/**
	 * 属性 zfybje的Getter方法.属性名：支付金额
	 *  创建日期:2018-6-4
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getZfybje () {
		return zfybje;
	}
	   
	/**
	 * 属性zfybje的Setter方法.属性名：支付金额
	 * 创建日期:2018-6-4
	 * @param newZfybje java.math.BigDecimal
	 */
	public void setZfybje (java.math.BigDecimal newZfybje ) {
	 	this.zfybje = newZfybje;
	} 	 
	
	/**
	 * 属性 zfbbje的Getter方法.属性名：支付本币金额
	 *  创建日期:2018-6-4
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getZfbbje () {
		return zfbbje;
	}
	   
	/**
	 * 属性zfbbje的Setter方法.属性名：支付本币金额
	 * 创建日期:2018-6-4
	 * @param newZfbbje java.math.BigDecimal
	 */
	public void setZfbbje (java.math.BigDecimal newZfbbje ) {
	 	this.zfbbje = newZfbbje;
	} 	 
	
	/**
	 * 属性 cjkybje的Getter方法.属性名：冲借款金额
	 *  创建日期:2018-6-4
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getCjkybje () {
		return cjkybje;
	}
	   
	/**
	 * 属性cjkybje的Setter方法.属性名：冲借款金额
	 * 创建日期:2018-6-4
	 * @param newCjkybje java.math.BigDecimal
	 */
	public void setCjkybje (java.math.BigDecimal newCjkybje ) {
	 	this.cjkybje = newCjkybje;
	} 	 
	
	/**
	 * 属性 cjkbbje的Getter方法.属性名：冲借款本币金额
	 *  创建日期:2018-6-4
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getCjkbbje () {
		return cjkbbje;
	}
	   
	/**
	 * 属性cjkbbje的Setter方法.属性名：冲借款本币金额
	 * 创建日期:2018-6-4
	 * @param newCjkbbje java.math.BigDecimal
	 */
	public void setCjkbbje (java.math.BigDecimal newCjkbbje ) {
	 	this.cjkbbje = newCjkbbje;
	} 	 
	
	/**
	 * 属性 groupbbje的Getter方法.属性名：集团还款本币金额
	 *  创建日期:2018-6-4
	 * @return java.math.BigDecimal
	 */
	public java.math.BigDecimal getGroupbbje () {
		return groupbbje;
	}
	   
	/**
	 * 属性groupbbje的Setter方法.属性名：集团还款本币金额
	 * 创建日期:2018-6-4
	 * @param newGroupbbje java.math.BigDecimal
	 */
	public void setGroupbbje (java.math.BigDecimal newGroupbbje ) {
	 	this.groupbbje = newGroupbbje;
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
        return "BXBusItemEntity";
    }

    @Override
    public String getNamespace() {
        return "ifbp";
    }
}