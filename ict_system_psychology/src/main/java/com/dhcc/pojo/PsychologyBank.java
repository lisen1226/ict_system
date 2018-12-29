package com.dhcc.pojo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class PsychologyBank {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 题目编号
     */
    private String num1;

    /**
     * 题目类型
     */
    private String type;

    /**
     * 题目描述
     */
    private String title;

    /**
     * 答案1
     */
    private String answer1;

    /**
     * 答案1分数
     */
    private String score1;

    /**
     * 答案2
     */
    private String answer2;

    /**
     * 答案2分数
     */
    private String score2;

    /**
     * 答案3
     */
    private String answer3;

    /**
     * 答案3分数
     */
    private String score3;

    /**
     * 答案4
     */
    private String answer4;

    /**
     * 答案4分数
     */
    private String score4;

    /**
     * 答案5
     */
    private String answer5;

    /**
     * 答案5分数
     */
    private String score5;

    /**
     * 答案6
     */
    private String answer6;

    /**
     * 答案6分数
     */
    private String score6;

    public PsychologyBank(Integer id, String num1, String type, String title, String answer1, String score1, String answer2, String score2, String answer3, String score3, String answer4, String score4, String answer5, String score5, String answer6, String score6) {
        this.id = id;
        this.num1 = num1;
        this.type = type;
        this.title = title;
        this.answer1 = answer1;
        this.score1 = score1;
        this.answer2 = answer2;
        this.score2 = score2;
        this.answer3 = answer3;
        this.score3 = score3;
        this.answer4 = answer4;
        this.score4 = score4;
        this.answer5 = answer5;
        this.score5 = score5;
        this.answer6 = answer6;
        this.score6 = score6;
    }

    public PsychologyBank() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1 == null ? null : num1.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1 == null ? null : answer1.trim();
    }

    public String getScore1() {
        return score1;
    }

    public void setScore1(String score1) {
        this.score1 = score1 == null ? null : score1.trim();
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2 == null ? null : answer2.trim();
    }

    public String getScore2() {
        return score2;
    }

    public void setScore2(String score2) {
        this.score2 = score2 == null ? null : score2.trim();
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3 == null ? null : answer3.trim();
    }

    public String getScore3() {
        return score3;
    }

    public void setScore3(String score3) {
        this.score3 = score3 == null ? null : score3.trim();
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4 == null ? null : answer4.trim();
    }

    public String getScore4() {
        return score4;
    }

    public void setScore4(String score4) {
        this.score4 = score4 == null ? null : score4.trim();
    }

    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5 == null ? null : answer5.trim();
    }

    public String getScore5() {
        return score5;
    }

    public void setScore5(String score5) {
        this.score5 = score5 == null ? null : score5.trim();
    }

    public String getAnswer6() {
        return answer6;
    }

    public void setAnswer6(String answer6) {
        this.answer6 = answer6 == null ? null : answer6.trim();
    }

    public String getScore6() {
        return score6;
    }

    public void setScore6(String score6) {
        this.score6 = score6 == null ? null : score6.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}