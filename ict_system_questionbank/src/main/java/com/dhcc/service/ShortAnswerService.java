package com.dhcc.service;

import java.util.List;

import com.dhcc.pojo.ShortAnswer;
import com.dhcc.pojo.ShortAnswerExample;

public interface ShortAnswerService {
   public List<ShortAnswer> selectByExample(ShortAnswerExample example);
   public ShortAnswer finalShort(Integer id);
}
