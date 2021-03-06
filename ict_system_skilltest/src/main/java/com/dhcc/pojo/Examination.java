package com.dhcc.pojo;

public class Examination {
	private Integer id;

	private String examinationNumber;

	private String examinationGenre;

	private String examinationTitle;

	private String examinationRight;

	private String examinationWrong1;

	private String examinationWrong2;

	private String examinationWrong3;

	private String testid;

	private TestType testType;

	private ExaminationType examType;

	public String getTestid() {
		return testid;
	}

	public void setTestid(String testid) {
		this.testid = testid;
	}

	public TestType getTestType() {
		return testType;
	}

	public void setTestType(TestType testType) {
		this.testType = testType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getExaminationNumber() {
		return examinationNumber;
	}

	public void setExaminationNumber(String examinationNumber) {
		this.examinationNumber = examinationNumber == null ? null : examinationNumber.trim();
	}

	public String getExaminationGenre() {
		return examinationGenre;
	}

	public void setExaminationGenre(String examinationGenre) {
		this.examinationGenre = examinationGenre == null ? null : examinationGenre.trim();
	}

	public String getExaminationTitle() {
		return examinationTitle;
	}

	public void setExaminationTitle(String examinationTitle) {
		this.examinationTitle = examinationTitle == null ? null : examinationTitle.trim();
	}

	public String getExaminationRight() {
		return examinationRight;
	}

	public void setExaminationRight(String examinationRight) {
		this.examinationRight = examinationRight == null ? null : examinationRight.trim();
	}

	public String getExaminationWrong1() {
		return examinationWrong1;
	}

	public void setExaminationWrong1(String examinationWrong1) {
		this.examinationWrong1 = examinationWrong1 == null ? null : examinationWrong1.trim();
	}

	public String getExaminationWrong2() {
		return examinationWrong2;
	}

	public void setExaminationWrong2(String examinationWrong2) {
		this.examinationWrong2 = examinationWrong2 == null ? null : examinationWrong2.trim();
	}

	public String getExaminationWrong3() {
		return examinationWrong3;
	}

	public void setExaminationWrong3(String examinationWrong3) {
		this.examinationWrong3 = examinationWrong3 == null ? null : examinationWrong3.trim();
	}

	public ExaminationType getExamType() {
		return examType;
	}

	public void setExamType(ExaminationType examType) {
		this.examType = examType;
	}

}