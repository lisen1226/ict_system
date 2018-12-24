package com.dhcc.service;

import java.util.List;

import com.dhcc.pojo.Historyexams;

public interface ShowExamService {

	/**
	 * 	查询自己考试信息
	 * @param username 姓名
	 * @return List
	 */
	public List<Historyexams> showToOne(String username);
	
	public List<Historyexams> showToInterViewer();
}
