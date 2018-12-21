package com.dhcc.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dhcc.pojo.DidExams;

@Mapper
public interface DidExamsMapper {

	void insertDidExams(DidExams ex);

}
