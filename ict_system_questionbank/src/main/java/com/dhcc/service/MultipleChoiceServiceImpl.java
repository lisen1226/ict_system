package com.dhcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.mapper.MultipleChoiceMapper;
import com.dhcc.pojo.MultipleChoice;
import com.dhcc.pojo.MultipleChoiceExample;
@Service
public class MultipleChoiceServiceImpl implements MultipleChoiceService {
	@Autowired
	MultipleChoiceMapper multipleChoiceMapper;
	@Override
	public List<MultipleChoice> selectByExample(MultipleChoiceExample example) {
		
		return multipleChoiceMapper.selectByExample(example);
	}
	@Override
	public MultipleChoice finalMultiple(Integer id) {
		
		return multipleChoiceMapper.finalMultiple(id);
	}

}
