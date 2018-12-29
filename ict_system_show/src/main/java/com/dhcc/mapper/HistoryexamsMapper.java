package com.dhcc.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.dhcc.pojo.Historyexams;
import com.dhcc.pojo.HistoryexamsExample;

public interface HistoryexamsMapper {
    int countByExample(HistoryexamsExample example);

    int deleteByExample(HistoryexamsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Historyexams record);

    int insertSelective(Historyexams record);

    List<Historyexams> selectByExample(HistoryexamsExample example);
    
    List selectByTime(String date);
    
    List selectAvgByTime(String date);
    
    List selectAccuracyByTime( @Param("date") String date,@Param("min") int min,@Param("max") int max);

    Historyexams selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Historyexams record, @Param("example") HistoryexamsExample example);

    int updateByExample(@Param("record") Historyexams record, @Param("example") HistoryexamsExample example);

    int updateByPrimaryKeySelective(Historyexams record);

    int updateByPrimaryKey(Historyexams record);
}