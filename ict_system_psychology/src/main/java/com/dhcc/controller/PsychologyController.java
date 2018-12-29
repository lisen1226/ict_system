package com.dhcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dhcc.mapper.PsychologyBankMapper;
import com.dhcc.service.PsychologyService;


@Controller
public class PsychologyController {
	
	@Autowired
	private PsychologyBankMapper psychologyBankMapper;
	
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	
	@RequestMapping("/html/exam")
	public String exam() {
		return "html/exam";
	}
	
	@RequestMapping("/eaxm/psychology-selectAll")
	@ResponseBody
	public List psychology_selectAll(String number) {
		int numberInt = Integer.parseInt(number);
		System.out.println(numberInt);
		List list = psychologyBankMapper.selectByExample(null);
		for (Object object : list) {
			System.out.println(object.toString());
		}
		return list;
	}
	
	@RequestMapping("/html/exam-paper")
	public String exam_paper() {
		return "html/exam-paper";
	}
	
	
}
