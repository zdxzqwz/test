package com.it.bean;
/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @ClassName: UserInfo.java
* @Description: 用户类
*
* @version: v1.0.0
* @author: Only soul
* @date: 2019年4月2日 下午8:32:13 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月2日     Only soul           v1.0.0               修改原因
 */
public class UserInfo {
	private String user_id;
	private String user_name;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public UserInfo(String user_id, String user_name) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserInfo [user_id=" + user_id + ", user_name=" + user_name + "]";
	}
	
}
