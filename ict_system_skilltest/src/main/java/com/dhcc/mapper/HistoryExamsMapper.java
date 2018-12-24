package com.dhcc.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dhcc.pojo.HistoryExams;

@Mapper
public interface HistoryExamsMapper {

	void insertHistoryExams(HistoryExams hes);

}
