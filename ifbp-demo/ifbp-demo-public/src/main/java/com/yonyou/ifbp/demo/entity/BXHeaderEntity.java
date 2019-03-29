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
 *  创建日期:2018-6-5
 * @author 
 * @version 
 */
@Entity(namespace = "ifbp",name = "BXHeaderEntity")
@Table(name = "bx_header")
public class BXHeaderEntity extends BaseEntity{
	
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "pk")
    private java.lang.String pk;
      
    @Column(name = "pk_org")
    private java.lang.String pk_org;
      
    @Column(name = "pk_org_v")
    private java.lang.String pk_org_v;
      
    @Column(name = "pk_group")
    private java.lang.String pk_group;
      
    @Column(name = "pk_fiorg")
    private java.lang.String pk_fiorg;
      
    @Column(name = "iscostshare")
    private java.lang.Boolean iscostshare;
      
    @Column(name = "isexpamt")
    private java.lang.Boolean isexpamt;
      
    @Column(name = "pk_pcorg")
    private java.lang.String pk_pcorg;
      
    @Column(name = "pk_pcorg_v")
    private java.lang.String pk_pcorg_v;
      
    @Column(name = "total_period")
    private java.lang.Integer total_period;
      
    @Column(name = "reimrule")
    private java.lang.String reimrule;
      
    @Column(name = "mngaccid")
    private java.lang.String mngaccid;
      
    @Column(name = "total")
    private java.lang.Double total;
      
    @Column(name = "paydate")
    private java.lang.String paydate;
      
    @Column(name = "payman")
    private java.lang.String payman;
      
    @Column(name = "payflag")
    private java.lang.Boolean payflag;
      
    @Column(name = "fydwbm")
    private java.lang.String fydwbm;
      
    @Column(name = "fydwbm_v")
    private java.lang.String fydwbm_v;
      
    @Column(name = "dwbm")
    private java.lang.String dwbm;
      
    @Column(name = "dwbm_v")
    private java.lang.String dwbm_v;
      
    @Column(name = "djdl")
    private java.lang.String djdl;
      
    @Column(name = "djlxbm")
    private java.lang.String djlxbm;
      
    @Column(name = "pk_billtype")
    private java.lang.String pk_billtype;
      
    @Column(name = "djbh")
    private java.lang.String djbh;
      
    @Column(name = "djrq")
    private java.util.Date djrq;
      
    @Column(name = "sprq")
    private java.lang.String sprq;
      
    @Column(name = "jsrq")
    private java.lang.String jsrq;
      
    @Column(name = "deptid")
    private java.lang.String deptid;
      
    @Column(name = "deptid_v")
    private java.lang.String deptid_v;
      
    @Column(name = "receiver")
    private java.lang.String receiver;
      
    @Column(name = "jkbxr")
    private java.lang.String jkbxr;
      
    @Column(name = "operator")
    private java.lang.String operator;
      
    @Column(name = "approver")
    private java.lang.String approver;
      
    @Column(name = "modifier")
    private java.lang.String modifier;
      
    @Column(name = "pjh")
    private java.lang.String pjh;
      
    @Column(name = "skyhzh")
    private java.lang.String skyhzh;
      
    @Column(name = "fkyhzh")
    private java.lang.String fkyhzh;
      
    @Column(name = "cjkybje")
    private java.lang.Double cjkybje;
      
    @Column(name = "cjkbbje")
    private java.lang.Double cjkbbje;
      
    @Column(name = "hkybje")
    private java.lang.Double hkybje;
      
    @Column(name = "hkbbje")
    private java.lang.Double hkbbje;
      
    @Column(name = "zfybje")
    private java.lang.Double zfybje;
      
    @Column(name = "zfbbje")
    private java.lang.Double zfbbje;
      
    @Column(name = "fydeptid")
    private java.lang.String fydeptid;
      
    @Column(name = "fydeptid_v")
    private java.lang.String fydeptid_v;
      
    @Column(name = "bbhl")
    private java.lang.Double bbhl;
      
    @Column(name = "ybje")
    private java.lang.Double ybje;
      
    @Column(name = "bbje")
    private java.lang.Double bbje;
      
    @Column(name = "fjzs")
    private java.lang.Integer fjzs;
      
    @Column(name = "djzt")
    private java.lang.String djzt;
      
    @Column(name = "jsh")
    private java.lang.String jsh;
      
    @Column(name = "ischeck")
    private java.lang.Boolean ischeck;
      
    @Column(name = "spzt")
    private java.lang.String spzt;
      
    @Column(name = "qcbz")
    private java.lang.Boolean qcbz;
      
    @Column(name = "kjqj")
    private java.lang.String kjqj;
      
    @Column(name = "kjnd")
    private java.lang.String kjnd;
      
    @Column(name = "jsr")
    private java.lang.String jsr;
      
    @Column(name = "officialprintdate")
    private java.lang.String officialprintdate;
      
    @Column(name = "officialprintuser")
    private java.lang.String officialprintuser;
      
    @Column(name = "sxbz")
    private java.lang.Integer sxbz;
      
    @Column(name = "globalcjkbbje")
    private java.lang.Double globalcjkbbje;
      
    @Column(name = "globalhkbbje")
    private java.lang.Double globalhkbbje;
      
    @Column(name = "globalzfbbje")
    private java.lang.Double globalzfbbje;
      
    @Column(name = "globalbbje")
    private java.lang.Double globalbbje;
      
    @Column(name = "groupcjkbbje")
    private java.lang.Double groupcjkbbje;
      
    @Column(name = "grouphkbbje")
    private java.lang.Double grouphkbbje;
      
    @Column(name = "groupzfbbje")
    private java.lang.Double groupzfbbje;
      
    @Column(name = "groupbbje")
    private java.lang.Double groupbbje;
      
    @Column(name = "globalbbhl")
    private java.lang.Double globalbbhl;
      
    @Column(name = "groupbbhl")
    private java.lang.Double groupbbhl;
      
    @Column(name = "creationtime")
    private java.lang.String creationtime;
      
    @Column(name = "modifiedtime")
    private java.lang.String modifiedtime;
      
    @Column(name = "creator")
    private java.lang.String creator;
      
    @Column(name = "isinitgroup")
    private java.lang.Boolean isinitgroup;
      
    @Column(name = "customer")
    private java.lang.String customer;
      
    @Column(name = "pzzt")
    private java.lang.String pzzt;
      
    @Column(name = "xspz")
    private java.lang.Boolean xspz;
      
    @Column(name = "append")
    private java.lang.Boolean append;
      
    @Column(name = "auditman")
    private java.lang.String auditman;
      
    @Column(name = "shrq_show")
    private java.lang.String shrq_show;
      
    @Column(name = "pk_payorg")
    private java.lang.String pk_payorg;
      
    @Column(name = "pk_payorg_v")
    private java.lang.String pk_payorg_v;
      
    @Column(name = "flexible_flag")
    private java.lang.Boolean flexible_flag;
      
    @Column(name = "voucher")
    private java.lang.String voucher;
      
    @Column(name = "pk_item")
    private java.lang.String pk_item;
      
    @Column(name = "center_dept")
    private java.lang.String center_dept;
      
    @Column(name = "srcbilltype")
    private java.lang.String srcbilltype;
      
    @Column(name = "srctype")
    private java.lang.String srctype;
      
    @Column(name = "ismashare")
    private java.lang.String ismashare;
      
    @Column(name = "iscusupplier")
    private java.lang.String iscusupplier;
      
    @Column(name = "paytarget")
    private java.lang.Integer paytarget;
      
    @Column(name = "tbb_period")
    private java.lang.String tbb_period;
      
    @Column(name = "vouchertag")
    private java.lang.Integer vouchertag;
      
    @Column(name = "red_status")
    private java.lang.Integer red_status;
      
    @Column(name = "redbillpk")
    private java.lang.String redbillpk;
      
    @Column(name = "imag_status")
    private java.lang.Integer imag_status;
      
    @Column(name = "isneedimag")
    private java.lang.Boolean isneedimag;
      
    @Column(name = "isexpedited")
    private java.lang.Boolean isexpedited;
      
    @Column(name = "tax_amount")
    private java.lang.Double tax_amount;
      
    @Column(name = "vat_amount")
    private java.lang.Double vat_amount;
      
    @Column(name = "tni_amount")
    private java.lang.Double tni_amount;
      
    @Column(name = "orgtax_amount")
    private java.lang.Double orgtax_amount;
      
    @Column(name = "orgvat_amount")
    private java.lang.Double orgvat_amount;
      
    @Column(name = "orgtni_amount")
    private java.lang.Double orgtni_amount;
      
    @Column(name = "grouptax_amount")
    private java.lang.Double grouptax_amount;
      
    @Column(name = "groupvat_amount")
    private java.lang.Double groupvat_amount;
      
    @Column(name = "grouptni_amount")
    private java.lang.Double grouptni_amount;
      
    @Column(name = "globaltax_amount")
    private java.lang.Double globaltax_amount;
      
    @Column(name = "globalvat_amount")
    private java.lang.Double globalvat_amount;
      
    @Column(name = "globaltni_amount")
    private java.lang.Double globaltni_amount;
      
    @Column(name = "tax_rate")
    private java.lang.Double tax_rate;
      
    @Column(name = "srcsystem")
    private java.lang.String srcsystem;
      
    @Column(name = "dr")
    private java.lang.Integer dr = 0;
      
    @Column(name = "ts")
    private java.util.Date ts;
        
	
    @OneToMany(targetEntity = com.yonyou.ifbp.demo.entity.BXBusItemEntity.class)
    private java.util.List<com.yonyou.ifbp.demo.entity.BXBusItemEntity> bxbusitem;
    @OneToMany(targetEntity = com.yonyou.ifbp.demo.entity.AccruedVerifyEntity.class)
    private java.util.List<com.yonyou.ifbp.demo.entity.AccruedVerifyEntity> accrued_verify;
    @OneToMany(targetEntity = com.yonyou.ifbp.demo.entity.BxContrastEntity.class)
    private java.util.List<com.yonyou.ifbp.demo.entity.BxContrastEntity> bx_contrast;
    @OneToMany(targetEntity = com.yonyou.ifbp.demo.entity.CShareDetailEntity.class)
    private java.util.List<com.yonyou.ifbp.demo.entity.CShareDetailEntity> cshare_detail;
    @OneToMany(targetEntity = com.yonyou.ifbp.demo.entity.BXTransCostEntity.class)
    private java.util.List<com.yonyou.ifbp.demo.entity.BXTransCostEntity> id_bxtranscostentity;
    @OneToMany(targetEntity = com.yonyou.ifbp.demo.entity.HotelCostEntity.class)
    private java.util.List<com.yonyou.ifbp.demo.entity.HotelCostEntity> id_hotelcostentity;
    @OneToMany(targetEntity = com.yonyou.ifbp.demo.entity.TravelAllowanceEntity.class)
    private java.util.List<com.yonyou.ifbp.demo.entity.TravelAllowanceEntity> id_travelallowanceentity;
	

	/**
	 * 属性 pk的Getter方法.属性名：报销单主键
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk () {
		return pk;
	}
	   
	/**
	 * 属性pk的Setter方法.属性名：报销单主键
	 * 创建日期:2018-6-5
	 * @param newPk java.lang.String
	 */
	public void setPk (java.lang.String newPk ) {
	 	this.pk = newPk;
	} 	 
	
	/**
	 * 属性 pk_org的Getter方法.属性名：原报销单位
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org () {
		return pk_org;
	}
	   
	/**
	 * 属性pk_org的Setter方法.属性名：原报销单位
	 * 创建日期:2018-6-5
	 * @param newPk_org java.lang.String
	 */
	public void setPk_org (java.lang.String newPk_org ) {
	 	this.pk_org = newPk_org;
	} 	 
	
	/**
	 * 属性 pk_org_v的Getter方法.属性名：报销单位
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk_org_v () {
		return pk_org_v;
	}
	   
	/**
	 * 属性pk_org_v的Setter方法.属性名：报销单位
	 * 创建日期:2018-6-5
	 * @param newPk_org_v java.lang.String
	 */
	public void setPk_org_v (java.lang.String newPk_org_v ) {
	 	this.pk_org_v = newPk_org_v;
	} 	 
	
	/**
	 * 属性 pk_group的Getter方法.属性名：集团
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk_group () {
		return pk_group;
	}
	   
	/**
	 * 属性pk_group的Setter方法.属性名：集团
	 * 创建日期:2018-6-5
	 * @param newPk_group java.lang.String
	 */
	public void setPk_group (java.lang.String newPk_group ) {
	 	this.pk_group = newPk_group;
	} 	 
	
	/**
	 * 属性 pk_fiorg的Getter方法.属性名：财务组织
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk_fiorg () {
		return pk_fiorg;
	}
	   
	/**
	 * 属性pk_fiorg的Setter方法.属性名：财务组织
	 * 创建日期:2018-6-5
	 * @param newPk_fiorg java.lang.String
	 */
	public void setPk_fiorg (java.lang.String newPk_fiorg ) {
	 	this.pk_fiorg = newPk_fiorg;
	} 	 
	
	/**
	 * 属性 iscostshare的Getter方法.属性名：是否分摊
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getIscostshare () {
		return iscostshare;
	}
	   
	/**
	 * 属性iscostshare的Setter方法.属性名：是否分摊
	 * 创建日期:2018-6-5
	 * @param newIscostshare java.lang.Boolean
	 */
	public void setIscostshare (java.lang.Boolean newIscostshare ) {
	 	this.iscostshare = newIscostshare;
	} 	 
	
	/**
	 * 属性 isexpamt的Getter方法.属性名：是否待摊
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getIsexpamt () {
		return isexpamt;
	}
	   
	/**
	 * 属性isexpamt的Setter方法.属性名：是否待摊
	 * 创建日期:2018-6-5
	 * @param newIsexpamt java.lang.Boolean
	 */
	public void setIsexpamt (java.lang.Boolean newIsexpamt ) {
	 	this.isexpamt = newIsexpamt;
	} 	 
	
	/**
	 * 属性 pk_pcorg的Getter方法.属性名：原利润中心
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk_pcorg () {
		return pk_pcorg;
	}
	   
	/**
	 * 属性pk_pcorg的Setter方法.属性名：原利润中心
	 * 创建日期:2018-6-5
	 * @param newPk_pcorg java.lang.String
	 */
	public void setPk_pcorg (java.lang.String newPk_pcorg ) {
	 	this.pk_pcorg = newPk_pcorg;
	} 	 
	
	/**
	 * 属性 pk_pcorg_v的Getter方法.属性名：利润中心
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk_pcorg_v () {
		return pk_pcorg_v;
	}
	   
	/**
	 * 属性pk_pcorg_v的Setter方法.属性名：利润中心
	 * 创建日期:2018-6-5
	 * @param newPk_pcorg_v java.lang.String
	 */
	public void setPk_pcorg_v (java.lang.String newPk_pcorg_v ) {
	 	this.pk_pcorg_v = newPk_pcorg_v;
	} 	 
	
	/**
	 * 属性 total_period的Getter方法.属性名：总摊销期
	 *  创建日期:2018-6-5
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getTotal_period () {
		return total_period;
	}
	   
	/**
	 * 属性total_period的Setter方法.属性名：总摊销期
	 * 创建日期:2018-6-5
	 * @param newTotal_period java.lang.Integer
	 */
	public void setTotal_period (java.lang.Integer newTotal_period ) {
	 	this.total_period = newTotal_period;
	} 	 
	
	/**
	 * 属性 reimrule的Getter方法.属性名：报销标准
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getReimrule () {
		return reimrule;
	}
	   
	/**
	 * 属性reimrule的Setter方法.属性名：报销标准
	 * 创建日期:2018-6-5
	 * @param newReimrule java.lang.String
	 */
	public void setReimrule (java.lang.String newReimrule ) {
	 	this.reimrule = newReimrule;
	} 	 
	
	/**
	 * 属性 mngaccid的Getter方法.属性名：管理账户
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getMngaccid () {
		return mngaccid;
	}
	   
	/**
	 * 属性mngaccid的Setter方法.属性名：管理账户
	 * 创建日期:2018-6-5
	 * @param newMngaccid java.lang.String
	 */
	public void setMngaccid (java.lang.String newMngaccid ) {
	 	this.mngaccid = newMngaccid;
	} 	 
	
	/**
	 * 属性 total的Getter方法.属性名：合计金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getTotal () {
		return total;
	}
	   
	/**
	 * 属性total的Setter方法.属性名：合计金额
	 * 创建日期:2018-6-5
	 * @param newTotal java.lang.Double
	 */
	public void setTotal (java.lang.Double newTotal ) {
	 	this.total = newTotal;
	} 	 
	
	/**
	 * 属性 paydate的Getter方法.属性名：支付日期
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPaydate () {
		return paydate;
	}
	   
	/**
	 * 属性paydate的Setter方法.属性名：支付日期
	 * 创建日期:2018-6-5
	 * @param newPaydate java.lang.String
	 */
	public void setPaydate (java.lang.String newPaydate ) {
	 	this.paydate = newPaydate;
	} 	 
	
	/**
	 * 属性 payman的Getter方法.属性名：支付人
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPayman () {
		return payman;
	}
	   
	/**
	 * 属性payman的Setter方法.属性名：支付人
	 * 创建日期:2018-6-5
	 * @param newPayman java.lang.String
	 */
	public void setPayman (java.lang.String newPayman ) {
	 	this.payman = newPayman;
	} 	 
	
	/**
	 * 属性 payflag的Getter方法.属性名：支付状态
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getPayflag () {
		return payflag;
	}
	   
	/**
	 * 属性payflag的Setter方法.属性名：支付状态
	 * 创建日期:2018-6-5
	 * @param newPayflag java.lang.Boolean
	 */
	public void setPayflag (java.lang.Boolean newPayflag ) {
	 	this.payflag = newPayflag;
	} 	 
	
	/**
	 * 属性 fydwbm的Getter方法.属性名：原费用承担单位
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getFydwbm () {
		return fydwbm;
	}
	   
	/**
	 * 属性fydwbm的Setter方法.属性名：原费用承担单位
	 * 创建日期:2018-6-5
	 * @param newFydwbm java.lang.String
	 */
	public void setFydwbm (java.lang.String newFydwbm ) {
	 	this.fydwbm = newFydwbm;
	} 	 
	
	/**
	 * 属性 fydwbm_v的Getter方法.属性名：费用承担单位
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getFydwbm_v () {
		return fydwbm_v;
	}
	   
	/**
	 * 属性fydwbm_v的Setter方法.属性名：费用承担单位
	 * 创建日期:2018-6-5
	 * @param newFydwbm_v java.lang.String
	 */
	public void setFydwbm_v (java.lang.String newFydwbm_v ) {
	 	this.fydwbm_v = newFydwbm_v;
	} 	 
	
	/**
	 * 属性 dwbm的Getter方法.属性名：原报销人单位
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getDwbm () {
		return dwbm;
	}
	   
	/**
	 * 属性dwbm的Setter方法.属性名：原报销人单位
	 * 创建日期:2018-6-5
	 * @param newDwbm java.lang.String
	 */
	public void setDwbm (java.lang.String newDwbm ) {
	 	this.dwbm = newDwbm;
	} 	 
	
	/**
	 * 属性 dwbm_v的Getter方法.属性名：报销人单位
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getDwbm_v () {
		return dwbm_v;
	}
	   
	/**
	 * 属性dwbm_v的Setter方法.属性名：报销人单位
	 * 创建日期:2018-6-5
	 * @param newDwbm_v java.lang.String
	 */
	public void setDwbm_v (java.lang.String newDwbm_v ) {
	 	this.dwbm_v = newDwbm_v;
	} 	 
	
	/**
	 * 属性 djdl的Getter方法.属性名：单据大类
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getDjdl () {
		return djdl;
	}
	   
	/**
	 * 属性djdl的Setter方法.属性名：单据大类
	 * 创建日期:2018-6-5
	 * @param newDjdl java.lang.String
	 */
	public void setDjdl (java.lang.String newDjdl ) {
	 	this.djdl = newDjdl;
	} 	 
	
	/**
	 * 属性 djlxbm的Getter方法.属性名：单据类型编码
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getDjlxbm () {
		return djlxbm;
	}
	   
	/**
	 * 属性djlxbm的Setter方法.属性名：单据类型编码
	 * 创建日期:2018-6-5
	 * @param newDjlxbm java.lang.String
	 */
	public void setDjlxbm (java.lang.String newDjlxbm ) {
	 	this.djlxbm = newDjlxbm;
	} 	 
	
	/**
	 * 属性 pk_billtype的Getter方法.属性名：单据类型
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk_billtype () {
		return pk_billtype;
	}
	   
	/**
	 * 属性pk_billtype的Setter方法.属性名：单据类型
	 * 创建日期:2018-6-5
	 * @param newPk_billtype java.lang.String
	 */
	public void setPk_billtype (java.lang.String newPk_billtype ) {
	 	this.pk_billtype = newPk_billtype;
	} 	 
	
	/**
	 * 属性 djbh的Getter方法.属性名：单据编号
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getDjbh () {
		return djbh;
	}
	   
	/**
	 * 属性djbh的Setter方法.属性名：单据编号
	 * 创建日期:2018-6-5
	 * @param newDjbh java.lang.String
	 */
	public void setDjbh (java.lang.String newDjbh ) {
	 	this.djbh = newDjbh;
	} 	 
	
	/**
	 * 属性 djrq的Getter方法.属性名：单据日期
	 *  创建日期:2018-6-5
	 * @return java.util.Date
	 */
	public java.util.Date getDjrq () {
		return djrq;
	}
	   
	/**
	 * 属性djrq的Setter方法.属性名：单据日期
	 * 创建日期:2018-6-5
	 * @param newDjrq java.util.Date
	 */
	public void setDjrq (java.util.Date newDjrq ) {
	 	this.djrq = newDjrq;
	} 	 
	
	/**
	 * 属性 sprq的Getter方法.属性名：审批时间
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getSprq () {
		return sprq;
	}
	   
	/**
	 * 属性sprq的Setter方法.属性名：审批时间
	 * 创建日期:2018-6-5
	 * @param newSprq java.lang.String
	 */
	public void setSprq (java.lang.String newSprq ) {
	 	this.sprq = newSprq;
	} 	 
	
	/**
	 * 属性 jsrq的Getter方法.属性名：签字日期
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getJsrq () {
		return jsrq;
	}
	   
	/**
	 * 属性jsrq的Setter方法.属性名：签字日期
	 * 创建日期:2018-6-5
	 * @param newJsrq java.lang.String
	 */
	public void setJsrq (java.lang.String newJsrq ) {
	 	this.jsrq = newJsrq;
	} 	 
	
	/**
	 * 属性 deptid的Getter方法.属性名：原报销人部门
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getDeptid () {
		return deptid;
	}
	   
	/**
	 * 属性deptid的Setter方法.属性名：原报销人部门
	 * 创建日期:2018-6-5
	 * @param newDeptid java.lang.String
	 */
	public void setDeptid (java.lang.String newDeptid ) {
	 	this.deptid = newDeptid;
	} 	 
	
	/**
	 * 属性 deptid_v的Getter方法.属性名：报销人部门
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getDeptid_v () {
		return deptid_v;
	}
	   
	/**
	 * 属性deptid_v的Setter方法.属性名：报销人部门
	 * 创建日期:2018-6-5
	 * @param newDeptid_v java.lang.String
	 */
	public void setDeptid_v (java.lang.String newDeptid_v ) {
	 	this.deptid_v = newDeptid_v;
	} 	 
	
	/**
	 * 属性 receiver的Getter方法.属性名：收款人
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getReceiver () {
		return receiver;
	}
	   
	/**
	 * 属性receiver的Setter方法.属性名：收款人
	 * 创建日期:2018-6-5
	 * @param newReceiver java.lang.String
	 */
	public void setReceiver (java.lang.String newReceiver ) {
	 	this.receiver = newReceiver;
	} 	 
	
	/**
	 * 属性 jkbxr的Getter方法.属性名：报销人
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getJkbxr () {
		return jkbxr;
	}
	   
	/**
	 * 属性jkbxr的Setter方法.属性名：报销人
	 * 创建日期:2018-6-5
	 * @param newJkbxr java.lang.String
	 */
	public void setJkbxr (java.lang.String newJkbxr ) {
	 	this.jkbxr = newJkbxr;
	} 	 
	
	/**
	 * 属性 operator的Getter方法.属性名：录入人
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getOperator () {
		return operator;
	}
	   
	/**
	 * 属性operator的Setter方法.属性名：录入人
	 * 创建日期:2018-6-5
	 * @param newOperator java.lang.String
	 */
	public void setOperator (java.lang.String newOperator ) {
	 	this.operator = newOperator;
	} 	 
	
	/**
	 * 属性 approver的Getter方法.属性名：审批人
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getApprover () {
		return approver;
	}
	   
	/**
	 * 属性approver的Setter方法.属性名：审批人
	 * 创建日期:2018-6-5
	 * @param newApprover java.lang.String
	 */
	public void setApprover (java.lang.String newApprover ) {
	 	this.approver = newApprover;
	} 	 
	
	/**
	 * 属性 modifier的Getter方法.属性名：最终修改人
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getModifier () {
		return modifier;
	}
	   
	/**
	 * 属性modifier的Setter方法.属性名：最终修改人
	 * 创建日期:2018-6-5
	 * @param newModifier java.lang.String
	 */
	public void setModifier (java.lang.String newModifier ) {
	 	this.modifier = newModifier;
	} 	 
	
	/**
	 * 属性 pjh的Getter方法.属性名：票据号
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPjh () {
		return pjh;
	}
	   
	/**
	 * 属性pjh的Setter方法.属性名：票据号
	 * 创建日期:2018-6-5
	 * @param newPjh java.lang.String
	 */
	public void setPjh (java.lang.String newPjh ) {
	 	this.pjh = newPjh;
	} 	 
	
	/**
	 * 属性 skyhzh的Getter方法.属性名：个人银行账户
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getSkyhzh () {
		return skyhzh;
	}
	   
	/**
	 * 属性skyhzh的Setter方法.属性名：个人银行账户
	 * 创建日期:2018-6-5
	 * @param newSkyhzh java.lang.String
	 */
	public void setSkyhzh (java.lang.String newSkyhzh ) {
	 	this.skyhzh = newSkyhzh;
	} 	 
	
	/**
	 * 属性 fkyhzh的Getter方法.属性名：单位银行账户
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getFkyhzh () {
		return fkyhzh;
	}
	   
	/**
	 * 属性fkyhzh的Setter方法.属性名：单位银行账户
	 * 创建日期:2018-6-5
	 * @param newFkyhzh java.lang.String
	 */
	public void setFkyhzh (java.lang.String newFkyhzh ) {
	 	this.fkyhzh = newFkyhzh;
	} 	 
	
	/**
	 * 属性 cjkybje的Getter方法.属性名：冲借款原币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getCjkybje () {
		return cjkybje;
	}
	   
	/**
	 * 属性cjkybje的Setter方法.属性名：冲借款原币金额
	 * 创建日期:2018-6-5
	 * @param newCjkybje java.lang.Double
	 */
	public void setCjkybje (java.lang.Double newCjkybje ) {
	 	this.cjkybje = newCjkybje;
	} 	 
	
	/**
	 * 属性 cjkbbje的Getter方法.属性名：冲借款本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getCjkbbje () {
		return cjkbbje;
	}
	   
	/**
	 * 属性cjkbbje的Setter方法.属性名：冲借款本币金额
	 * 创建日期:2018-6-5
	 * @param newCjkbbje java.lang.Double
	 */
	public void setCjkbbje (java.lang.Double newCjkbbje ) {
	 	this.cjkbbje = newCjkbbje;
	} 	 
	
	/**
	 * 属性 hkybje的Getter方法.属性名：还款原币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getHkybje () {
		return hkybje;
	}
	   
	/**
	 * 属性hkybje的Setter方法.属性名：还款原币金额
	 * 创建日期:2018-6-5
	 * @param newHkybje java.lang.Double
	 */
	public void setHkybje (java.lang.Double newHkybje ) {
	 	this.hkybje = newHkybje;
	} 	 
	
	/**
	 * 属性 hkbbje的Getter方法.属性名：还款本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getHkbbje () {
		return hkbbje;
	}
	   
	/**
	 * 属性hkbbje的Setter方法.属性名：还款本币金额
	 * 创建日期:2018-6-5
	 * @param newHkbbje java.lang.Double
	 */
	public void setHkbbje (java.lang.Double newHkbbje ) {
	 	this.hkbbje = newHkbbje;
	} 	 
	
	/**
	 * 属性 zfybje的Getter方法.属性名：支付原币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getZfybje () {
		return zfybje;
	}
	   
	/**
	 * 属性zfybje的Setter方法.属性名：支付原币金额
	 * 创建日期:2018-6-5
	 * @param newZfybje java.lang.Double
	 */
	public void setZfybje (java.lang.Double newZfybje ) {
	 	this.zfybje = newZfybje;
	} 	 
	
	/**
	 * 属性 zfbbje的Getter方法.属性名：支付本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getZfbbje () {
		return zfbbje;
	}
	   
	/**
	 * 属性zfbbje的Setter方法.属性名：支付本币金额
	 * 创建日期:2018-6-5
	 * @param newZfbbje java.lang.Double
	 */
	public void setZfbbje (java.lang.Double newZfbbje ) {
	 	this.zfbbje = newZfbbje;
	} 	 
	
	/**
	 * 属性 fydeptid的Getter方法.属性名：原费用承担部门
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getFydeptid () {
		return fydeptid;
	}
	   
	/**
	 * 属性fydeptid的Setter方法.属性名：原费用承担部门
	 * 创建日期:2018-6-5
	 * @param newFydeptid java.lang.String
	 */
	public void setFydeptid (java.lang.String newFydeptid ) {
	 	this.fydeptid = newFydeptid;
	} 	 
	
	/**
	 * 属性 fydeptid_v的Getter方法.属性名：费用承担部门
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getFydeptid_v () {
		return fydeptid_v;
	}
	   
	/**
	 * 属性fydeptid_v的Setter方法.属性名：费用承担部门
	 * 创建日期:2018-6-5
	 * @param newFydeptid_v java.lang.String
	 */
	public void setFydeptid_v (java.lang.String newFydeptid_v ) {
	 	this.fydeptid_v = newFydeptid_v;
	} 	 
	
	/**
	 * 属性 bbhl的Getter方法.属性名：本币汇率
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getBbhl () {
		return bbhl;
	}
	   
	/**
	 * 属性bbhl的Setter方法.属性名：本币汇率
	 * 创建日期:2018-6-5
	 * @param newBbhl java.lang.Double
	 */
	public void setBbhl (java.lang.Double newBbhl ) {
	 	this.bbhl = newBbhl;
	} 	 
	
	/**
	 * 属性 ybje的Getter方法.属性名：报销原币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getYbje () {
		return ybje;
	}
	   
	/**
	 * 属性ybje的Setter方法.属性名：报销原币金额
	 * 创建日期:2018-6-5
	 * @param newYbje java.lang.Double
	 */
	public void setYbje (java.lang.Double newYbje ) {
	 	this.ybje = newYbje;
	} 	 
	
	/**
	 * 属性 bbje的Getter方法.属性名：报销本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getBbje () {
		return bbje;
	}
	   
	/**
	 * 属性bbje的Setter方法.属性名：报销本币金额
	 * 创建日期:2018-6-5
	 * @param newBbje java.lang.Double
	 */
	public void setBbje (java.lang.Double newBbje ) {
	 	this.bbje = newBbje;
	} 	 
	
	/**
	 * 属性 fjzs的Getter方法.属性名：附件张数
	 *  创建日期:2018-6-5
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getFjzs () {
		return fjzs;
	}
	   
	/**
	 * 属性fjzs的Setter方法.属性名：附件张数
	 * 创建日期:2018-6-5
	 * @param newFjzs java.lang.Integer
	 */
	public void setFjzs (java.lang.Integer newFjzs ) {
	 	this.fjzs = newFjzs;
	} 	 
	
	/**
	 * 属性 djzt的Getter方法.属性名：单据状态
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getDjzt () {
		return djzt;
	}
	   
	/**
	 * 属性djzt的Setter方法.属性名：单据状态
	 * 创建日期:2018-6-5
	 * @param newDjzt java.lang.String
	 */
	public void setDjzt (java.lang.String newDjzt ) {
	 	this.djzt = newDjzt;
	} 	 
	
	/**
	 * 属性 jsh的Getter方法.属性名：结算号
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getJsh () {
		return jsh;
	}
	   
	/**
	 * 属性jsh的Setter方法.属性名：结算号
	 * 创建日期:2018-6-5
	 * @param newJsh java.lang.String
	 */
	public void setJsh (java.lang.String newJsh ) {
	 	this.jsh = newJsh;
	} 	 
	
	/**
	 * 属性 ischeck的Getter方法.属性名：是否限额
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getIscheck () {
		return ischeck;
	}
	   
	/**
	 * 属性ischeck的Setter方法.属性名：是否限额
	 * 创建日期:2018-6-5
	 * @param newIscheck java.lang.Boolean
	 */
	public void setIscheck (java.lang.Boolean newIscheck ) {
	 	this.ischeck = newIscheck;
	} 	 
	
	/**
	 * 属性 spzt的Getter方法.属性名：审批状态
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getSpzt () {
		return spzt;
	}
	   
	/**
	 * 属性spzt的Setter方法.属性名：审批状态
	 * 创建日期:2018-6-5
	 * @param newSpzt java.lang.String
	 */
	public void setSpzt (java.lang.String newSpzt ) {
	 	this.spzt = newSpzt;
	} 	 
	
	/**
	 * 属性 qcbz的Getter方法.属性名：期初标志
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getQcbz () {
		return qcbz;
	}
	   
	/**
	 * 属性qcbz的Setter方法.属性名：期初标志
	 * 创建日期:2018-6-5
	 * @param newQcbz java.lang.Boolean
	 */
	public void setQcbz (java.lang.Boolean newQcbz ) {
	 	this.qcbz = newQcbz;
	} 	 
	
	/**
	 * 属性 kjqj的Getter方法.属性名：会计期间
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getKjqj () {
		return kjqj;
	}
	   
	/**
	 * 属性kjqj的Setter方法.属性名：会计期间
	 * 创建日期:2018-6-5
	 * @param newKjqj java.lang.String
	 */
	public void setKjqj (java.lang.String newKjqj ) {
	 	this.kjqj = newKjqj;
	} 	 
	
	/**
	 * 属性 kjnd的Getter方法.属性名：会计年度
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getKjnd () {
		return kjnd;
	}
	   
	/**
	 * 属性kjnd的Setter方法.属性名：会计年度
	 * 创建日期:2018-6-5
	 * @param newKjnd java.lang.String
	 */
	public void setKjnd (java.lang.String newKjnd ) {
	 	this.kjnd = newKjnd;
	} 	 
	
	/**
	 * 属性 jsr的Getter方法.属性名：签字人
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getJsr () {
		return jsr;
	}
	   
	/**
	 * 属性jsr的Setter方法.属性名：签字人
	 * 创建日期:2018-6-5
	 * @param newJsr java.lang.String
	 */
	public void setJsr (java.lang.String newJsr ) {
	 	this.jsr = newJsr;
	} 	 
	
	/**
	 * 属性 officialprintdate的Getter方法.属性名：正式打印日期
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getOfficialprintdate () {
		return officialprintdate;
	}
	   
	/**
	 * 属性officialprintdate的Setter方法.属性名：正式打印日期
	 * 创建日期:2018-6-5
	 * @param newOfficialprintdate java.lang.String
	 */
	public void setOfficialprintdate (java.lang.String newOfficialprintdate ) {
	 	this.officialprintdate = newOfficialprintdate;
	} 	 
	
	/**
	 * 属性 officialprintuser的Getter方法.属性名：正式打印人
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getOfficialprintuser () {
		return officialprintuser;
	}
	   
	/**
	 * 属性officialprintuser的Setter方法.属性名：正式打印人
	 * 创建日期:2018-6-5
	 * @param newOfficialprintuser java.lang.String
	 */
	public void setOfficialprintuser (java.lang.String newOfficialprintuser ) {
	 	this.officialprintuser = newOfficialprintuser;
	} 	 
	
	/**
	 * 属性 sxbz的Getter方法.属性名：生效状态
	 *  创建日期:2018-6-5
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getSxbz () {
		return sxbz;
	}
	   
	/**
	 * 属性sxbz的Setter方法.属性名：生效状态
	 * 创建日期:2018-6-5
	 * @param newSxbz java.lang.Integer
	 */
	public void setSxbz (java.lang.Integer newSxbz ) {
	 	this.sxbz = newSxbz;
	} 	 
	
	/**
	 * 属性 globalcjkbbje的Getter方法.属性名：全局冲借款本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobalcjkbbje () {
		return globalcjkbbje;
	}
	   
	/**
	 * 属性globalcjkbbje的Setter方法.属性名：全局冲借款本币金额
	 * 创建日期:2018-6-5
	 * @param newGlobalcjkbbje java.lang.Double
	 */
	public void setGlobalcjkbbje (java.lang.Double newGlobalcjkbbje ) {
	 	this.globalcjkbbje = newGlobalcjkbbje;
	} 	 
	
	/**
	 * 属性 globalhkbbje的Getter方法.属性名：全局还款本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobalhkbbje () {
		return globalhkbbje;
	}
	   
	/**
	 * 属性globalhkbbje的Setter方法.属性名：全局还款本币金额
	 * 创建日期:2018-6-5
	 * @param newGlobalhkbbje java.lang.Double
	 */
	public void setGlobalhkbbje (java.lang.Double newGlobalhkbbje ) {
	 	this.globalhkbbje = newGlobalhkbbje;
	} 	 
	
	/**
	 * 属性 globalzfbbje的Getter方法.属性名：全局支付本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobalzfbbje () {
		return globalzfbbje;
	}
	   
	/**
	 * 属性globalzfbbje的Setter方法.属性名：全局支付本币金额
	 * 创建日期:2018-6-5
	 * @param newGlobalzfbbje java.lang.Double
	 */
	public void setGlobalzfbbje (java.lang.Double newGlobalzfbbje ) {
	 	this.globalzfbbje = newGlobalzfbbje;
	} 	 
	
	/**
	 * 属性 globalbbje的Getter方法.属性名：全局报销本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobalbbje () {
		return globalbbje;
	}
	   
	/**
	 * 属性globalbbje的Setter方法.属性名：全局报销本币金额
	 * 创建日期:2018-6-5
	 * @param newGlobalbbje java.lang.Double
	 */
	public void setGlobalbbje (java.lang.Double newGlobalbbje ) {
	 	this.globalbbje = newGlobalbbje;
	} 	 
	
	/**
	 * 属性 groupcjkbbje的Getter方法.属性名：集团冲借款本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGroupcjkbbje () {
		return groupcjkbbje;
	}
	   
	/**
	 * 属性groupcjkbbje的Setter方法.属性名：集团冲借款本币金额
	 * 创建日期:2018-6-5
	 * @param newGroupcjkbbje java.lang.Double
	 */
	public void setGroupcjkbbje (java.lang.Double newGroupcjkbbje ) {
	 	this.groupcjkbbje = newGroupcjkbbje;
	} 	 
	
	/**
	 * 属性 grouphkbbje的Getter方法.属性名：集团还款本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGrouphkbbje () {
		return grouphkbbje;
	}
	   
	/**
	 * 属性grouphkbbje的Setter方法.属性名：集团还款本币金额
	 * 创建日期:2018-6-5
	 * @param newGrouphkbbje java.lang.Double
	 */
	public void setGrouphkbbje (java.lang.Double newGrouphkbbje ) {
	 	this.grouphkbbje = newGrouphkbbje;
	} 	 
	
	/**
	 * 属性 groupzfbbje的Getter方法.属性名：集团支付本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGroupzfbbje () {
		return groupzfbbje;
	}
	   
	/**
	 * 属性groupzfbbje的Setter方法.属性名：集团支付本币金额
	 * 创建日期:2018-6-5
	 * @param newGroupzfbbje java.lang.Double
	 */
	public void setGroupzfbbje (java.lang.Double newGroupzfbbje ) {
	 	this.groupzfbbje = newGroupzfbbje;
	} 	 
	
	/**
	 * 属性 groupbbje的Getter方法.属性名：集团报销本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGroupbbje () {
		return groupbbje;
	}
	   
	/**
	 * 属性groupbbje的Setter方法.属性名：集团报销本币金额
	 * 创建日期:2018-6-5
	 * @param newGroupbbje java.lang.Double
	 */
	public void setGroupbbje (java.lang.Double newGroupbbje ) {
	 	this.groupbbje = newGroupbbje;
	} 	 
	
	/**
	 * 属性 globalbbhl的Getter方法.属性名：全局本币汇率
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobalbbhl () {
		return globalbbhl;
	}
	   
	/**
	 * 属性globalbbhl的Setter方法.属性名：全局本币汇率
	 * 创建日期:2018-6-5
	 * @param newGlobalbbhl java.lang.Double
	 */
	public void setGlobalbbhl (java.lang.Double newGlobalbbhl ) {
	 	this.globalbbhl = newGlobalbbhl;
	} 	 
	
	/**
	 * 属性 groupbbhl的Getter方法.属性名：集团本币汇率
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGroupbbhl () {
		return groupbbhl;
	}
	   
	/**
	 * 属性groupbbhl的Setter方法.属性名：集团本币汇率
	 * 创建日期:2018-6-5
	 * @param newGroupbbhl java.lang.Double
	 */
	public void setGroupbbhl (java.lang.Double newGroupbbhl ) {
	 	this.groupbbhl = newGroupbbhl;
	} 	 
	
	/**
	 * 属性 creationtime的Getter方法.属性名：创建时间
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getCreationtime () {
		return creationtime;
	}
	   
	/**
	 * 属性creationtime的Setter方法.属性名：创建时间
	 * 创建日期:2018-6-5
	 * @param newCreationtime java.lang.String
	 */
	public void setCreationtime (java.lang.String newCreationtime ) {
	 	this.creationtime = newCreationtime;
	} 	 
	
	/**
	 * 属性 modifiedtime的Getter方法.属性名：最后修改时间
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getModifiedtime () {
		return modifiedtime;
	}
	   
	/**
	 * 属性modifiedtime的Setter方法.属性名：最后修改时间
	 * 创建日期:2018-6-5
	 * @param newModifiedtime java.lang.String
	 */
	public void setModifiedtime (java.lang.String newModifiedtime ) {
	 	this.modifiedtime = newModifiedtime;
	} 	 
	
	/**
	 * 属性 creator的Getter方法.属性名：创建人
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getCreator () {
		return creator;
	}
	   
	/**
	 * 属性creator的Setter方法.属性名：创建人
	 * 创建日期:2018-6-5
	 * @param newCreator java.lang.String
	 */
	public void setCreator (java.lang.String newCreator ) {
	 	this.creator = newCreator;
	} 	 
	
	/**
	 * 属性 isinitgroup的Getter方法.属性名：是否集团常用单据
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getIsinitgroup () {
		return isinitgroup;
	}
	   
	/**
	 * 属性isinitgroup的Setter方法.属性名：是否集团常用单据
	 * 创建日期:2018-6-5
	 * @param newIsinitgroup java.lang.Boolean
	 */
	public void setIsinitgroup (java.lang.Boolean newIsinitgroup ) {
	 	this.isinitgroup = newIsinitgroup;
	} 	 
	
	/**
	 * 属性 customer的Getter方法.属性名：客户
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getCustomer () {
		return customer;
	}
	   
	/**
	 * 属性customer的Setter方法.属性名：客户
	 * 创建日期:2018-6-5
	 * @param newCustomer java.lang.String
	 */
	public void setCustomer (java.lang.String newCustomer ) {
	 	this.customer = newCustomer;
	} 	 
	
	/**
	 * 属性 pzzt的Getter方法.属性名：凭证状态
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPzzt () {
		return pzzt;
	}
	   
	/**
	 * 属性pzzt的Setter方法.属性名：凭证状态
	 * 创建日期:2018-6-5
	 * @param newPzzt java.lang.String
	 */
	public void setPzzt (java.lang.String newPzzt ) {
	 	this.pzzt = newPzzt;
	} 	 
	
	/**
	 * 属性 xspz的Getter方法.属性名：是否显示凭证号
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getXspz () {
		return xspz;
	}
	   
	/**
	 * 属性xspz的Setter方法.属性名：是否显示凭证号
	 * 创建日期:2018-6-5
	 * @param newXspz java.lang.Boolean
	 */
	public void setXspz (java.lang.Boolean newXspz ) {
	 	this.xspz = newXspz;
	} 	 
	
	/**
	 * 属性 append的Getter方法.属性名：是否追加显示结果
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getAppend () {
		return append;
	}
	   
	/**
	 * 属性append的Setter方法.属性名：是否追加显示结果
	 * 创建日期:2018-6-5
	 * @param newAppend java.lang.Boolean
	 */
	public void setAppend (java.lang.Boolean newAppend ) {
	 	this.append = newAppend;
	} 	 
	
	/**
	 * 属性 auditman的Getter方法.属性名：审批流起点人
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getAuditman () {
		return auditman;
	}
	   
	/**
	 * 属性auditman的Setter方法.属性名：审批流起点人
	 * 创建日期:2018-6-5
	 * @param newAuditman java.lang.String
	 */
	public void setAuditman (java.lang.String newAuditman ) {
	 	this.auditman = newAuditman;
	} 	 
	
	/**
	 * 属性 shrq_show的Getter方法.属性名：审批日期
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getShrq_show () {
		return shrq_show;
	}
	   
	/**
	 * 属性shrq_show的Setter方法.属性名：审批日期
	 * 创建日期:2018-6-5
	 * @param newShrq_show java.lang.String
	 */
	public void setShrq_show (java.lang.String newShrq_show ) {
	 	this.shrq_show = newShrq_show;
	} 	 
	
	/**
	 * 属性 pk_payorg的Getter方法.属性名：原支付组织
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk_payorg () {
		return pk_payorg;
	}
	   
	/**
	 * 属性pk_payorg的Setter方法.属性名：原支付组织
	 * 创建日期:2018-6-5
	 * @param newPk_payorg java.lang.String
	 */
	public void setPk_payorg (java.lang.String newPk_payorg ) {
	 	this.pk_payorg = newPk_payorg;
	} 	 
	
	/**
	 * 属性 pk_payorg_v的Getter方法.属性名：支付组织
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk_payorg_v () {
		return pk_payorg_v;
	}
	   
	/**
	 * 属性pk_payorg_v的Setter方法.属性名：支付组织
	 * 创建日期:2018-6-5
	 * @param newPk_payorg_v java.lang.String
	 */
	public void setPk_payorg_v (java.lang.String newPk_payorg_v ) {
	 	this.pk_payorg_v = newPk_payorg_v;
	} 	 
	
	/**
	 * 属性 flexible_flag的Getter方法.属性名：项目是否柔性控制
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getFlexible_flag () {
		return flexible_flag;
	}
	   
	/**
	 * 属性flexible_flag的Setter方法.属性名：项目是否柔性控制
	 * 创建日期:2018-6-5
	 * @param newFlexible_flag java.lang.Boolean
	 */
	public void setFlexible_flag (java.lang.Boolean newFlexible_flag ) {
	 	this.flexible_flag = newFlexible_flag;
	} 	 
	
	/**
	 * 属性 voucher的Getter方法.属性名：凭证号
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getVoucher () {
		return voucher;
	}
	   
	/**
	 * 属性voucher的Setter方法.属性名：凭证号
	 * 创建日期:2018-6-5
	 * @param newVoucher java.lang.String
	 */
	public void setVoucher (java.lang.String newVoucher ) {
	 	this.voucher = newVoucher;
	} 	 
	
	/**
	 * 属性 pk_item的Getter方法.属性名：费用申请单
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getPk_item () {
		return pk_item;
	}
	   
	/**
	 * 属性pk_item的Setter方法.属性名：费用申请单
	 * 创建日期:2018-6-5
	 * @param newPk_item java.lang.String
	 */
	public void setPk_item (java.lang.String newPk_item ) {
	 	this.pk_item = newPk_item;
	} 	 
	
	/**
	 * 属性 center_dept的Getter方法.属性名：归口管理部门
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getCenter_dept () {
		return center_dept;
	}
	   
	/**
	 * 属性center_dept的Setter方法.属性名：归口管理部门
	 * 创建日期:2018-6-5
	 * @param newCenter_dept java.lang.String
	 */
	public void setCenter_dept (java.lang.String newCenter_dept ) {
	 	this.center_dept = newCenter_dept;
	} 	 
	
	/**
	 * 属性 srcbilltype的Getter方法.属性名：来源单据类型
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getSrcbilltype () {
		return srcbilltype;
	}
	   
	/**
	 * 属性srcbilltype的Setter方法.属性名：来源单据类型
	 * 创建日期:2018-6-5
	 * @param newSrcbilltype java.lang.String
	 */
	public void setSrcbilltype (java.lang.String newSrcbilltype ) {
	 	this.srcbilltype = newSrcbilltype;
	} 	 
	
	/**
	 * 属性 srctype的Getter方法.属性名：来源类型
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getSrctype () {
		return srctype;
	}
	   
	/**
	 * 属性srctype的Setter方法.属性名：来源类型
	 * 创建日期:2018-6-5
	 * @param newSrctype java.lang.String
	 */
	public void setSrctype (java.lang.String newSrctype ) {
	 	this.srctype = newSrctype;
	} 	 
	
	/**
	 * 属性 ismashare的Getter方法.属性名：申请单是否分摊
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getIsmashare () {
		return ismashare;
	}
	   
	/**
	 * 属性ismashare的Setter方法.属性名：申请单是否分摊
	 * 创建日期:2018-6-5
	 * @param newIsmashare java.lang.String
	 */
	public void setIsmashare (java.lang.String newIsmashare ) {
	 	this.ismashare = newIsmashare;
	} 	 
	
	/**
	 * 属性 iscusupplier的Getter方法.属性名：对公支付
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getIscusupplier () {
		return iscusupplier;
	}
	   
	/**
	 * 属性iscusupplier的Setter方法.属性名：对公支付
	 * 创建日期:2018-6-5
	 * @param newIscusupplier java.lang.String
	 */
	public void setIscusupplier (java.lang.String newIscusupplier ) {
	 	this.iscusupplier = newIscusupplier;
	} 	 
	
	/**
	 * 属性 paytarget的Getter方法.属性名：收款对象
	 *  创建日期:2018-6-5
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getPaytarget () {
		return paytarget;
	}
	   
	/**
	 * 属性paytarget的Setter方法.属性名：收款对象
	 * 创建日期:2018-6-5
	 * @param newPaytarget java.lang.Integer
	 */
	public void setPaytarget (java.lang.Integer newPaytarget ) {
	 	this.paytarget = newPaytarget;
	} 	 
	
	/**
	 * 属性 tbb_period的Getter方法.属性名：预算占用期间
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getTbb_period () {
		return tbb_period;
	}
	   
	/**
	 * 属性tbb_period的Setter方法.属性名：预算占用期间
	 * 创建日期:2018-6-5
	 * @param newTbb_period java.lang.String
	 */
	public void setTbb_period (java.lang.String newTbb_period ) {
	 	this.tbb_period = newTbb_period;
	} 	 
	
	/**
	 * 属性 vouchertag的Getter方法.属性名：凭证标志
	 *  创建日期:2018-6-5
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getVouchertag () {
		return vouchertag;
	}
	   
	/**
	 * 属性vouchertag的Setter方法.属性名：凭证标志
	 * 创建日期:2018-6-5
	 * @param newVouchertag java.lang.Integer
	 */
	public void setVouchertag (java.lang.Integer newVouchertag ) {
	 	this.vouchertag = newVouchertag;
	} 	 
	
	/**
	 * 属性 red_status的Getter方法.属性名：红冲标志
	 *  创建日期:2018-6-5
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getRed_status () {
		return red_status;
	}
	   
	/**
	 * 属性red_status的Setter方法.属性名：红冲标志
	 * 创建日期:2018-6-5
	 * @param newRed_status java.lang.Integer
	 */
	public void setRed_status (java.lang.Integer newRed_status ) {
	 	this.red_status = newRed_status;
	} 	 
	
	/**
	 * 属性 redbillpk的Getter方法.属性名：红冲单据主键
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getRedbillpk () {
		return redbillpk;
	}
	   
	/**
	 * 属性redbillpk的Setter方法.属性名：红冲单据主键
	 * 创建日期:2018-6-5
	 * @param newRedbillpk java.lang.String
	 */
	public void setRedbillpk (java.lang.String newRedbillpk ) {
	 	this.redbillpk = newRedbillpk;
	} 	 
	
	/**
	 * 属性 imag_status的Getter方法.属性名：影像状态
	 *  创建日期:2018-6-5
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getImag_status () {
		return imag_status;
	}
	   
	/**
	 * 属性imag_status的Setter方法.属性名：影像状态
	 * 创建日期:2018-6-5
	 * @param newImag_status java.lang.Integer
	 */
	public void setImag_status (java.lang.Integer newImag_status ) {
	 	this.imag_status = newImag_status;
	} 	 
	
	/**
	 * 属性 isneedimag的Getter方法.属性名：需要影像扫描
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getIsneedimag () {
		return isneedimag;
	}
	   
	/**
	 * 属性isneedimag的Setter方法.属性名：需要影像扫描
	 * 创建日期:2018-6-5
	 * @param newIsneedimag java.lang.Boolean
	 */
	public void setIsneedimag (java.lang.Boolean newIsneedimag ) {
	 	this.isneedimag = newIsneedimag;
	} 	 
	
	/**
	 * 属性 isexpedited的Getter方法.属性名：紧急
	 *  创建日期:2018-6-5
	 * @return java.lang.Boolean
	 */
	public java.lang.Boolean getIsexpedited () {
		return isexpedited;
	}
	   
	/**
	 * 属性isexpedited的Setter方法.属性名：紧急
	 * 创建日期:2018-6-5
	 * @param newIsexpedited java.lang.Boolean
	 */
	public void setIsexpedited (java.lang.Boolean newIsexpedited ) {
	 	this.isexpedited = newIsexpedited;
	} 	 
	
	/**
	 * 属性 tax_amount的Getter方法.属性名：税金金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getTax_amount () {
		return tax_amount;
	}
	   
	/**
	 * 属性tax_amount的Setter方法.属性名：税金金额
	 * 创建日期:2018-6-5
	 * @param newTax_amount java.lang.Double
	 */
	public void setTax_amount (java.lang.Double newTax_amount ) {
	 	this.tax_amount = newTax_amount;
	} 	 
	
	/**
	 * 属性 vat_amount的Getter方法.属性名：含税金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getVat_amount () {
		return vat_amount;
	}
	   
	/**
	 * 属性vat_amount的Setter方法.属性名：含税金额
	 * 创建日期:2018-6-5
	 * @param newVat_amount java.lang.Double
	 */
	public void setVat_amount (java.lang.Double newVat_amount ) {
	 	this.vat_amount = newVat_amount;
	} 	 
	
	/**
	 * 属性 tni_amount的Getter方法.属性名：不含税金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getTni_amount () {
		return tni_amount;
	}
	   
	/**
	 * 属性tni_amount的Setter方法.属性名：不含税金额
	 * 创建日期:2018-6-5
	 * @param newTni_amount java.lang.Double
	 */
	public void setTni_amount (java.lang.Double newTni_amount ) {
	 	this.tni_amount = newTni_amount;
	} 	 
	
	/**
	 * 属性 orgtax_amount的Getter方法.属性名：税金组织本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getOrgtax_amount () {
		return orgtax_amount;
	}
	   
	/**
	 * 属性orgtax_amount的Setter方法.属性名：税金组织本币金额
	 * 创建日期:2018-6-5
	 * @param newOrgtax_amount java.lang.Double
	 */
	public void setOrgtax_amount (java.lang.Double newOrgtax_amount ) {
	 	this.orgtax_amount = newOrgtax_amount;
	} 	 
	
	/**
	 * 属性 orgvat_amount的Getter方法.属性名：含税组织本位币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getOrgvat_amount () {
		return orgvat_amount;
	}
	   
	/**
	 * 属性orgvat_amount的Setter方法.属性名：含税组织本位币金额
	 * 创建日期:2018-6-5
	 * @param newOrgvat_amount java.lang.Double
	 */
	public void setOrgvat_amount (java.lang.Double newOrgvat_amount ) {
	 	this.orgvat_amount = newOrgvat_amount;
	} 	 
	
	/**
	 * 属性 orgtni_amount的Getter方法.属性名：不含税组织本位币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getOrgtni_amount () {
		return orgtni_amount;
	}
	   
	/**
	 * 属性orgtni_amount的Setter方法.属性名：不含税组织本位币金额
	 * 创建日期:2018-6-5
	 * @param newOrgtni_amount java.lang.Double
	 */
	public void setOrgtni_amount (java.lang.Double newOrgtni_amount ) {
	 	this.orgtni_amount = newOrgtni_amount;
	} 	 
	
	/**
	 * 属性 grouptax_amount的Getter方法.属性名：集团税金本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGrouptax_amount () {
		return grouptax_amount;
	}
	   
	/**
	 * 属性grouptax_amount的Setter方法.属性名：集团税金本币金额
	 * 创建日期:2018-6-5
	 * @param newGrouptax_amount java.lang.Double
	 */
	public void setGrouptax_amount (java.lang.Double newGrouptax_amount ) {
	 	this.grouptax_amount = newGrouptax_amount;
	} 	 
	
	/**
	 * 属性 groupvat_amount的Getter方法.属性名：集团含税本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGroupvat_amount () {
		return groupvat_amount;
	}
	   
	/**
	 * 属性groupvat_amount的Setter方法.属性名：集团含税本币金额
	 * 创建日期:2018-6-5
	 * @param newGroupvat_amount java.lang.Double
	 */
	public void setGroupvat_amount (java.lang.Double newGroupvat_amount ) {
	 	this.groupvat_amount = newGroupvat_amount;
	} 	 
	
	/**
	 * 属性 grouptni_amount的Getter方法.属性名：集团不含税本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGrouptni_amount () {
		return grouptni_amount;
	}
	   
	/**
	 * 属性grouptni_amount的Setter方法.属性名：集团不含税本币金额
	 * 创建日期:2018-6-5
	 * @param newGrouptni_amount java.lang.Double
	 */
	public void setGrouptni_amount (java.lang.Double newGrouptni_amount ) {
	 	this.grouptni_amount = newGrouptni_amount;
	} 	 
	
	/**
	 * 属性 globaltax_amount的Getter方法.属性名：全局税金本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobaltax_amount () {
		return globaltax_amount;
	}
	   
	/**
	 * 属性globaltax_amount的Setter方法.属性名：全局税金本币金额
	 * 创建日期:2018-6-5
	 * @param newGlobaltax_amount java.lang.Double
	 */
	public void setGlobaltax_amount (java.lang.Double newGlobaltax_amount ) {
	 	this.globaltax_amount = newGlobaltax_amount;
	} 	 
	
	/**
	 * 属性 globalvat_amount的Getter方法.属性名：全局含税本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobalvat_amount () {
		return globalvat_amount;
	}
	   
	/**
	 * 属性globalvat_amount的Setter方法.属性名：全局含税本币金额
	 * 创建日期:2018-6-5
	 * @param newGlobalvat_amount java.lang.Double
	 */
	public void setGlobalvat_amount (java.lang.Double newGlobalvat_amount ) {
	 	this.globalvat_amount = newGlobalvat_amount;
	} 	 
	
	/**
	 * 属性 globaltni_amount的Getter方法.属性名：全局不含税本币金额
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobaltni_amount () {
		return globaltni_amount;
	}
	   
	/**
	 * 属性globaltni_amount的Setter方法.属性名：全局不含税本币金额
	 * 创建日期:2018-6-5
	 * @param newGlobaltni_amount java.lang.Double
	 */
	public void setGlobaltni_amount (java.lang.Double newGlobaltni_amount ) {
	 	this.globaltni_amount = newGlobaltni_amount;
	} 	 
	
	/**
	 * 属性 tax_rate的Getter方法.属性名：税率
	 *  创建日期:2018-6-5
	 * @return java.lang.Double
	 */
	public java.lang.Double getTax_rate () {
		return tax_rate;
	}
	   
	/**
	 * 属性tax_rate的Setter方法.属性名：税率
	 * 创建日期:2018-6-5
	 * @param newTax_rate java.lang.Double
	 */
	public void setTax_rate (java.lang.Double newTax_rate ) {
	 	this.tax_rate = newTax_rate;
	} 	 
	
	/**
	 * 属性 srcsystem的Getter方法.属性名：来源系统
	 *  创建日期:2018-6-5
	 * @return java.lang.String
	 */
	public java.lang.String getSrcsystem () {
		return srcsystem;
	}
	   
	/**
	 * 属性srcsystem的Setter方法.属性名：来源系统
	 * 创建日期:2018-6-5
	 * @param newSrcsystem java.lang.String
	 */
	public void setSrcsystem (java.lang.String newSrcsystem ) {
	 	this.srcsystem = newSrcsystem;
	} 	 
	
	/**
	 * 属性 bxbusitem的Getter方法.属性名：报销单业务行
	 *  创建日期:2018-6-5
	 * @return java.util.List<com.yonyou.ifbp.demo.entity.BXBusItemEntity>
	 */
	public java.util.List<com.yonyou.ifbp.demo.entity.BXBusItemEntity> getBxbusitem () {
		return bxbusitem;
	}
	   
	/**
	 * 属性bxbusitem的Setter方法.属性名：报销单业务行
	 * 创建日期:2018-6-5
	 * @param newBxbusitem java.util.List<com.yonyou.ifbp.demo.entity.BXBusItemEntity>
	 */
	public void setBxbusitem (java.util.List<com.yonyou.ifbp.demo.entity.BXBusItemEntity> newBxbusitem ) {
	 	this.bxbusitem = newBxbusitem;
	} 	 
	
	/**
	 * 属性 accrued_verify的Getter方法.属性名：冲销核销预提明细
	 *  创建日期:2018-6-5
	 * @return java.util.List<com.yonyou.ifbp.demo.entity.AccruedVerifyEntity>
	 */
	public java.util.List<com.yonyou.ifbp.demo.entity.AccruedVerifyEntity> getAccrued_verify () {
		return accrued_verify;
	}
	   
	/**
	 * 属性accrued_verify的Setter方法.属性名：冲销核销预提明细
	 * 创建日期:2018-6-5
	 * @param newAccrued_verify java.util.List<com.yonyou.ifbp.demo.entity.AccruedVerifyEntity>
	 */
	public void setAccrued_verify (java.util.List<com.yonyou.ifbp.demo.entity.AccruedVerifyEntity> newAccrued_verify ) {
	 	this.accrued_verify = newAccrued_verify;
	} 	 
	
	/**
	 * 属性 bx_contrast的Getter方法.属性名：冲销对照行
	 *  创建日期:2018-6-5
	 * @return java.util.List<com.yonyou.ifbp.demo.entity.BxContrastEntity>
	 */
	public java.util.List<com.yonyou.ifbp.demo.entity.BxContrastEntity> getBx_contrast () {
		return bx_contrast;
	}
	   
	/**
	 * 属性bx_contrast的Setter方法.属性名：冲销对照行
	 * 创建日期:2018-6-5
	 * @param newBx_contrast java.util.List<com.yonyou.ifbp.demo.entity.BxContrastEntity>
	 */
	public void setBx_contrast (java.util.List<com.yonyou.ifbp.demo.entity.BxContrastEntity> newBx_contrast ) {
	 	this.bx_contrast = newBx_contrast;
	} 	 
	
	/**
	 * 属性 cshare_detail的Getter方法.属性名：事前费用分摊明细
	 *  创建日期:2018-6-5
	 * @return java.util.List<com.yonyou.ifbp.demo.entity.CShareDetailEntity>
	 */
	public java.util.List<com.yonyou.ifbp.demo.entity.CShareDetailEntity> getCshare_detail () {
		return cshare_detail;
	}
	   
	/**
	 * 属性cshare_detail的Setter方法.属性名：事前费用分摊明细
	 * 创建日期:2018-6-5
	 * @param newCshare_detail java.util.List<com.yonyou.ifbp.demo.entity.CShareDetailEntity>
	 */
	public void setCshare_detail (java.util.List<com.yonyou.ifbp.demo.entity.CShareDetailEntity> newCshare_detail ) {
	 	this.cshare_detail = newCshare_detail;
	} 	 
	
	/**
	 * 属性 id_bxtranscostentity的Getter方法.属性名：交通费
	 *  创建日期:2018-6-5
	 * @return java.util.List<com.yonyou.ifbp.demo.entity.BXTransCostEntity>
	 */
	public java.util.List<com.yonyou.ifbp.demo.entity.BXTransCostEntity> getId_bxtranscostentity () {
		return id_bxtranscostentity;
	}
	   
	/**
	 * 属性id_bxtranscostentity的Setter方法.属性名：交通费
	 * 创建日期:2018-6-5
	 * @param newId_bxtranscostentity java.util.List<com.yonyou.ifbp.demo.entity.BXTransCostEntity>
	 */
	public void setId_bxtranscostentity (java.util.List<com.yonyou.ifbp.demo.entity.BXTransCostEntity> newId_bxtranscostentity ) {
	 	this.id_bxtranscostentity = newId_bxtranscostentity;
	} 	 
	
	/**
	 * 属性 id_hotelcostentity的Getter方法.属性名：住宿费
	 *  创建日期:2018-6-5
	 * @return java.util.List<com.yonyou.ifbp.demo.entity.HotelCostEntity>
	 */
	public java.util.List<com.yonyou.ifbp.demo.entity.HotelCostEntity> getId_hotelcostentity () {
		return id_hotelcostentity;
	}
	   
	/**
	 * 属性id_hotelcostentity的Setter方法.属性名：住宿费
	 * 创建日期:2018-6-5
	 * @param newId_hotelcostentity java.util.List<com.yonyou.ifbp.demo.entity.HotelCostEntity>
	 */
	public void setId_hotelcostentity (java.util.List<com.yonyou.ifbp.demo.entity.HotelCostEntity> newId_hotelcostentity ) {
	 	this.id_hotelcostentity = newId_hotelcostentity;
	} 	 
	
	/**
	 * 属性 id_travelallowanceentity的Getter方法.属性名：出差补贴
	 *  创建日期:2018-6-5
	 * @return java.util.List<com.yonyou.ifbp.demo.entity.TravelAllowanceEntity>
	 */
	public java.util.List<com.yonyou.ifbp.demo.entity.TravelAllowanceEntity> getId_travelallowanceentity () {
		return id_travelallowanceentity;
	}
	   
	/**
	 * 属性id_travelallowanceentity的Setter方法.属性名：出差补贴
	 * 创建日期:2018-6-5
	 * @param newId_travelallowanceentity java.util.List<com.yonyou.ifbp.demo.entity.TravelAllowanceEntity>
	 */
	public void setId_travelallowanceentity (java.util.List<com.yonyou.ifbp.demo.entity.TravelAllowanceEntity> newId_travelallowanceentity ) {
	 	this.id_travelallowanceentity = newId_travelallowanceentity;
	} 	 
	
	/**
	 * 属性 dr的Getter方法.属性名：dr
	 *  创建日期:2018-6-5
	 * @return java.lang.Integer
	 */
	public java.lang.Integer getDr () {
		return dr;
	}
	   
	/**
	 * 属性dr的Setter方法.属性名：dr
	 * 创建日期:2018-6-5
	 * @param newDr java.lang.Integer
	 */
	public void setDr (java.lang.Integer newDr ) {
	 	this.dr = newDr;
	} 	 
	
	/**
	 * 属性 ts的Getter方法.属性名：ts
	 *  创建日期:2018-6-5
	 * @return java.util.Date
	 */
	public java.util.Date getTs () {
		return ts;
	}
	   
	/**
	 * 属性ts的Setter方法.属性名：ts
	 * 创建日期:2018-6-5
	 * @param newTs java.util.Date
	 */
	public void setTs (java.util.Date newTs ) {
	 	this.ts = newTs;
	} 	 
	
    @Override
    public String getMetaDefinedName() {
        return "BXHeaderEntity";
    }

    @Override
    public String getNamespace() {
        return "ifbp";
    }
}