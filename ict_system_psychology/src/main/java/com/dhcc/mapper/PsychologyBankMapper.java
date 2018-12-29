package com.dhcc.mapper;

import com.dhcc.pojo.PsychologyBank;
import com.dhcc.pojo.PsychologyBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsychologyBankMapper {
    int countByExample(PsychologyBankExample example);

    int deleteByExample(PsychologyBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PsychologyBank record);

    int insertSelective(PsychologyBank record);

    List<PsychologyBank> selectByExample(PsychologyBankExample example);

    PsychologyBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PsychologyBank record, @Param("example") PsychologyBankExample example);

    int updateByExample(@Param("record") PsychologyBank record, @Param("example") PsychologyBankExample example);

    int updateByPrimaryKeySelective(PsychologyBank record);

    int updateByPrimaryKey(PsychologyBank record);
}