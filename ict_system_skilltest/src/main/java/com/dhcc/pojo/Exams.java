package com.dhcc.pojo;

import java.util.Date;

public class Exams {
	private int id;
	private String examTitle;
	private String examMsg;
	private String examPermission;
	private Date examDate;
	private String uuid;

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

	public String getExamMsg() {
		return examMsg;
	}

	public void setExamMsg(String examMsg) {
		this.examMsg = examMsg;
	}

	public String getExamPermission() {
		return examPermission;
	}

	public void setExamPermission(String examPermission) {
		this.examPermission = examPermission;
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

}
