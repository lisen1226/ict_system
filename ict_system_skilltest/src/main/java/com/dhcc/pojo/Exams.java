package com.dhcc.pojo;

import java.util.Date;
import java.util.List;

/**
 * 试卷表
 * 
 * @author 刘兆辉
 *
 */
public class Exams {
	private int id;
	private String examTitle; // 试卷名称
	private String examType; // 试卷类型（java，心理）
	private String examPrivate; // 是否私有试卷
	private Date examDate; // 试卷发布/创建时间
	private String uuid; // 对应具体题目
	private List<ExamSub> examSubs; // 题目规则
	private String examVia; // 发布者/试卷创建者
	private String examStartDate; // 考试开始日期 （-1为不限制）
	private String examEndDate; // 考试截至日期 （-1为不限制）
	private int examCount; // 试卷次数限制（-1为不限制）
	private String examEmpower; // 授权（-1为不限制，否则对应授权表）
	private Empower empower; // 授权表
	private String examTime; // 考试时间
	private String examFixed; // 是否固定题（-1为不固定 每次随机抽题 否则对应题目表）
	private ExamSubjects examSubjects; // 固定题目表
	private String examEasys;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExamTitle() {
		return examTitle;
	}

	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getExamStartDate() {
		return examStartDate;
	}

	public void setExamStartDate(String examStartDate) {
		this.examStartDate = examStartDate;
	}

	public String getExamPrivate() {
		return examPrivate;
	}

	public void setExamPrivate(String examPrivate) {
		this.examPrivate = examPrivate;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public List<ExamSub> getExamSubs() {
		return examSubs;
	}

	public void setExamSubs(List<ExamSub> examSubs) {
		this.examSubs = examSubs;
	}

	public String getExamVia() {
		return examVia;
	}

	public void setExamVia(String examVia) {
		this.examVia = examVia;
	}

	public String getExamEndDate() {
		return examEndDate;
	}

	public void setExamEndDate(String examEndDate) {
		this.examEndDate = examEndDate;
	}

	public int getExamCount() {
		return examCount;
	}

	public void setExamCount(int examCount) {
		this.examCount = examCount;
	}

	public String getExamEmpower() {
		return examEmpower;
	}

	public void setExamEmpower(String examEmpower) {
		this.examEmpower = examEmpower;
	}

	public Empower getEmpower() {
		return empower;
	}

	public void setEmpower(Empower empower) {
		this.empower = empower;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public String getExamFixed() {
		return examFixed;
	}

	public void setExamFixed(String examFixed) {
		this.examFixed = examFixed;
	}

	public ExamSubjects getExamSubjects() {
		return examSubjects;
	}

	public void setExamSubjects(ExamSubjects examSubjects) {
		this.examSubjects = examSubjects;
	}

	public String getExamEasys() {
		return examEasys;
	}

	public void setExamEasys(String examEasys) {
		this.examEasys = examEasys;
	}

}
