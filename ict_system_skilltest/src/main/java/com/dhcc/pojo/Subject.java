package com.dhcc.pojo;

import java.util.List;

public class Subject {
	private String subjectNumber;
	private String subjectTitle;
	private String subjectType;
	private List<String> subjectOptions;

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getSubjectNumber() {
		return subjectNumber;
	}

	public void setSubjectNumber(String subjectNumber) {
		this.subjectNumber = subjectNumber;
	}

	public String getSubjectTitle() {
		return subjectTitle;
	}

	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}

	public List<String> getSubjectOptions() {
		return subjectOptions;
	}

	public void setSubjectOptions(List<String> subjectOptions) {
		this.subjectOptions = subjectOptions;
	}

}
