package com.dhcc.mapper;

import com.dhcc.pojo.MultipleChoice;
import com.dhcc.pojo.MultipleChoiceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MultipleChoiceMapper {
    long countByExample(MultipleChoiceExample example);

    int deleteByExample(MultipleChoiceExample example);

    int insert(MultipleChoice record);

    int insertSelective(MultipleChoice record);

    List<MultipleChoice> selectByExample(MultipleChoiceExample example);

    int updateByExampleSelective(@Param("record") MultipleChoice record, @Param("example") MultipleChoiceExample example);

    int updateByExample(@Param("record") MultipleChoice record, @Param("example") MultipleChoiceExample example);
    public MultipleChoice finalMultiple(Integer id);
}