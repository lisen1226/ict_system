package com.dhcc.pojo;

import org.springframework.stereotype.Component;

@Component
public class MultipleChoice {
    private Integer id;

    private String multipleChoiceNumber;

    private String multipleChoiceType;

    private String multipleChoiceTitle;

    private String multipleChoiceAnswer1;

    private String multipleChoiceAnswer2;

    private String multipleChoiceAnswer3;

    private String multipleChoiceAnswer4;

    private String multipleChoiceAnswer5;

    private String multipleChoiceCorrect;

    private String multipleChoiceComplexity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMultipleChoiceNumber() {
        return multipleChoiceNumber;
    }

    public void setMultipleChoiceNumber(String multipleChoiceNumber) {
        this.multipleChoiceNumber = multipleChoiceNumber;
    }

    public String getMultipleChoiceType() {
        return multipleChoiceType;
    }

    public void setMultipleChoiceType(String multipleChoiceType) {
        this.multipleChoiceType = multipleChoiceType;
    }

    public String getMultipleChoiceTitle() {
        return multipleChoiceTitle;
    }

    public void setMultipleChoiceTitle(String multipleChoiceTitle) {
        this.multipleChoiceTitle = multipleChoiceTitle;
    }

    public String getMultipleChoiceAnswer1() {
        return multipleChoiceAnswer1;
    }

    public void setMultipleChoiceAnswer1(String multipleChoiceAnswer1) {
        this.multipleChoiceAnswer1 = multipleChoiceAnswer1;
    }

    public String getMultipleChoiceAnswer2() {
        return multipleChoiceAnswer2;
    }

    public void setMultipleChoiceAnswer2(String multipleChoiceAnswer2) {
        this.multipleChoiceAnswer2 = multipleChoiceAnswer2;
    }

    public String getMultipleChoiceAnswer3() {
        return multipleChoiceAnswer3;
    }

    public void setMultipleChoiceAnswer3(String multipleChoiceAnswer3) {
        this.multipleChoiceAnswer3 = multipleChoiceAnswer3;
    }

    public String getMultipleChoiceAnswer4() {
        return multipleChoiceAnswer4;
    }

    public void setMultipleChoiceAnswer4(String multipleChoiceAnswer4) {
        this.multipleChoiceAnswer4 = multipleChoiceAnswer4;
    }

    public String getMultipleChoiceAnswer5() {
        return multipleChoiceAnswer5;
    }

    public void setMultipleChoiceAnswer5(String multipleChoiceAnswer5) {
        this.multipleChoiceAnswer5 = multipleChoiceAnswer5;
    }

    public String getMultipleChoiceCorrect() {
        return multipleChoiceCorrect;
    }

    public void setMultipleChoiceCorrect(String multipleChoiceCorrect) {
        this.multipleChoiceCorrect = multipleChoiceCorrect;
    }

    public String getMultipleChoiceComplexity() {
        return multipleChoiceComplexity;
    }

    public void setMultipleChoiceComplexity(String multipleChoiceComplexity) {
        this.multipleChoiceComplexity = multipleChoiceComplexity;
    }
}