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
@Entity(namespace = "ifbp",name = "AccruedVerifyEntity")
@Table(name = "accrued_verify")
public class AccruedVerifyEntity extends BaseEntity{
	 
    @FK(name = "pk_example", referenceTableName = "bx_header", referencedColumnName = "pk") 
    @Column(name = "pk_example")
    private java.lang.String pk_example;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "pk")
    private java.lang.String pk;
      
    @Column(name = "pk_accrued_bill")
    private java.lang.String pk_accrued_bill;
      
    @Column(name = "pk_accrued_detail")
    private java.lang.String pk_accrued_detail;
      
    @Column(name = "verify_amount")
    private java.lang.Double verify_amount;
      
    @Column(name = "org_verify_amount")
    private java.lang.Double org_verify_amount;
      
    @Column(name = "group_verify_amount")
    private java.lang.Double group_verify_amount;
      
    @Column(name = "global_verify_amount")
    private java.lang.Double global_verify_amount;
      
    @Column(name = "verify_date")
    private java.util.Date verify_date;
      
    @Column(name = "effectstatus")
    private java.lang.Integer effectstatus;
      
    @Column(name = "effectdate")
    private java.util.Date effectdate;
      
    @Column(name = "accrued_billno")
    private java.lang.String accrued_billno;
      
    @Column(name = "bxd_billno")
    private java.lang.String bxd_billno;
      
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
	 * 属性 pk的Getter方法.属性名：唯一标识
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk () {
		return pk;
	}
	   
	/**
	 * 属性pk的Setter方法.属性名：唯一标识
	 * 创建日期:2018-6-4
	 * @param newPk java.lang.String
	 */
	public void setPk (java.lang.String newPk ) {
	 	this.pk = newPk;
	} 	 
	
	/**
	 * 属性 pk_accrued_bill的Getter方法.属性名：预提单
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_accrued_bill () {
		return pk_accrued_bill;
	}
	   
	/**
	 * 属性pk_accrued_bill的Setter方法.属性名：预提单
	 * 创建日期:2018-6-4
	 * @param newPk_accrued_bill java.lang.String
	 */
	public void setPk_accrued_bill (java.lang.String newPk_accrued_bill ) {
	 	this.pk_accrued_bill = newPk_accrued_bill;
	} 	 
	
	/**
	 * 属性 pk_accrued_detail的Getter方法.属性名：预提明细行
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_accrued_detail () {
		return pk_accrued_detail;
	}
	   
	/**
	 * 属性pk_accrued_detail的Setter方法.属性名：预提明细行
	 * 创建日期:2018-6-4
	 * @param newPk_accrued_detail java.lang.String
	 */
	public void setPk_accrued_detail (java.lang.String newPk_accrued_detail ) {
	 	this.pk_accrued_detail = newPk_accrued_detail;
	} 	 
	
	/**
	 * 属性 verify_amount的Getter方法.属性名：核销金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getVerify_amount () {
		return verify_amount;
	}
	   
	/**
	 * 属性verify_amount的Setter方法.属性名：核销金额
	 * 创建日期:2018-6-4
	 * @param newVerify_amount java.lang.Double
	 */
	public void setVerify_amount (java.lang.Double newVerify_amount ) {
	 	this.verify_amount = newVerify_amount;
	} 	 
	
	/**
	 * 属性 org_verify_amount的Getter方法.属性名：组织本币核销金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getOrg_verify_amount () {
		return org_verify_amount;
	}
	   
	/**
	 * 属性org_verify_amount的Setter方法.属性名：组织本币核销金额
	 * 创建日期:2018-6-4
	 * @param newOrg_verify_amount java.lang.Double
	 */
	public void setOrg_verify_amount (java.lang.Double newOrg_verify_amount ) {
	 	this.org_verify_amount = newOrg_verify_amount;
	} 	 
	
	/**
	 * 属性 group_verify_amount的Getter方法.属性名：集团本币核销金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getGroup_verify_amount () {
		return group_verify_amount;
	}
	   
	/**
	 * 属性group_verify_amount的Setter方法.属性名：集团本币核销金额
	 * 创建日期:2018-6-4
	 * @param newGroup_verify_amount java.lang.Double
	 */
	public void setGroup_verify_amount (java.lang.Double newGroup_verify_amount ) {
	 	this.group_verify_amount = newGroup_verify_amount;
	} 	 
	
	/**
	 * 属性 global_verify_amount的Getter方法.属性名：全局本币核销金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobal_verify_amount () {
		return global_verify_amount;
	}
	   
	/**
	 * 属性global_verify_amount的Setter方法.属性名：全局本币核销金额
	 * 创建日期:2018-6-4
	 * @param newGlobal_verify_amount java.lang.Double
	 */
	public void setGlobal_verify_amount (java.lang.Double newGlobal_verify_amount ) {
	 	this.global_verify_amount = newGlobal_verify_amount;
	} 	 
	
	/**
	 * 属性 verify_date的Getter方法.属性名：核销日期
	 *  创建日期:2018-6-4
	 * @return java.util.Date
	 */
	public java.util.Date getVerify_date () {
		return verify_date;
	}
	   
	/**
	 * 属性verify_date的Setter方法.属性名：核销日期
	 * 创建日期:2018-6-4
	 * @param newVerify_date java.util.Date
	 */
	public void setVerify_date (java.util.Date newVerify_date ) {
	 	this.verify_date = newVerify_date;
	} 	 
	
	/**
	 * 属性 effectstatus的Getter方法.属性名：生效状态
	 *  创建日期:2018-6-4
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getEffectstatus () {
		return effectstatus;
	}
	   
	/**
	 * 属性effectstatus的Setter方法.属性名：生效状态
	 * 创建日期:2018-6-4
	 * @param newEffectstatus java.lang.Integer
	 */
	public void setEffectstatus (java.lang.Integer newEffectstatus ) {
	 	this.effectstatus = newEffectstatus;
	} 	 
	
	/**
	 * 属性 effectdate的Getter方法.属性名：生效日期
	 *  创建日期:2018-6-4
	 * @return java.util.Date
	 */
	public java.util.Date getEffectdate () {
		return effectdate;
	}
	   
	/**
	 * 属性effectdate的Setter方法.属性名：生效日期
	 * 创建日期:2018-6-4
	 * @param newEffectdate java.util.Date
	 */
	public void setEffectdate (java.util.Date newEffectdate ) {
	 	this.effectdate = newEffectdate;
	} 	 
	
	/**
	 * 属性 accrued_billno的Getter方法.属性名：预提单据编号
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getAccrued_billno () {
		return accrued_billno;
	}
	   
	/**
	 * 属性accrued_billno的Setter方法.属性名：预提单据编号
	 * 创建日期:2018-6-4
	 * @param newAccrued_billno java.lang.String
	 */
	public void setAccrued_billno (java.lang.String newAccrued_billno ) {
	 	this.accrued_billno = newAccrued_billno;
	} 	 
	
	/**
	 * 属性 bxd_billno的Getter方法.属性名：报销单据编号
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getBxd_billno () {
		return bxd_billno;
	}
	   
	/**
	 * 属性bxd_billno的Setter方法.属性名：报销单据编号
	 * 创建日期:2018-6-4
	 * @param newBxd_billno java.lang.String
	 */
	public void setBxd_billno (java.lang.String newBxd_billno ) {
	 	this.bxd_billno = newBxd_billno;
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
        return "AccruedVerifyEntity";
    }

    @Override
    public String getNamespace() {
        return "ifbp";
    }
}