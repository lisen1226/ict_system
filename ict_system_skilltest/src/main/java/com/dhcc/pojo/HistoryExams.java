package com.dhcc.pojo;

import java.util.Date;
import java.util.List;

public class HistoryExams {
	private int id;
	private String username;
	private Date testTime;
	private String uuid;
	private String accuracy;
	private String testType;
	private String examType;
	private List<DidExams> exams;

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getTestTime() {
		return testTime;
	}

	public void setTestTime(Date testTime) {
		this.testTime = testTime;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public List<DidExams> getExams() {
		return exams;
	}

	public void setExams(List<DidExams> exams) {
		this.exams = exams;
	}

}
