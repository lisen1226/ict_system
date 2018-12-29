package com.dhcc.service;

import java.util.List;

import com.dhcc.pojo.ExamTem;
import com.dhcc.pojo.ExamType;
import com.dhcc.pojo.Examination;
import com.dhcc.pojo.ExaminationType;
import com.dhcc.pojo.Exams;
import com.dhcc.pojo.Matter;
import com.dhcc.pojo.Subject;
import com.dhcc.pojo.TestType;

public interface ExaminationService {
	

	List<Examination> selectAllExams();

	String dealExam(String string, String map, String examid);

	List<ExaminationType> selectAllTestType();

	List<TestType> selectAllType();

	List<Subject> selectByTypeAndNumber(List<Matter> matters);

	List<Exams> selectAllExamsByPer(String per);

	List<Matter> selectMatters(String examid);

	List<Subject> selectByTypeAndNumber(String examType, List<Matter> matters);

	List<ExamTem> selectAllExamTems();

	List<ExamType> selectAllExamTypes();

	int saveExam(Exams exams);
}
