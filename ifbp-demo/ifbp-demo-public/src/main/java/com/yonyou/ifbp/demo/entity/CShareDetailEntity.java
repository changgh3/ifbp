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
@Entity(namespace = "ifbp",name = "CShareDetailEntity")
@Table(name = "cshare_detail")
public class CShareDetailEntity extends BaseEntity{
	 
    @FK(name = "pk_example", referenceTableName = "bx_header", referencedColumnName = "pk") 
    @Column(name = "pk_example")
    private java.lang.String pk_example;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "pk")
    private java.lang.String pk;
      
    @Column(name = "billno")
    private java.lang.String billno;
      
    @Column(name = "pk_billtype")
    private java.lang.String pk_billtype;
      
    @Column(name = "pk_tradetype")
    private java.lang.String pk_tradetype;
      
    @Column(name = "billstatus")
    private java.lang.String billstatus;
      
    @Column(name = "assume_amount")
    private java.lang.Double assume_amount;
      
    @Column(name = "share_ratio")
    private java.lang.Double share_ratio;
      
    @Column(name = "src_type")
    private java.lang.Integer src_type;
      
    @Column(name = "src_id")
    private java.lang.String src_id;
      
    @Column(name = "bbhl")
    private java.lang.Double bbhl;
      
    @Column(name = "bbje")
    private java.lang.Double bbje;
      
    @Column(name = "globalbbje")
    private java.lang.Double globalbbje;
      
    @Column(name = "groupbbje")
    private java.lang.Double groupbbje;
      
    @Column(name = "globalbbhl")
    private java.lang.Double globalbbhl;
      
    @Column(name = "groupbbhl")
    private java.lang.Double groupbbhl;
      
    @Column(name = "pk_costshare")
    private java.lang.String pk_costshare;
      
    @Column(name = "pk_item")
    private java.lang.String pk_item;
      
    @Column(name = "pk_mtapp_detail")
    private java.lang.String pk_mtapp_detail;
      
    @Column(name = "ysdate")
    private java.util.Date ysdate;
      
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
	 * 属性 billno的Getter方法.属性名：单据编号
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getBillno () {
		return billno;
	}
	   
	/**
	 * 属性billno的Setter方法.属性名：单据编号
	 * 创建日期:2018-6-4
	 * @param newBillno java.lang.String
	 */
	public void setBillno (java.lang.String newBillno ) {
	 	this.billno = newBillno;
	} 	 
	
	/**
	 * 属性 pk_billtype的Getter方法.属性名：单据类型
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_billtype () {
		return pk_billtype;
	}
	   
	/**
	 * 属性pk_billtype的Setter方法.属性名：单据类型
	 * 创建日期:2018-6-4
	 * @param newPk_billtype java.lang.String
	 */
	public void setPk_billtype (java.lang.String newPk_billtype ) {
	 	this.pk_billtype = newPk_billtype;
	} 	 
	
	/**
	 * 属性 pk_tradetype的Getter方法.属性名：交易类型
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_tradetype () {
		return pk_tradetype;
	}
	   
	/**
	 * 属性pk_tradetype的Setter方法.属性名：交易类型
	 * 创建日期:2018-6-4
	 * @param newPk_tradetype java.lang.String
	 */
	public void setPk_tradetype (java.lang.String newPk_tradetype ) {
	 	this.pk_tradetype = newPk_tradetype;
	} 	 
	
	/**
	 * 属性 billstatus的Getter方法.属性名：单据状态
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getBillstatus () {
		return billstatus;
	}
	   
	/**
	 * 属性billstatus的Setter方法.属性名：单据状态
	 * 创建日期:2018-6-4
	 * @param newBillstatus java.lang.String
	 */
	public void setBillstatus (java.lang.String newBillstatus ) {
	 	this.billstatus = newBillstatus;
	} 	 
	
	/**
	 * 属性 assume_amount的Getter方法.属性名：承担金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getAssume_amount () {
		return assume_amount;
	}
	   
	/**
	 * 属性assume_amount的Setter方法.属性名：承担金额
	 * 创建日期:2018-6-4
	 * @param newAssume_amount java.lang.Double
	 */
	public void setAssume_amount (java.lang.Double newAssume_amount ) {
	 	this.assume_amount = newAssume_amount;
	} 	 
	
	/**
	 * 属性 share_ratio的Getter方法.属性名：分摊比例
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getShare_ratio () {
		return share_ratio;
	}
	   
	/**
	 * 属性share_ratio的Setter方法.属性名：分摊比例
	 * 创建日期:2018-6-4
	 * @param newShare_ratio java.lang.Double
	 */
	public void setShare_ratio (java.lang.Double newShare_ratio ) {
	 	this.share_ratio = newShare_ratio;
	} 	 
	
	/**
	 * 属性 src_type的Getter方法.属性名：来源方式
	 *  创建日期:2018-6-4
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getSrc_type () {
		return src_type;
	}
	   
	/**
	 * 属性src_type的Setter方法.属性名：来源方式
	 * 创建日期:2018-6-4
	 * @param newSrc_type java.lang.Integer
	 */
	public void setSrc_type (java.lang.Integer newSrc_type ) {
	 	this.src_type = newSrc_type;
	} 	 
	
	/**
	 * 属性 src_id的Getter方法.属性名：来源单据ID
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getSrc_id () {
		return src_id;
	}
	   
	/**
	 * 属性src_id的Setter方法.属性名：来源单据ID
	 * 创建日期:2018-6-4
	 * @param newSrc_id java.lang.String
	 */
	public void setSrc_id (java.lang.String newSrc_id ) {
	 	this.src_id = newSrc_id;
	} 	 
	
	/**
	 * 属性 bbhl的Getter方法.属性名：组织本币汇率
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getBbhl () {
		return bbhl;
	}
	   
	/**
	 * 属性bbhl的Setter方法.属性名：组织本币汇率
	 * 创建日期:2018-6-4
	 * @param newBbhl java.lang.Double
	 */
	public void setBbhl (java.lang.Double newBbhl ) {
	 	this.bbhl = newBbhl;
	} 	 
	
	/**
	 * 属性 bbje的Getter方法.属性名：组织本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getBbje () {
		return bbje;
	}
	   
	/**
	 * 属性bbje的Setter方法.属性名：组织本币金额
	 * 创建日期:2018-6-4
	 * @param newBbje java.lang.Double
	 */
	public void setBbje (java.lang.Double newBbje ) {
	 	this.bbje = newBbje;
	} 	 
	
	/**
	 * 属性 globalbbje的Getter方法.属性名：全局本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobalbbje () {
		return globalbbje;
	}
	   
	/**
	 * 属性globalbbje的Setter方法.属性名：全局本币金额
	 * 创建日期:2018-6-4
	 * @param newGlobalbbje java.lang.Double
	 */
	public void setGlobalbbje (java.lang.Double newGlobalbbje ) {
	 	this.globalbbje = newGlobalbbje;
	} 	 
	
	/**
	 * 属性 groupbbje的Getter方法.属性名：集团本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getGroupbbje () {
		return groupbbje;
	}
	   
	/**
	 * 属性groupbbje的Setter方法.属性名：集团本币金额
	 * 创建日期:2018-6-4
	 * @param newGroupbbje java.lang.Double
	 */
	public void setGroupbbje (java.lang.Double newGroupbbje ) {
	 	this.groupbbje = newGroupbbje;
	} 	 
	
	/**
	 * 属性 globalbbhl的Getter方法.属性名：全局本币汇率
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobalbbhl () {
		return globalbbhl;
	}
	   
	/**
	 * 属性globalbbhl的Setter方法.属性名：全局本币汇率
	 * 创建日期:2018-6-4
	 * @param newGlobalbbhl java.lang.Double
	 */
	public void setGlobalbbhl (java.lang.Double newGlobalbbhl ) {
	 	this.globalbbhl = newGlobalbbhl;
	} 	 
	
	/**
	 * 属性 groupbbhl的Getter方法.属性名：集团本币汇率
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getGroupbbhl () {
		return groupbbhl;
	}
	   
	/**
	 * 属性groupbbhl的Setter方法.属性名：集团本币汇率
	 * 创建日期:2018-6-4
	 * @param newGroupbbhl java.lang.Double
	 */
	public void setGroupbbhl (java.lang.Double newGroupbbhl ) {
	 	this.groupbbhl = newGroupbbhl;
	} 	 
	
	/**
	 * 属性 pk_costshare的Getter方法.属性名：费用结转单_主键
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_costshare () {
		return pk_costshare;
	}
	   
	/**
	 * 属性pk_costshare的Setter方法.属性名：费用结转单_主键
	 * 创建日期:2018-6-4
	 * @param newPk_costshare java.lang.String
	 */
	public void setPk_costshare (java.lang.String newPk_costshare ) {
	 	this.pk_costshare = newPk_costshare;
	} 	 
	
	/**
	 * 属性 pk_item的Getter方法.属性名：费用申请单
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_item () {
		return pk_item;
	}
	   
	/**
	 * 属性pk_item的Setter方法.属性名：费用申请单
	 * 创建日期:2018-6-4
	 * @param newPk_item java.lang.String
	 */
	public void setPk_item (java.lang.String newPk_item ) {
	 	this.pk_item = newPk_item;
	} 	 
	
	/**
	 * 属性 pk_mtapp_detail的Getter方法.属性名：费用申请明细
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_mtapp_detail () {
		return pk_mtapp_detail;
	}
	   
	/**
	 * 属性pk_mtapp_detail的Setter方法.属性名：费用申请明细
	 * 创建日期:2018-6-4
	 * @param newPk_mtapp_detail java.lang.String
	 */
	public void setPk_mtapp_detail (java.lang.String newPk_mtapp_detail ) {
	 	this.pk_mtapp_detail = newPk_mtapp_detail;
	} 	 
	
	/**
	 * 属性 ysdate的Getter方法.属性名：预算占用日期
	 *  创建日期:2018-6-4
	 * @return java.util.Date
	 */
	public java.util.Date getYsdate () {
		return ysdate;
	}
	   
	/**
	 * 属性ysdate的Setter方法.属性名：预算占用日期
	 * 创建日期:2018-6-4
	 * @param newYsdate java.util.Date
	 */
	public void setYsdate (java.util.Date newYsdate ) {
	 	this.ysdate = newYsdate;
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
        return "CShareDetailEntity";
    }

    @Override
    public String getNamespace() {
        return "ifbp";
    }
}