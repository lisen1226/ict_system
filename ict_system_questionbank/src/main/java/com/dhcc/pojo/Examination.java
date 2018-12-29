package com.dhcc.pojo;

import org.springframework.stereotype.Component;

@Component
public class Examination {
    private Integer id;

    private String examinationNumber;
    
    private String examinationType;
    
    private String examinationTitle;

    private String examinationAnswer1;

    private String examinationAnswer2;

    private String examinationAnswer3;

    private String examinationAnswer4;
    private String examinationCorrect;
    private String examinationComplexity;

    public Examination() {
		super();
	}

	public Examination(String examinationNumber, String examinationType, String examinationTitle,
			String examinationAnswer1, String examinationAnswer2, String examinationAnswer3, String examinationAnswer4,
			String examinationCorrect, String examinationComplexity) {
		super();
		this.examinationNumber = examinationNumber;
		this.examinationType = examinationType;
		this.examinationTitle = examinationTitle;
		this.examinationAnswer1 = examinationAnswer1;
		this.examinationAnswer2 = examinationAnswer2;
		this.examinationAnswer3 = examinationAnswer3;
		this.examinationAnswer4 = examinationAnswer4;
		this.examinationCorrect = examinationCorrect;
		this.examinationComplexity = examinationComplexity;
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
		this.examinationNumber = examinationNumber;
	}

	public String getExaminationType() {
		return examinationType;
	}

	public void setExaminationType(String examinationType) {
		this.examinationType = examinationType;
	}

	public String getExaminationTitle() {
		return examinationTitle;
	}

	public void setExaminationTitle(String examinationTitle) {
		this.examinationTitle = examinationTitle;
	}

	public String getExaminationAnswer1() {
		return examinationAnswer1;
	}

	public void setExaminationAnswer1(String examinationAnswer1) {
		this.examinationAnswer1 = examinationAnswer1;
	}

	public String getExaminationAnswer2() {
		return examinationAnswer2;
	}

	public void setExaminationAnswer2(String examinationAnswer2) {
		this.examinationAnswer2 = examinationAnswer2;
	}

	public String getExaminationAnswer3() {
		return examinationAnswer3;
	}

	public void setExaminationAnswer3(String examinationAnswer3) {
		this.examinationAnswer3 = examinationAnswer3;
	}

	public String getExaminationAnswer4() {
		return examinationAnswer4;
	}

	public void setExaminationAnswer4(String examinationAnswer4) {
		this.examinationAnswer4 = examinationAnswer4;
	}

	public String getExaminationCorrect() {
		return examinationCorrect;
	}

	public void setExaminationCorrect(String examinationCorrect) {
		this.examinationCorrect = examinationCorrect;
	}

	public String getExaminationComplexity() {
		return examinationComplexity;
	}

	public void setExaminationComplexity(String examinationComplexity) {
		this.examinationComplexity = examinationComplexity;
	}

}