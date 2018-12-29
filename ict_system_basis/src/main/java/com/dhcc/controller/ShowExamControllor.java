package com.dhcc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.pojo.Historyexams;
import com.dhcc.service.ShowExamService;

@Controller
public class ShowExamControllor {
	
	@Autowired
	ShowExamService showExamService;
	@RequestMapping("/exam")
	public String getpage() {
		return "showExamByOne";
	}
	
	@RequestMapping("ExamByOne")
	@ResponseBody
	public List<Historyexams> examShowByOne(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		List<Historyexams> list = showExamService.showToOne("24");
		return list;
	}
	
	
}
