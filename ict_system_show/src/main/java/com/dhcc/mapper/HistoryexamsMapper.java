package com.dhcc.mapper;

import com.dhcc.pojo.Historyexams;
import com.dhcc.pojo.HistoryexamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryexamsMapper {
    int countByExample(HistoryexamsExample example);

    int deleteByExample(HistoryexamsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Historyexams record);

    int insertSelective(Historyexams record);

    List<Historyexams> selectByExample(HistoryexamsExample example);
    
    List selectByTime(String date);
    
    List selectAvgByTime(String date);
    
<<<<<<< HEAD
    List selectAccuracyByTime(@Param("date") String date,@Param("max") String max,@Param("min") String min);
=======
    List selectAccuracyByTime(String date,String max,String min);
>>>>>>> branch 'master' of https://github.com/lisen1226/ict_system.git

    Historyexams selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Historyexams record, @Param("example") HistoryexamsExample example);

    int updateByExample(@Param("record") Historyexams record, @Param("example") HistoryexamsExample example);

    int updateByPrimaryKeySelective(Historyexams record);

    int updateByPrimaryKey(Historyexams record);
}