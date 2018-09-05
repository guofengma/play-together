package com.cser.play.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseNotice<M extends BaseNotice<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}
	
	public java.lang.Integer getUserId() {
		return getInt("user_id");
	}

	public void setOpenid(java.lang.String openid) {
		set("openid", openid);
	}
	
	public java.lang.String getOpenid() {
		return getStr("openid");
	}

	public void setFormid(java.lang.String formid) {
		set("formid", formid);
	}
	
	public java.lang.String getFormid() {
		return getStr("formid");
	}

	public void setExpired(java.lang.Long expired) {
		set("expired", expired);
	}
	
	public java.lang.Long getExpired() {
		return getLong("expired");
	}

}