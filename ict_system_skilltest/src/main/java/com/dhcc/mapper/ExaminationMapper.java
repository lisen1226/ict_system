package com.dhcc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dhcc.pojo.Empower;
import com.dhcc.pojo.ExamSub;
import com.dhcc.pojo.ExamTem;
import com.dhcc.pojo.ExamType;
import com.dhcc.pojo.Examination;
import com.dhcc.pojo.ExaminationType;
import com.dhcc.pojo.Exams;
import com.dhcc.pojo.Matter;
import com.dhcc.pojo.TestType;

@Mapper
public interface ExaminationMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(Examination record);

	int insertSelective(Examination record);

	List<Examination> selectAllExams();

	Examination selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Examination record);

	int updateByPrimaryKey(Examination record);

	List<Examination> selectByTypeAndNumber(@Param("testType") String testType, @Param("testNumber") int testNumber,
			@Param("type") String type);

	String selectRightByTestId(String ans);

	List<ExaminationType> selectAllTestType();

	List<TestType> selectAllType();

	List<Exams> selectAllExamsByPer(String per);

	List<Matter> selectMatters(String examid);

	List<ExamTem> selectAllExamTems();

	List<ExamType> selectAllExamTypes();

	void saveSub(ExamSub sub);

	int saveExam(Exams exams);

	int saveEmpower(Empower ep);
}