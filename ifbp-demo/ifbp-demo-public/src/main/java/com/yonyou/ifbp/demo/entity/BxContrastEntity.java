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
@Entity(namespace = "ifbp",name = "BxContrastEntity")
@Table(name = "bx_contrast")
public class BxContrastEntity extends BaseEntity{
	 
    @FK(name = "pk_example", referenceTableName = "bx_header", referencedColumnName = "pk") 
    @Column(name = "pk_example")
    private java.lang.String pk_example;
    
    @Id
    @GeneratedValue(strategy = Stragegy.UAPOID, moudle = "")  
    @Column(name = "pk")
    private java.lang.String pk;
      
    @Column(name = "pk_finitem")
    private java.lang.String pk_finitem;
      
    @Column(name = "pk_bxd")
    private java.lang.String pk_bxd;
      
    @Column(name = "pk_jkd")
    private java.lang.String pk_jkd;
      
    @Column(name = "fyybje")
    private java.lang.Double fyybje;
      
    @Column(name = "fybbje")
    private java.lang.Double fybbje;
      
    @Column(name = "cxnd")
    private java.lang.String cxnd;
      
    @Column(name = "cxqj")
    private java.lang.String cxqj;
      
    @Column(name = "ybje")
    private java.lang.Double ybje;
      
    @Column(name = "bbje")
    private java.lang.Double bbje;
      
    @Column(name = "sxrq")
    private java.util.Date sxrq;
      
    @Column(name = "djlxbm")
    private java.lang.String djlxbm;
      
    @Column(name = "cxrq")
    private java.util.Date cxrq;
      
    @Column(name = "cjkybje")
    private java.lang.Double cjkybje;
      
    @Column(name = "cjkbbje")
    private java.lang.Double cjkbbje;
      
    @Column(name = "pk_pc")
    private java.lang.String pk_pc;
      
    @Column(name = "bxdjbh")
    private java.lang.String bxdjbh;
      
    @Column(name = "jkdjbh")
    private java.lang.String jkdjbh;
      
    @Column(name = "sxbz")
    private java.lang.Double sxbz;
      
    @Column(name = "groupfybbje")
    private java.lang.Double groupfybbje;
      
    @Column(name = "groupbbje")
    private java.lang.Double groupbbje;
      
    @Column(name = "groupcjkbbje")
    private java.lang.Double groupcjkbbje;
      
    @Column(name = "globalfybbje")
    private java.lang.Double globalfybbje;
      
    @Column(name = "globalbbje")
    private java.lang.Double globalbbje;
      
    @Column(name = "globalcjkbbje")
    private java.lang.Double globalcjkbbje;
      
    @Column(name = "hkybje")
    private java.lang.Double hkybje;
      
    @Column(name = "hkbbje")
    private java.lang.Double hkbbje;
      
    @Column(name = "bbhl")
    private java.lang.Double bbhl;
      
    @Column(name = "groupbbhl")
    private java.lang.Double groupbbhl;
      
    @Column(name = "globalbbhl")
    private java.lang.Double globalbbhl;
      
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
	 * 属性 pk的Getter方法.属性名：冲销对照行标识
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk () {
		return pk;
	}
	   
	/**
	 * 属性pk的Setter方法.属性名：冲销对照行标识
	 * 创建日期:2018-6-4
	 * @param newPk java.lang.String
	 */
	public void setPk (java.lang.String newPk ) {
	 	this.pk = newPk;
	} 	 
	
	/**
	 * 属性 pk_finitem的Getter方法.属性名：报销单财务行标识
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_finitem () {
		return pk_finitem;
	}
	   
	/**
	 * 属性pk_finitem的Setter方法.属性名：报销单财务行标识
	 * 创建日期:2018-6-4
	 * @param newPk_finitem java.lang.String
	 */
	public void setPk_finitem (java.lang.String newPk_finitem ) {
	 	this.pk_finitem = newPk_finitem;
	} 	 
	
	/**
	 * 属性 pk_bxd的Getter方法.属性名：报销单标识
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_bxd () {
		return pk_bxd;
	}
	   
	/**
	 * 属性pk_bxd的Setter方法.属性名：报销单标识
	 * 创建日期:2018-6-4
	 * @param newPk_bxd java.lang.String
	 */
	public void setPk_bxd (java.lang.String newPk_bxd ) {
	 	this.pk_bxd = newPk_bxd;
	} 	 
	
	/**
	 * 属性 pk_jkd的Getter方法.属性名：借款单标识
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_jkd () {
		return pk_jkd;
	}
	   
	/**
	 * 属性pk_jkd的Setter方法.属性名：借款单标识
	 * 创建日期:2018-6-4
	 * @param newPk_jkd java.lang.String
	 */
	public void setPk_jkd (java.lang.String newPk_jkd ) {
	 	this.pk_jkd = newPk_jkd;
	} 	 
	
	/**
	 * 属性 fyybje的Getter方法.属性名：费用原币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getFyybje () {
		return fyybje;
	}
	   
	/**
	 * 属性fyybje的Setter方法.属性名：费用原币金额
	 * 创建日期:2018-6-4
	 * @param newFyybje java.lang.Double
	 */
	public void setFyybje (java.lang.Double newFyybje ) {
	 	this.fyybje = newFyybje;
	} 	 
	
	/**
	 * 属性 fybbje的Getter方法.属性名：费用本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getFybbje () {
		return fybbje;
	}
	   
	/**
	 * 属性fybbje的Setter方法.属性名：费用本币金额
	 * 创建日期:2018-6-4
	 * @param newFybbje java.lang.Double
	 */
	public void setFybbje (java.lang.Double newFybbje ) {
	 	this.fybbje = newFybbje;
	} 	 
	
	/**
	 * 属性 cxnd的Getter方法.属性名：会计年度
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getCxnd () {
		return cxnd;
	}
	   
	/**
	 * 属性cxnd的Setter方法.属性名：会计年度
	 * 创建日期:2018-6-4
	 * @param newCxnd java.lang.String
	 */
	public void setCxnd (java.lang.String newCxnd ) {
	 	this.cxnd = newCxnd;
	} 	 
	
	/**
	 * 属性 cxqj的Getter方法.属性名：会计期间
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getCxqj () {
		return cxqj;
	}
	   
	/**
	 * 属性cxqj的Setter方法.属性名：会计期间
	 * 创建日期:2018-6-4
	 * @param newCxqj java.lang.String
	 */
	public void setCxqj (java.lang.String newCxqj ) {
	 	this.cxqj = newCxqj;
	} 	 
	
	/**
	 * 属性 ybje的Getter方法.属性名：原币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getYbje () {
		return ybje;
	}
	   
	/**
	 * 属性ybje的Setter方法.属性名：原币金额
	 * 创建日期:2018-6-4
	 * @param newYbje java.lang.Double
	 */
	public void setYbje (java.lang.Double newYbje ) {
	 	this.ybje = newYbje;
	} 	 
	
	/**
	 * 属性 bbje的Getter方法.属性名：本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getBbje () {
		return bbje;
	}
	   
	/**
	 * 属性bbje的Setter方法.属性名：本币金额
	 * 创建日期:2018-6-4
	 * @param newBbje java.lang.Double
	 */
	public void setBbje (java.lang.Double newBbje ) {
	 	this.bbje = newBbje;
	} 	 
	
	/**
	 * 属性 sxrq的Getter方法.属性名：生效日期
	 *  创建日期:2018-6-4
	 * @return java.util.Date
	 */
	public java.util.Date getSxrq () {
		return sxrq;
	}
	   
	/**
	 * 属性sxrq的Setter方法.属性名：生效日期
	 * 创建日期:2018-6-4
	 * @param newSxrq java.util.Date
	 */
	public void setSxrq (java.util.Date newSxrq ) {
	 	this.sxrq = newSxrq;
	} 	 
	
	/**
	 * 属性 djlxbm的Getter方法.属性名：单据类型编码
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getDjlxbm () {
		return djlxbm;
	}
	   
	/**
	 * 属性djlxbm的Setter方法.属性名：单据类型编码
	 * 创建日期:2018-6-4
	 * @param newDjlxbm java.lang.String
	 */
	public void setDjlxbm (java.lang.String newDjlxbm ) {
	 	this.djlxbm = newDjlxbm;
	} 	 
	
	/**
	 * 属性 cxrq的Getter方法.属性名：冲销日期
	 *  创建日期:2018-6-4
	 * @return java.util.Date
	 */
	public java.util.Date getCxrq () {
		return cxrq;
	}
	   
	/**
	 * 属性cxrq的Setter方法.属性名：冲销日期
	 * 创建日期:2018-6-4
	 * @param newCxrq java.util.Date
	 */
	public void setCxrq (java.util.Date newCxrq ) {
	 	this.cxrq = newCxrq;
	} 	 
	
	/**
	 * 属性 cjkybje的Getter方法.属性名：冲销原币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getCjkybje () {
		return cjkybje;
	}
	   
	/**
	 * 属性cjkybje的Setter方法.属性名：冲销原币金额
	 * 创建日期:2018-6-4
	 * @param newCjkybje java.lang.Double
	 */
	public void setCjkybje (java.lang.Double newCjkybje ) {
	 	this.cjkybje = newCjkybje;
	} 	 
	
	/**
	 * 属性 cjkbbje的Getter方法.属性名：冲销本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getCjkbbje () {
		return cjkbbje;
	}
	   
	/**
	 * 属性cjkbbje的Setter方法.属性名：冲销本币金额
	 * 创建日期:2018-6-4
	 * @param newCjkbbje java.lang.Double
	 */
	public void setCjkbbje (java.lang.Double newCjkbbje ) {
	 	this.cjkbbje = newCjkbbje;
	} 	 
	
	/**
	 * 属性 pk_pc的Getter方法.属性名：冲销批次主键
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getPk_pc () {
		return pk_pc;
	}
	   
	/**
	 * 属性pk_pc的Setter方法.属性名：冲销批次主键
	 * 创建日期:2018-6-4
	 * @param newPk_pc java.lang.String
	 */
	public void setPk_pc (java.lang.String newPk_pc ) {
	 	this.pk_pc = newPk_pc;
	} 	 
	
	/**
	 * 属性 bxdjbh的Getter方法.属性名：报销单号
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getBxdjbh () {
		return bxdjbh;
	}
	   
	/**
	 * 属性bxdjbh的Setter方法.属性名：报销单号
	 * 创建日期:2018-6-4
	 * @param newBxdjbh java.lang.String
	 */
	public void setBxdjbh (java.lang.String newBxdjbh ) {
	 	this.bxdjbh = newBxdjbh;
	} 	 
	
	/**
	 * 属性 jkdjbh的Getter方法.属性名：借款单号
	 *  创建日期:2018-6-4
	 * @return java.lang.String
	 */
	public java.lang.String getJkdjbh () {
		return jkdjbh;
	}
	   
	/**
	 * 属性jkdjbh的Setter方法.属性名：借款单号
	 * 创建日期:2018-6-4
	 * @param newJkdjbh java.lang.String
	 */
	public void setJkdjbh (java.lang.String newJkdjbh ) {
	 	this.jkdjbh = newJkdjbh;
	} 	 
	
	/**
	 * 属性 sxbz的Getter方法.属性名：生效标志
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getSxbz () {
		return sxbz;
	}
	   
	/**
	 * 属性sxbz的Setter方法.属性名：生效标志
	 * 创建日期:2018-6-4
	 * @param newSxbz java.lang.Double
	 */
	public void setSxbz (java.lang.Double newSxbz ) {
	 	this.sxbz = newSxbz;
	} 	 
	
	/**
	 * 属性 groupfybbje的Getter方法.属性名：集团费用本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getGroupfybbje () {
		return groupfybbje;
	}
	   
	/**
	 * 属性groupfybbje的Setter方法.属性名：集团费用本币金额
	 * 创建日期:2018-6-4
	 * @param newGroupfybbje java.lang.Double
	 */
	public void setGroupfybbje (java.lang.Double newGroupfybbje ) {
	 	this.groupfybbje = newGroupfybbje;
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
	 * 属性 groupcjkbbje的Getter方法.属性名：集团冲销本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getGroupcjkbbje () {
		return groupcjkbbje;
	}
	   
	/**
	 * 属性groupcjkbbje的Setter方法.属性名：集团冲销本币金额
	 * 创建日期:2018-6-4
	 * @param newGroupcjkbbje java.lang.Double
	 */
	public void setGroupcjkbbje (java.lang.Double newGroupcjkbbje ) {
	 	this.groupcjkbbje = newGroupcjkbbje;
	} 	 
	
	/**
	 * 属性 globalfybbje的Getter方法.属性名：全局费用本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobalfybbje () {
		return globalfybbje;
	}
	   
	/**
	 * 属性globalfybbje的Setter方法.属性名：全局费用本币金额
	 * 创建日期:2018-6-4
	 * @param newGlobalfybbje java.lang.Double
	 */
	public void setGlobalfybbje (java.lang.Double newGlobalfybbje ) {
	 	this.globalfybbje = newGlobalfybbje;
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
	 * 属性 globalcjkbbje的Getter方法.属性名：全局冲销本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getGlobalcjkbbje () {
		return globalcjkbbje;
	}
	   
	/**
	 * 属性globalcjkbbje的Setter方法.属性名：全局冲销本币金额
	 * 创建日期:2018-6-4
	 * @param newGlobalcjkbbje java.lang.Double
	 */
	public void setGlobalcjkbbje (java.lang.Double newGlobalcjkbbje ) {
	 	this.globalcjkbbje = newGlobalcjkbbje;
	} 	 
	
	/**
	 * 属性 hkybje的Getter方法.属性名：还款原币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getHkybje () {
		return hkybje;
	}
	   
	/**
	 * 属性hkybje的Setter方法.属性名：还款原币金额
	 * 创建日期:2018-6-4
	 * @param newHkybje java.lang.Double
	 */
	public void setHkybje (java.lang.Double newHkybje ) {
	 	this.hkybje = newHkybje;
	} 	 
	
	/**
	 * 属性 hkbbje的Getter方法.属性名：还款本币金额
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getHkbbje () {
		return hkbbje;
	}
	   
	/**
	 * 属性hkbbje的Setter方法.属性名：还款本币金额
	 * 创建日期:2018-6-4
	 * @param newHkbbje java.lang.Double
	 */
	public void setHkbbje (java.lang.Double newHkbbje ) {
	 	this.hkbbje = newHkbbje;
	} 	 
	
	/**
	 * 属性 bbhl的Getter方法.属性名：本币汇率
	 *  创建日期:2018-6-4
	 * @return java.lang.Double
	 */
	public java.lang.Double getBbhl () {
		return bbhl;
	}
	   
	/**
	 * 属性bbhl的Setter方法.属性名：本币汇率
	 * 创建日期:2018-6-4
	 * @param newBbhl java.lang.Double
	 */
	public void setBbhl (java.lang.Double newBbhl ) {
	 	this.bbhl = newBbhl;
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
        return "BxContrastEntity";
    }

    @Override
    public String getNamespace() {
        return "ifbp";
    }
}