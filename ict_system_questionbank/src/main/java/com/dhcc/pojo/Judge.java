package com.dhcc.pojo;

import org.springframework.stereotype.Component;

@Component
public class Judge {
    private Integer id;

    private String judgeNumber;

    private String judgeType;

    private String judgeTitle;

    private String judgeCorrect;

    private String judgeComplexity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJudgeNumber() {
        return judgeNumber;
    }

    public void setJudgeNumber(String judgeNumber) {
        this.judgeNumber = judgeNumber;
    }

    public String getJudgeType() {
        return judgeType;
    }

    public void setJudgeType(String judgeType) {
        this.judgeType = judgeType;
    }

    public String getJudgeTitle() {
        return judgeTitle;
    }

    public void setJudgeTitle(String judgeTitle) {
        this.judgeTitle = judgeTitle;
    }

    public String getJudgeCorrect() {
        return judgeCorrect;
    }

    public void setJudgeCorrect(String judgeCorrect) {
        this.judgeCorrect = judgeCorrect;
    }

    public String getJudgeComplexity() {
        return judgeComplexity;
    }

    public void setJudgeComplexity(String judgeComplexity) {
        this.judgeComplexity = judgeComplexity;
    }
}