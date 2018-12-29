package com.dhcc.pojo;

/**
 * 考试类型（基础笔试、心理测试、季度考核）
 * 
 * @author 刘兆辉
 *
 */
public class ExamType {
	private int id;
	private String exam_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}

}
