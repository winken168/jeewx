package com.jeecg.alipay.sucai.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.jeecg.alipay.util.SystemUtil;

/**
 * 描述：</b>QywxNewstemplate:图文素材模板; InnoDB free: 130048 kB<br>
 * 实体定义规则
 * 字段不允许存在基本类型，必须都是包装类型(因为基本类型有默认值)
 * 基本数据类型  包装类 byte Byte boolean Boolean short Short char Character int Integer long Long float Float double  Double 
 * @author zhoujf
 * @since：2016年03月24日 18时59分45秒 星期四 
 * @version:1.0
 */
public class AlipayNewstemplate implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/*子表实体
	 * 图文素材新闻
	 */
	private List <AlipayNewsitem> iNewsitem;
	
	public List<AlipayNewsitem> getiNewsitem() {
		return iNewsitem;
	}
	public void setiNewsitem(List<AlipayNewsitem> iNewsitem) {
		this.iNewsitem = iNewsitem;
	}
	public String getId() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public String getAccountid() {
		return SystemUtil.getOnlieAlipayAccountId();
	@Override
	public String toString() {
		return "QywxNewstemplate [id=" + id + ", templateName=" + templateName
				+ ", templateType=" + templateType + ", accountid=" + accountid
				+ ", createName=" + createName + ", createBy=" + createBy
				+ ", createDate=" + createDate + ", updateName=" + updateName
				+ ", updateBy=" + updateBy + ", updateDate=" + updateDate + "]";
	}
	
}
