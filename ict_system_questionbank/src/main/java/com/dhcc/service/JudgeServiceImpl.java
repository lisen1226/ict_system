package com.dhcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.mapper.JudgeMapper;
import com.dhcc.pojo.Judge;
import com.dhcc.pojo.JudgeExample;
@Service
public class JudgeServiceImpl implements JudgeService {
	@Autowired
	JudgeMapper JudgeMapper;
	
	
	@Override
	public List<Judge> selectByExample(JudgeExample example) {
	
		return JudgeMapper.selectByExample(example);
	}


	@Override
	public Judge finalJudge(Integer id) {
		
		return JudgeMapper.finalJudge(id);
	}

}
