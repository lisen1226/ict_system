package com.dhcc.pojo;

import java.util.Date;
import java.util.List;

/**
 * 试卷模板
 * 
 * @author 刘兆辉
 *
 */
public class ExamTem {
	private int id;
	private String exam_tem_title;
	private String exam_tem_type;
	private String exam_tem_easys;
	private Date exam_tem_date;
	private String exam_tem_man;
	private String exam_tem_time;
	private String exam_tem_detail;
	private ExamType examType;
	private List<ExamSub> examSubs;

	public String getExam_tem_type() {
		return exam_tem_type;
	}

	public void setExam_tem_type(String exam_tem_type) {
		this.exam_tem_type = exam_tem_type;
	}

	public ExamType getExamType() {
		return examType;
	}

	public void setExamType(ExamType examType) {
		this.examType = examType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExam_tem_title() {
		return exam_tem_title;
	}

	public void setExam_tem_title(String exam_tem_title) {
		this.exam_tem_title = exam_tem_title;
	}

	public String getExam_tem_easys() {
		return exam_tem_easys;
	}

	public void setExam_tem_easys(String exam_tem_easys) {
		this.exam_tem_easys = exam_tem_easys;
	}

	public Date getExam_tem_date() {
		return exam_tem_date;
	}

	public void setExam_tem_date(Date exam_tem_date) {
		this.exam_tem_date = exam_tem_date;
	}

	public String getExam_tem_man() {
		return exam_tem_man;
	}

	public void setExam_tem_man(String exam_tem_man) {
		this.exam_tem_man = exam_tem_man;
	}

	public String getExam_tem_time() {
		return exam_tem_time;
	}

	public void setExam_tem_time(String exam_tem_time) {
		this.exam_tem_time = exam_tem_time;
	}

	public String getExam_tem_detail() {
		return exam_tem_detail;
	}

	public void setExam_tem_detail(String exam_tem_detail) {
		this.exam_tem_detail = exam_tem_detail;
	}

	public List<ExamSub> getExamSubs() {
		return examSubs;
	}

	public void setExamSubs(List<ExamSub> examSubs) {
		this.examSubs = examSubs;
	}

}
