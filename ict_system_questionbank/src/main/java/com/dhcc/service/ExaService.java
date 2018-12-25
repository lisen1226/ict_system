package com.dhcc.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dhcc.pojo.Examination;
import com.dhcc.pojo.ExaminationType;

public interface ExaService {
	public Map<String,Object> finalAll(int currPage,int pageSize,String examinationGenre);
	public Map<String,Object> finalByType(int currPage,int pageSize,String type,String examinationGenre);
	public void delectExaminById(Integer id);
	public void addExamin(Examination record);
	public List<ExaminationType> selectAllTestType();
	public String importExaminExcel(MultipartFile myFile,int num) throws Exception ;
	public Examination updateFindExamin(Integer id);
	public void updateExamin(Examination record) ;
	public void addType(String typeName);
	public void deleteType(String typeNumber);
	public void updateType(ExaminationType examinationType);
	public ExaminationType finalTypeByNum(String typeNumber);
}
