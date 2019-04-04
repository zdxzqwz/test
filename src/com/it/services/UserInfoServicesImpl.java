package com.it.services;

import com.it.bean.UserInfo;
import com.it.dao.UserInfoDAO;
/**
 * 
* Copyright: Copyright (c) 2019 LanRu-Caifu
* 
* @ClassName: UserInfoServicesImpl.java
* @Description: 服务接口的实现类
*
* @version: v1.0.0
* @author: Only soul
* @date: 2019年4月2日 下午8:35:38 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年4月2日     Only soul           v1.0.0               修改原因
 */
public class UserInfoServicesImpl implements IUserInfoServices {
	UserInfoDAO userInfoDAO = null;

	public void setUserInfoDAO(UserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}

	@Override
	public void addUser(UserInfo userInfo) {
		System.out.println("------------添加用户-UserInfoServicesImpl------------");
		userInfoDAO.addUser(userInfo);

	}

}
