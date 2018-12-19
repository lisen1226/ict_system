package com.dhcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@ResponseBody
public class historyexamsController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/show")
	public String show() {
		return "index";
	}
	
	@RequestMapping(value="/index")
	public String returnIndex() {
		System.out.println("qqq");
		return this.restTemplate.getForObject("http://ict-system-basis/", String.class);
	}
}
