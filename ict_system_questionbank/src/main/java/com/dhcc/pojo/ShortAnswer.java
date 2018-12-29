package com.dhcc.pojo;

import org.springframework.stereotype.Component;

@Component
public class ShortAnswer {
    private Integer id;

    private String shortAnswerNumber;

    private String shortAnswerType;

    private String shortAnswerTitle;

    private String shortAnswerCorrect;

    private String shortAnswerComplexity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortAnswerNumber() {
        return shortAnswerNumber;
    }

    public void setShortAnswerNumber(String shortAnswerNumber) {
        this.shortAnswerNumber = shortAnswerNumber;
    }

    public String getShortAnswerType() {
        return shortAnswerType;
    }

    public void setShortAnswerType(String shortAnswerType) {
        this.shortAnswerType = shortAnswerType;
    }

    public String getShortAnswerTitle() {
        return shortAnswerTitle;
    }

    public void setShortAnswerTitle(String shortAnswerTitle) {
        this.shortAnswerTitle = shortAnswerTitle;
    }

    public String getShortAnswerCorrect() {
        return shortAnswerCorrect;
    }

    public void setShortAnswerCorrect(String shortAnswerCorrect) {
        this.shortAnswerCorrect = shortAnswerCorrect;
    }

    public String getShortAnswerComplexity() {
        return shortAnswerComplexity;
    }

    public void setShortAnswerComplexity(String shortAnswerComplexity) {
        this.shortAnswerComplexity = shortAnswerComplexity;
    }
}