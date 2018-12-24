package com.dhcc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.dhcc.pojo.Personnel;
import com.dhcc.pojo.PersonnelExample;

@Mapper
public interface PersonnelMapper {
	
    int countByExample(PersonnelExample example);

    int deleteByExample(PersonnelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    List<Personnel> selectByExample(PersonnelExample example);

    Personnel selectByPrimaryKey(Integer id);

    Personnel checkLogin(@Param("unumber") String unumber, @Param("password") String password);
    
    Personnel checkLoginByPhone(@Param("phone") String phone, @Param("password") String password);
    
    int updateByExampleSelective(@Param("record") Personnel record, @Param("example") PersonnelExample example);

    int updateByExample(@Param("record") Personnel record, @Param("example") PersonnelExample example);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);
}