package com.dhcc.service;

import org.apache.ibatis.annotations.Param;

import com.dhcc.pojo.Personnel;

public interface LoginService {
	/**
	 * 	登陆
	 * @param unumber 账号
	 * @param password	密码
	 * @return Personnel对象
	 */
	public Personnel checkLogin(@Param("unumber") String unumber, @Param("password") String password);
}
