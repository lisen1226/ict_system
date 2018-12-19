package com.dhcc.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.dhcc.mapper.HistoryexamsMapper;

@Controller

public class historyexamsController {
	
	@Autowired
	private HistoryexamsMapper historyexamsMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/show")
	
	public String show() {
		return "exem_tongji";
	}
	
	@RequestMapping(value="/index")
	@ResponseBody
	public String returnIndex() {
		System.out.println("qqq");
		return this.restTemplate.getForObject("http://ict-system-basis/", String.class);
	}
	
	
	@RequestMapping(value="/select1")
	@ResponseBody
	public List selectNumber1() {
		String date = "2018-10";
		List data = historyexamsMapper.selectByTime(date);
		return data;
	}
	
	@RequestMapping(value="/select2")
	@ResponseBody
	public List selectNumber2() {
		String date = "2018-10";
		List data = historyexamsMapper.selectAvgByTime(date);
		return data;
	}
	
	@RequestMapping(value="/select3")
	@ResponseBody
	public List selectNumber3() {
		String date = "2018-10";
		String max = "100";
		String min = "80";
		List data = historyexamsMapper.selectAccuracyByTime(date, max, min);
		System.out.println("aaa");
		for (Object object : data) {
			System.out.println(object.toString());
		}
		return data;
	}
	
}
