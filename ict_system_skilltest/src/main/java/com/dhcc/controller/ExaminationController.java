package com.dhcc.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dhcc.pojo.ExaminationType;
import com.dhcc.pojo.Exams;
import com.dhcc.pojo.Matter;
import com.dhcc.pojo.Person;
import com.dhcc.pojo.Subject;
import com.dhcc.pojo.TestType;
import com.dhcc.service.ExaminationService;

@Controller
public class ExaminationController {

	@Autowired
	private ExaminationService examService;

	// 根据用户 查出权限 返回对应权限全部的考试信息
	@RequestMapping("/showAllExams")
	public ModelAndView showAllExams() {
		ModelAndView mv = new ModelAndView("all_exams");
		String per = "1"; // 权限 应根据用户查询
		List<Exams> exams = examService.selectAllExamsByPer(per);
		mv.addObject("exams", exams);
		return mv;
	}

	// 检查是否做过本类试卷
	@RequestMapping("checkBasicTest")
	public void checkBasicTest(HttpSession session, PrintWriter out) {
		Person p = (Person) session.getAttribute("person");

		/**
		 * 根据用户查找成绩表 是否存在 即是否做过试卷
		 */
		boolean flag = false;
		if (!flag) {
			out.print("true");
		}
	}

	@RequestMapping("showBasic")
	public ModelAndView showBasic(String examid) {
		ModelAndView mv = new ModelAndView("test_paper2");
		mv.addObject("examid", examid);
		return mv;
	}

	@RequestMapping("creatExam")
	@ResponseBody
	public List<Subject> creatExam(String examid) {
		/**
		 * 查出该用户所对应的出题类型
		 */
		String examType = "00";
		// 查出出题标准
		List<Matter> matters = examService.selectMatters(examid);
		// 根据标准进行随机抽题
		List<Subject> exams = examService.selectByTypeAndNumber(examType, matters);
		return exams;
	}
	
	// 根据类型出卷
		@RequestMapping("showBasicTest1")
		public ModelAndView showBasicTest1(HttpSession session, String examid) {
			ModelAndView mv = new ModelAndView("test_paper3");
 
			/**
			 * 查出该用户所对应的出题类型
			 */
			String examType = "00";
			// 查出出题标准
			List<Matter> matters = examService.selectMatters(examid);
			// 根据标准进行随机抽题
			List<Subject> exams = examService.selectByTypeAndNumber(examType, matters);
			mv.addObject("exams", exams);
			mv.addObject("examid", examid);
			return mv;
		}
	
	
	// 根据类型出卷
	@RequestMapping(value = "showBasicTest", produces = "text/html;charset=UTF-8")
	public ModelAndView showBasicTest(HttpSession session, String examid) {
		ModelAndView mv = new ModelAndView("test_paper");

		/**
		 * 查出该用户所对应的出题类型
		 */
		String examType = "00";
		// 查出出题标准
		List<Matter> matters = examService.selectMatters(examid);
		// 根据标准进行随机抽题
		List<Subject> exams = examService.selectByTypeAndNumber(examType, matters);
		mv.addObject("exams", exams);
		mv.addObject("examid", examid);
		return mv;
	}

	// 显示自由练习页面
	@RequestMapping("showNew_test")
	public ModelAndView showNew_test() {
		ModelAndView mv = new ModelAndView("new_test");
		List<ExaminationType> examTypes = examService.selectAllTestType();
		List<TestType> types = examService.selectAllType();
		mv.addObject("examTypes", examTypes);
		mv.addObject("types", types);
		return mv;
	}

	// 根据所选出题类型进行出题并返回页面
	@RequestMapping(value = "showTest_paper", produces = "text/html;charset=UTF-8")
	public ModelAndView showTest_paper(@RequestBody List<Matter> matters) {
		List<Subject> exams = examService.selectByTypeAndNumber(matters);
		ModelAndView mv = new ModelAndView("test_paper");
		mv.addObject("exams", exams);
		return mv;
	}

	// 处理试卷并保存
	@RequestMapping("saveTest")
	@ResponseBody
	public void saveTest(HttpSession session, String map, String examid, PrintWriter out) {
		Person p = (Person) session.getAttribute("person");
		String accuracy = examService.dealExam("xiaoming", map, examid);
		out.print(accuracy);

	}

}
