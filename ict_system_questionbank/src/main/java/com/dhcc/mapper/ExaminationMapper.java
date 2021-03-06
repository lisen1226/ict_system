package com.dhcc.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dhcc.pojo.Examination;
import com.dhcc.pojo.ExaminationType;

@Mapper
public interface ExaminationMapper {

	public List<Examination> finalAllExamination();
	public void delectExaminById(Integer id);
	public void addExamin(Examination record);
	public List<Examination> finalByType(Examination record);
	public Integer selectTestType(String type);
	public Examination updateFindExamin(Integer id);
	public void updateExamin(Examination record) ;
	public void addType(ExaminationType examinationType);
	public void deleteType(String typeNumber);
	public void updateType(ExaminationType examinationType);
	public ExaminationType finalTypeByNum(String typeNumber);
	public List<ExaminationType> selectAllTestType();
}