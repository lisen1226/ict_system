package com.dhcc.controller;

import java.net.HttpCookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.Document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.pojo.Personnel;
import com.dhcc.service.LoginService;
import com.sun.research.ws.wadl.Response;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	//显示主页
	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}
	//

	// 验证登录
	@RequestMapping("/jump_login")
	public ModelAndView checkLogin(String userName, String password,String remestatus, HttpServletRequest request,HttpServletResponse response) {
		
		Personnel person = loginService.checkLogin(userName, password);
		if (person == null) {
			ModelAndView mv = new ModelAndView("index");
			mv.addObject("msg", "用户名或密码错误！");
			return mv;
		} else {
			HttpSession session = request.getSession();
			session.setAttribute(userName, person);
			ModelAndView mv = new ModelAndView("index");
			mv.addObject("person", person);
			if ("true".equals(remestatus)) {
				SetCookie(person);
			}
			return mv;
		}
	}
	
	/**
	 * 	记住密码
	 * @param personnel
	 * @param response
	 */
	private void SetCookie(Personnel personnel) {
		HttpCookie cookie1 = new HttpCookie("userName", personnel.getUnumber());
		HttpCookie cookie2 = new HttpCookie("userPassword", personnel.getPassword());
	    cookie1.setMaxAge(60*60*24*7);
	    cookie2.setMaxAge(60*60*24*7);
	    
	 }
	/**
	 * 	用户退出销毁session，跳转到登陆页面
	 * @param session
	 * @return
	 */
	public String userExit(HttpSession session) {
		session.invalidate();
		return "index";
	}
	/**
	 * 扩展：
	 * 	1、单点登陆
	 * 	2、md5加密*
	 */
}
