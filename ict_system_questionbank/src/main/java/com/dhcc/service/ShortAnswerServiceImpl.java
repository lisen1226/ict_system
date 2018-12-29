package com.dhcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.mapper.ShortAnswerMapper;
import com.dhcc.pojo.ShortAnswer;
import com.dhcc.pojo.ShortAnswerExample;
@Service
public class ShortAnswerServiceImpl implements ShortAnswerService {
	@Autowired
	ShortAnswerMapper shortAnswerMapper;
	
	
	@Override
	public List<ShortAnswer> selectByExample(ShortAnswerExample example) {
		
		return shortAnswerMapper.selectByExample(example);
	}


	@Override
	public ShortAnswer finalShort(Integer id) {
	
		return shortAnswerMapper.finalShort(id);
	}

}
