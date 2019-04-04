package com.it.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.it.bean.UserInfo;
import com.it.services.IUserInfoServices;

/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @ClassName: UserInfoServlet.java
* @Description: 用户功能的控制器
*
* @version: v1.0.0
* @author: Only soul
* @date: 2019年4月2日 下午8:42:13 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月2日     Only soul           v1.0.0               修改原因
 */
public class UserInfoServlet {
	IUserInfoServices userInfoServicesImpl;

	public void setUserInfoServicesImpl(IUserInfoServices userInfoServicesImpl) {
		this.userInfoServicesImpl = userInfoServicesImpl;
	}
	public void addUser(UserInfo userInfo) {
		System.out.println("------------添加用户-UserInfoServlet------------");
		userInfoServicesImpl.addUser(userInfo);

	}
	public static void main(String[] args) {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("applicationContext.xml");
		UserInfoServlet userInfoServlet = (UserInfoServlet)context.getBean("userInfoServlet");
		UserInfo userInfo = new UserInfo();
		userInfoServlet.addUser(userInfo);
	}
}
