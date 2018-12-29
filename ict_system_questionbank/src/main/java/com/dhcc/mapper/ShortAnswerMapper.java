package com.dhcc.mapper;

import com.dhcc.pojo.ShortAnswer;
import com.dhcc.pojo.ShortAnswerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ShortAnswerMapper {
    long countByExample(ShortAnswerExample example);

    int deleteByExample(ShortAnswerExample example);

    int insert(ShortAnswer record);

    int insertSelective(ShortAnswer record);

    List<ShortAnswer> selectByExample(ShortAnswerExample example);

    int updateByExampleSelective(@Param("record") ShortAnswer record, @Param("example") ShortAnswerExample example);

    int updateByExample(@Param("record") ShortAnswer record, @Param("example") ShortAnswerExample example);
    public ShortAnswer finalShort(Integer id);
}