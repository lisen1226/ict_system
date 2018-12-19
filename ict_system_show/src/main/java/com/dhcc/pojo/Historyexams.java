package com.dhcc.pojo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Historyexams {
    /**
     * 
     */
    private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 考试时间
     */
    private String testtime;

    /**
     * 具体题目
     */
    private String uuid;

    /**
     * 分数
     */
    private String accuracy;

    /**
     * 题目分类
     */
    private String testtype;

    /**
     * 考试类型
     */
    private String examtype;

    public Historyexams(Integer id, String username, String testtime, String uuid, String accuracy, String testtype, String examtype) {
        this.id = id;
        this.username = username;
        this.testtime = testtime;
        this.uuid = uuid;
        this.accuracy = accuracy;
        this.testtype = testtype;
        this.examtype = examtype;
    }

    public Historyexams() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTesttime() {
        return testtime;
    }

    public void setTesttime(String testtime) {
        this.testtime = testtime == null ? null : testtime.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy == null ? null : accuracy.trim();
    }

    public String getTesttype() {
        return testtype;
    }

    public void setTesttype(String testtype) {
        this.testtype = testtype == null ? null : testtype.trim();
    }

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype == null ? null : examtype.trim();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}