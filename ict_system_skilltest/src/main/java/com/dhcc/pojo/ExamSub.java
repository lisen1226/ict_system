package com.dhcc.pojo;

/**
 * 模板规则
 * 
 * @author 刘兆辉
 *
 */
public class ExamSub {
	private int id;
	private String exam_kind;
	private String exam_type;
	private String exam_easy;
	private String exam_score;
	private int exam_count;
	private String exam_tem;
	private ExaminationType examType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExam_score() {
		return exam_score;
	}

	public void setExam_score(String exam_score) {
		this.exam_score = exam_score;
	}

	public int getExam_count() {
		return exam_count;
	}

	public void setExam_count(int exam_count) {
		this.exam_count = exam_count;
	}

	public String getExam_tem() {
		return exam_tem;
	}

	public void setExam_tem(String exam_tem) {
		this.exam_tem = exam_tem;
	}

	public String getExam_kind() {
		return exam_kind;
	}

	public void setExam_kind(String exam_kind) {
		this.exam_kind = exam_kind;
	}

	public String getExam_type() {
		return exam_type;
	}

	public void setExam_type(String exam_type) {
		this.exam_type = exam_type;
	}

	public String getExam_easy() {
		return exam_easy;
	}

	public void setExam_easy(String exam_easy) {
		this.exam_easy = exam_easy;
	}

	public int getCount() {
		return exam_count;
	}

	public void setCount(int exam_count) {
		this.exam_count = exam_count;
	}

	public ExaminationType getExamType() {
		return examType;
	}

	public void setExamType(ExaminationType examType) {
		this.examType = examType;
	}

}
