package com.dhcc.service;

import com.dhcc.pojo.Personnel;

public interface RegistService {

	/**
	 * 	 注册添加用户
	 * @param person 用户
	 */
	int userRegisted(Personnel person);
	
	/**
	 * 	Ajax查询用户数量
	 */
	int verifyExitByUnumber(String unumber);
	
	/**
	 * Ajax查询手机号数量
	 * @param phone
	 * @return 个数
	 */
	int verifyExitByPhone(String phone);
}
