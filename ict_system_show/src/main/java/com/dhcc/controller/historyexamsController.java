package com.dhcc.controller;

<<<<<<< HEAD


import static org.mockito.Mockito.timeout;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

=======
>>>>>>> branch 'master' of https://github.com/lisen1226/ict_system.git
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
<<<<<<< HEAD
	
	
	/*ajax请求echarts图表*/
	/*echarts1*/
	@RequestMapping(value="/select_echarts1")
	@ResponseBody
	public List selectNumber1(String date) {
		String time = null;
		if("-".equals(date.charAt(6))) {
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
		if("-".equals(date.charAt(6))) {
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
		if("-".equals(date.charAt(6))) {
			time = date.substring(0, 6);
		}else {
			time = date.substring(0, 7);
		}
		System.out.println(time);
		
	
		
		List data9 = historyexamsMapper.selectAccuracyByTime(time, "100", "90");
		List data8 = historyexamsMapper.selectAccuracyByTime(time, "90", "80");
		List data7 = historyexamsMapper.selectAccuracyByTime(time, "80", "70");
		List data6 = historyexamsMapper.selectAccuracyByTime(time, "80", "60");
		List data5 = historyexamsMapper.selectAccuracyByTime(time, "60", "50");
		List data4 = historyexamsMapper.selectAccuracyByTime(time, "50", "40");
		List data3 = historyexamsMapper.selectAccuracyByTime(time, "40", "30");
		List data2 = historyexamsMapper.selectAccuracyByTime(time, "30", "20");
		List data1 = historyexamsMapper.selectAccuracyByTime(time, "20", "10");
		List data0 = historyexamsMapper.selectAccuracyByTime(time, "10", "0");
		Map data = new HashMap<>();
		data.put("zero", data0);
		data.put("one", data1);
		data.put("two", data2);
		data.put("three", data3);
		data.put("four", data4);
		data.put("five", data5);
		data.put("six", data6);
		data.put("seven", data7);
		data.put("eight", data8);
		data.put("nine", data9);
		
		return data;
	}
	
=======
>>>>>>> branch 'master' of https://github.com/lisen1226/ict_system.git
}
