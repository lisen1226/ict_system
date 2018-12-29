package com.dhcc.service;

import java.util.List;

import com.dhcc.pojo.MultipleChoice;
import com.dhcc.pojo.MultipleChoiceExample;

public interface MultipleChoiceService {
	 public List<MultipleChoice> selectByExample(MultipleChoiceExample example);
	 public MultipleChoice finalMultiple(Integer id);
}
