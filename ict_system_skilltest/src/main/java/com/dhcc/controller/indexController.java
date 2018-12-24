package com.dhcc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.pojo.Examination;
import com.dhcc.pojo.Subject;
import com.dhcc.service.ExaminationService;

@Controller
public class indexController {
	@Autowired
	private ExaminationService examService;

	@RequestMapping("showPortal")
	public String showPortal(HttpSession session) {
		if (session.getAttribute("person") == null) {
			return "redirect:showLogin";
		}
		return "portal";
	}

	@RequestMapping("showQ_bank")
	public ModelAndView showQ_bank() {
		ModelAndView mv = new ModelAndView("q_bank");
		List<Examination> exams = examService.selectAllExams();
		mv.addObject("exams", exams);
		return mv;
	}

	

	
}
