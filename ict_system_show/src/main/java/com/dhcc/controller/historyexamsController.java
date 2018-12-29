package com.dhcc.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public String returnIndex() {
		System.out.println("qqq");
		return this.restTemplate.getForObject("http://ict-system-basis/", String.class);
	}
	
	
	/*ajax请求echarts图表*/
	/*echarts1*/
	@RequestMapping(value="/select_echarts1")
	@ResponseBody
	public List selectNumber1(String date) {
		String time = null;
		if("-".equals(String.valueOf(date.charAt(6)))) {
			time = date.substring(0, 5);
		}else {
			time = date.substring(0, 6);
		}
		List data = historyexamsMapper.selectByTime(time);
		return data;
	}
	
	/*echarts2*/
	@RequestMapping(value="/select_echarts2")
	@ResponseBody
	public List selectNumber2(String date) {
		String time = null;
		if("-".equals(String.valueOf(date.charAt(6)))) {
			time = date.substring(0, 5);
		}else {
			time = date.substring(0, 6);
		}
		List data = historyexamsMapper.selectAvgByTime(time);
		return data;
	}
	
	/*echarts3*/
	@RequestMapping(value="/select_echarts3")
	@ResponseBody
	public Map selectNumber3(String date) {
		String time = null;
		if("-".equals(String.valueOf(date.charAt(6)))) {
			time = date.substring(0, 6);
		}else {
			time = date.substring(0, 7);
		}
		System.out.println(time);
		
	
		
		List data4 = historyexamsMapper.selectAccuracyByTime(time, 91, 100);
		List data3 = historyexamsMapper.selectAccuracyByTime(time, 81, 90);
		List data2 = historyexamsMapper.selectAccuracyByTime(time, 71, 80);
		List data1 = historyexamsMapper.selectAccuracyByTime(time, 61, 70);
		List data0 = historyexamsMapper.selectAccuracyByTime(time, 0, 60);

		Map data = new HashMap<>();
		data.put("sixty", data0);
		data.put("seventy", data1);
		data.put("eighty", data2);
		data.put("ninety", data3);
		data.put("hundred", data4);
		
		return data;
	}
}
