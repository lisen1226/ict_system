package com.dhcc.service.impo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.mapper.HistoryexamsMapper;
import com.dhcc.pojo.Historyexams;
import com.dhcc.pojo.HistoryexamsExample;
import com.dhcc.service.ShowExamService;

@Service
public class ShowExamServiceImpo implements ShowExamService {
	@Autowired
	HistoryexamsMapper historyexamsMapper;

	@Override
	public List<Historyexams> showToOne(String username) {
		List<Historyexams> list = historyexamsMapper.selectByUsername(username);
		return list;
	}

	@Override
	public List<Historyexams> showToInterViewer() {
		HistoryexamsExample example = new HistoryexamsExample();
		Historyexams historyexams = new Historyexams();
		example.setOrderByClause(historyexams.getTesttime());
		List<Historyexams> list = historyexamsMapper.selectByExample(example);
		return list;
	}

}
