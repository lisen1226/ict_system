package com.dhcc.service;

import java.util.List;

import com.dhcc.pojo.Judge;
import com.dhcc.pojo.JudgeExample;

public interface JudgeService {
    public List<Judge> selectByExample(JudgeExample example);
    public Judge finalJudge(Integer id);
}
