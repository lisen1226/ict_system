package com.dhcc.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhcc.mapper.DidExamsMapper;
import com.dhcc.mapper.ExaminationMapper;
import com.dhcc.mapper.HistoryExamsMapper;
import com.dhcc.pojo.DidExams;
import com.dhcc.pojo.Examination;
import com.dhcc.pojo.ExaminationType;
import com.dhcc.pojo.Exams;
import com.dhcc.pojo.HistoryExams;
import com.dhcc.pojo.Matter;
import com.dhcc.pojo.Subject;
import com.dhcc.pojo.TestType;
import com.dhcc.service.ExaminationService;
import com.dhcc.utils.Tools;

@Service
public class ExaminationServiceImpl implements ExaminationService {
	@Autowired
	private ExaminationMapper examMapper;
	@Autowired
	private DidExamsMapper didExamsMapper;
	@Autowired
	private HistoryExamsMapper hesMapper;

	

	@Override
	public List<Examination> selectAllExams() {
		List<Examination> exams = examMapper.selectAllExams();
		return exams;
	}

	// 根据类型出题
	@Override
	public List<Subject> selectByTypeAndNumber(List<Matter> matters) {
		List<Subject> subs = new ArrayList<Subject>();
		for (int j = 0; j < matters.size(); j++) {
			String testType = matters.get(j).getTestType();
			int testNumber = matters.get(j).getNumber();
			String type = matters.get(j).getType();
			// 根据类型从数据库随机查出查出题目
			List<Examination> exams = examMapper.selectByTypeAndNumber(testType, testNumber, type);

			// 封装题目 打乱选项
			for (int i = 0; i < exams.size(); i++) {
				Subject sub = new Subject();
				sub.setSubjectNumber(exams.get(i).getExaminationNumber());
				sub.setSubjectTitle(exams.get(i).getExaminationTitle());
				sub.setSubjectType(exams.get(i).getTestType().getType_name());
				List<String> options = new ArrayList<String>();
				if (exams.get(i).getExaminationRight() != null) {
					options.add(exams.get(i).getExaminationRight());
				}
				if (exams.get(i).getExaminationWrong1() != null) {
					options.add(exams.get(i).getExaminationWrong1());
				}
				if (exams.get(i).getExaminationWrong2() != null) {
					options.add(exams.get(i).getExaminationWrong2());
				}
				if (exams.get(i).getExaminationWrong3() != null) {
					options.add(exams.get(i).getExaminationWrong3());
				}

				Collections.shuffle(options); // 随机打乱顺序
				sub.setSubjectOptions(options);
				subs.add(sub);
			}

		}
		return subs;

	}

	// 根据类型出题
	@Override
	public List<Subject> selectByTypeAndNumber(String examType, List<Matter> matters) {
		List<Subject> subs = new ArrayList<Subject>();
		for (int j = 0; j < matters.size(); j++) {
			int testNumber = matters.get(j).getNumber();
			String type = matters.get(j).getType();
			List<Examination> exams = examMapper.selectByTypeAndNumber(examType, testNumber, type);

			for (int i = 0; i < exams.size(); i++) {
				Subject sub = new Subject();
				sub.setSubjectNumber(exams.get(i).getExaminationNumber());
				sub.setSubjectTitle(exams.get(i).getExaminationTitle());
				sub.setSubjectType(exams.get(i).getTestType().getType_name());
				List<String> options = new ArrayList<String>();
				if (exams.get(i).getExaminationRight() != null) {
					options.add(exams.get(i).getExaminationRight());
				}
				if (exams.get(i).getExaminationWrong1() != null) {
					options.add(exams.get(i).getExaminationWrong1());
				}
				if (exams.get(i).getExaminationWrong2() != null) {
					options.add(exams.get(i).getExaminationWrong2());
				}
				if (exams.get(i).getExaminationWrong3() != null) {
					options.add(exams.get(i).getExaminationWrong3());
				}

				Collections.shuffle(options); // 随机打乱顺序
				sub.setSubjectOptions(options);
				subs.add(sub);
			}

		}
		return subs;

	}

// 处理试卷 
	@Override
	public String dealExam(String username, String map, String examid) {
		map = map.replace("{", "");
		map = map.replace("}", "");
		map = map.replace("\"", "");
		String[] exams = map.split(",");
		Date date = new Date();
		String uuid = Tools.getUUID32();

		List<DidExams> didExams = new ArrayList<DidExams>();
		HistoryExams hes = new HistoryExams();
		int flag = 0;

		// 将每道题存下来
		for (int i = 0; i < exams.length; i++) {
			String[] ans = exams[i].split(":");
			DidExams ex = new DidExams();
			ex.setUsername(username);
			ex.setTestid(ans[0]);
			if (ans.length == 1) {
				ex.setChoose(null);
				ex.setFlag("错误");
			} else {
				ex.setChoose(ans[1]);
				ex.setFlag(examMapper.selectRightByTestId(ans[0]).equals(ans[1]) ? "正确" : "错误");
			}
			ex.setUuid(uuid);
			ex.setTestTime(date);
			didExams.add(ex);
			didExamsMapper.insertDidExams(ex);
			if (ans.length != 1) {
				if (examMapper.selectRightByTestId(ans[0]).equals(ans[1])) {
					flag++;
				}
			}

		}

		// 按比例算出成绩 将整套试卷存下来
		long accuracy = Math.round(Double.valueOf(flag) / Double.valueOf(exams.length) * 100);
		hes.setUsername(username);
		hes.setTestTime(date);
		hes.setUuid(uuid);
		hes.setExams(didExams);
		hes.setAccuracy(String.valueOf(accuracy));
		hes.setExamType(examid);
		hes.setTestType(exams[0].substring(0, 2));
		hesMapper.insertHistoryExams(hes);
		return String.valueOf(accuracy);
	}

	@Override
	public List<ExaminationType> selectAllTestType() {
		List<ExaminationType> examTypes = examMapper.selectAllTestType();
		return examTypes;
	}

	@Override
	public List<TestType> selectAllType() {
		List<TestType> types = examMapper.selectAllType();
		return types;
	}

	@Override
	public List<Exams> selectAllExamsByPer(String per) {
		List<Exams> exams = examMapper.selectAllExamsByPer(per);
		return exams;
	}

	@Override
	public List<Matter> selectMatters(String examid) {
		List<Matter> matters = examMapper.selectMatters(examid);
		return matters;
	}

}
