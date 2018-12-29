package com.dhcc.mapper;

import com.dhcc.pojo.Judge;
import com.dhcc.pojo.JudgeExample;
import com.dhcc.pojo.MultipleChoice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface JudgeMapper {
    long countByExample(JudgeExample example);

    int deleteByExample(JudgeExample example);

    int insert(Judge record);

    int insertSelective(Judge record);

    List<Judge> selectByExample(JudgeExample example);

    int updateByExampleSelective(@Param("record") Judge record, @Param("example") JudgeExample example);

    int updateByExample(@Param("record") Judge record, @Param("example") JudgeExample example);
    public Judge finalJudge(Integer id);
}