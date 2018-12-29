package com.dhcc.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dhcc.pojo.Examination;
import com.dhcc.pojo.ExaminationType;

public interface ExaService {
	public List<Examination> finalByType(Examination examin);
	public void delectExaminById(Integer id);
	public void addExamin(Examination record);
	public List<ExaminationType> selectAllTestType();
	public void importExaminExcel(Examination record) ;
	public Examination updateFindExamin(Integer id);
	public void addType(String typeName);
	public void deleteType(String typeNumber);
	public void updateType(ExaminationType examinationType);
	public ExaminationType finalTypeByNum(String typeNumber);
	public  List<Examination> finalAllExamination();
	public Integer selectTestType(String type);
	public int updateExamin(Examination record) ;

}
