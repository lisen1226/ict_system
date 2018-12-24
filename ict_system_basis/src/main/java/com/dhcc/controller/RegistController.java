package com.dhcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.pojo.Personnel;
import com.dhcc.service.RegistService;

@Controller
public class RegistController {

	@Autowired
	private RegistService registService;

	/**
	 * 	注册操作
	 * @param newperson 用户对象
	 * @return 视图模型
	 */
	@RequestMapping("jump_regist")
	public ModelAndView getds(Personnel newperson) {
		ModelAndView mv; 
		Personnel person = new Personnel();
		person.setUname(newperson.getUname());//姓名
		person.setUnumber(newperson.getUnumber());//账号
		person.setPassword(newperson.getPassword());//密码
		person.setPhone(newperson.getPhone());//手机
		Integer result = registService.userRegisted(person);
		if (result == 1) {
			mv = new ModelAndView("index");
			mv.addObject("result", "注册成功");			//注册成功
		} else {
			mv = new ModelAndView("index");
			mv.addObject("result", "注册失败");			//注册失败
		}
		return mv;
	}
	/**
	 * 	ajax验证账号
	 * @param unumber 账号
	 */
	@RequestMapping("/verifyunumber")
	@ResponseBody
	public int checkUnumber(String unumber) {
		int unumbercount = registService.verifyExitByUnumber(unumber);
		return unumbercount;
	}
	
	/**
	 * 	ajax验证手机号
	 * @param phone 
	 */
	@RequestMapping("/verifyphone")
	@ResponseBody
	public int checkPhone(String phone) {
		int phonecount = registService.verifyExitByPhone(phone);
		return phonecount;
	}
}
