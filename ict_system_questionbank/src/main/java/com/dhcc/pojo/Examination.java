package com.dhcc.pojo;

import org.springframework.stereotype.Component;

@Component
public class Examination {
    private Integer id;

    private String examinationNumber;

    private String examinationGenre;
    
    private String examinationType;
    
    private String examinationTitle;

    private String examinationRight;

    private String examinationWrong1;

    private String examinationWrong2;

    private String examinationWrong3;

    public Examination() {
		super();
	}

	public Examination(String examinationNumber, String examinationGenre, String examinationType,
			String examinationTitle, String examinationRight, String examinationWrong1, String examinationWrong2,
			String examinationWrong3) {
		super();
		this.examinationNumber = examinationNumber;
		this.examinationGenre = examinationGenre;
		this.examinationType = examinationType;
		this.examinationTitle = examinationTitle;
		this.examinationRight = examinationRight;
		this.examinationWrong1 = examinationWrong1;
		this.examinationWrong2 = examinationWrong2;
		this.examinationWrong3 = examinationWrong3;
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

    
    
    public String getExaminationType() {
		return examinationType;
	}

	public void setExaminationType(String examinationType) {
		this.examinationType = examinationType== null ? null : examinationType.trim();
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
}