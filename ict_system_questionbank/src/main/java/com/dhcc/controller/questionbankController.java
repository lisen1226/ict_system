package com.dhcc.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.dhcc.pojo.Examination;
import com.dhcc.pojo.ExaminationType;
import com.dhcc.pojo.Judge;
import com.dhcc.pojo.MultipleChoice;
import com.dhcc.pojo.PageBean;
import com.dhcc.pojo.ShortAnswer;
import com.dhcc.service.ExaService;
import com.dhcc.service.JudgeService;
import com.dhcc.service.MultipleChoiceService;
import com.dhcc.service.ShortAnswerService;
import com.dhcc.util.Excel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller

public class questionbankController {
	@Autowired
	private ExaService service;
	@Autowired
	JudgeService juService;
	@Autowired
	MultipleChoiceService mulService;
	
	@Autowired
	ShortAnswerService shService;
	
	
	@Autowired
	MultipleChoice multipleChoice;
	@Autowired
	Examination examin;
	@Autowired
	Judge judge;
	@Autowired
	ShortAnswer shortAnswer;
	

	@RequestMapping(value="/index")
	public String index() {
		//addListExamin();
		return "TestQuestions/listExamination";
	}
	/*@RequestMapping(value="/singleChoice")
	public String singleChoice() {
		return "TestQuestions/singleChoice";
	}
	@RequestMapping(value="/judge")
	public String judge() {
<<<<<<< HEAD
		return "TestQuestions/judge";
	}*/
	@RequestMapping(value="/topicType")
	public String topicType() {
		return "TestQuestions/topicType";
	}
	

	

	//分页查询数据
	@ResponseBody
	@RequestMapping("/listAll")
	
	public Map<String,Object> listAll(int currPage,String examinationGenre) {
		Map<String,Object> map=new HashMap<String,Object>();
	
		if("单选".equals(examinationGenre)) {
			PageBean<Examination > bean=new PageBean<>();
			//分页处理，显示第一页的pageSize条数据
	        PageHelper.startPage(currPage, bean.getPageSize());
			List<Examination> list = service.finalAllExamination();
			list=change(list);
			// 取分页信息
			PageInfo<Examination> pageInfo = new PageInfo<Examination>(list);
			//获取总记录数
			Long total = pageInfo.getTotal(); 
			bean.setTotalNum(total);
			if(total%bean.getPageSize()==0) {
				total=total/bean.getPageSize();
			}else {
				total=total/bean.getPageSize()+1;
			}
			bean.setTotalPage(total);;
			bean.setItems(list);
			map.put("PageBean", bean);
		}else if("判断".equals(examinationGenre)) {
			PageBean<Judge > bean=new PageBean<>();
			//分页处理，显示第一页的pageSize条数据
	        PageHelper.startPage(currPage, bean.getPageSize());
			List<Judge> list = juService.selectByExample(null);
		
			list=changeJudge(list);
			// 取分页信息
			PageInfo<Judge> pageInfo = new PageInfo<Judge>(list);
			//获取总记录数
			Long total = pageInfo.getTotal(); 
			bean.setTotalNum(total);
			if(total%bean.getPageSize()==0) {
				total=total/bean.getPageSize();
			}else {
				total=total/bean.getPageSize()+1;
			}
			bean.setTotalPage(total);;
			bean.setItems(list);
			map.put("PageBean", bean);
		}else if("多选".equals(examinationGenre)) {
			PageBean<MultipleChoice > bean=new PageBean<>();
			//分页处理，显示第一页的pageSize条数据
	        PageHelper.startPage(currPage, bean.getPageSize());
			List<MultipleChoice> list = mulService.selectByExample(null);
		
			list=changeMultipleChoice(list);
			// 取分页信息
			PageInfo<MultipleChoice> pageInfo = new PageInfo<MultipleChoice>(list);
			//获取总记录数
			Long total = pageInfo.getTotal(); 
			bean.setTotalNum(total);
			if(total%bean.getPageSize()==0) {
				total=total/bean.getPageSize();
			}else {
				total=total/bean.getPageSize()+1;
			}
			bean.setTotalPage(total);;
			bean.setItems(list);
			map.put("PageBean", bean);
		}else if("简答".equals(examinationGenre)) {
			PageBean<ShortAnswer > bean=new PageBean<>();
			//分页处理，显示第一页的pageSize条数据
	        PageHelper.startPage(currPage, bean.getPageSize());
			List<ShortAnswer> list = shService.selectByExample(null);
		
			list=changeShortAnswer(list);
			// 取分页信息
			PageInfo<ShortAnswer> pageInfo = new PageInfo<ShortAnswer>(list);
			//获取总记录数
			Long total = pageInfo.getTotal(); 
			bean.setTotalNum(total);
			if(total%bean.getPageSize()==0) {
				total=total/bean.getPageSize();
			}else {
				total=total/bean.getPageSize()+1;
			}
			bean.setTotalPage(total);;
			bean.setItems(list);
			map.put("PageBean", bean);
			
			
			
		}
		
		
		return map;
	}
	
	
	//按类型查询试题
	@ResponseBody
	@RequestMapping("/finalByType")
	public Map<String,Object> finalByType(int currPage,String type,String examinationGenre) {
		Map<String,Object> map =new HashMap<>();

		if("单选".equals(examinationGenre)) {
			PageBean<Examination > bean=new PageBean<>();
			//分页处理，显示第一页的pageSize条数据
	        PageHelper.startPage(currPage, bean.getPageSize());
	        examin.setExaminationType(type);
	        List<Examination> list =service.finalByType(examin);
			list=change(list);
			// 取分页信息
			PageInfo<Examination> pageInfo = new PageInfo<Examination>(list);
			//获取总记录数
			Long total = pageInfo.getTotal(); 
			bean.setTotalNum(total);
			if(total%bean.getPageSize()==0) {
				total=total/bean.getPageSize();
			}else {
				total=total/bean.getPageSize()+1;
			}
			bean.setTotalPage(total);;
			bean.setItems(list);
			map.put("PageBean", bean);
		}else if("判断".equals(examinationGenre)) {

		}else if("多选".equals(examinationGenre)) {
			
		}else if("简答".equals(examinationGenre)) {
		}
		
		
		return map;
	}
	
	
	//根据id删除数据
	@ResponseBody
	@RequestMapping("/delectExaminById")
	public int delectExaminById(Integer id,String examinationGenre) {
		
		try {
			if("单选".equals(examinationGenre)) {
				service.delectExaminById(id);
			}else if("判断".equals(examinationGenre)) {
					
			}else if("多选".equals(examinationGenre)) {
					
			}else if("简答".equals(examinationGenre)) {
				
			}

			 return 1;
		} catch (Exception e) {
			 return 0;
		}
		
		
	}
	
	
	//批量删除数据
	@ResponseBody
	@RequestMapping("/deleteAll")
	public int deleteAll(Integer[] listId,String examinationGenre) {
		try {
			if("单选".equals(examinationGenre)) {
				for(int i=0;i<listId.length;i++) {
					service.delectExaminById((int)listId[i]);
				}
			}else if("判断".equals(examinationGenre)) {
					
			}else if("多选".equals(examinationGenre)) {
					
			}else if("简答".equals(examinationGenre)) {
				
			}
			 return 1;
		} catch (Exception e) {
			 return 0;
		}
		
	}
	
	//添加试题
	@ResponseBody
	@RequestMapping("/addExamin")
	public int addExamin(Examination record) {
		try {
			Date now=new Date();
			SimpleDateFormat f=new SimpleDateFormat("10"+record.getExaminationType()+"yyyyMMddHHmmss"+0);
			record.setExaminationNumber(f.format(now));
			service.addExamin(record);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	
	//查询所有题目类型
	@ResponseBody
	@RequestMapping("/selectAllTestType")
	public List<ExaminationType> selectAllTestType() {
		return service.selectAllTestType();
	}
	
	//Excel导入
	@ResponseBody
	@RequestMapping(value="/importExaminExcel",method=RequestMethod.POST)

	public String importExaminExcel(@RequestParam("file") MultipartFile file,String examinationGenre){
		String hint="第";

		List<Integer> errors=new ArrayList<Integer>();

        if(!file.isEmpty()){  
        	try {

        		Excel<Examination> excel=new Excel();
        		List lists=excel.importExcel(file);
        		int type=0;
        		
        		if("单选".equals(examinationGenre)) {
        			for(int i=0;i<lists.size();i++) {
            			
            			List list= (List) lists.get(i);
            			if(list.size()==8) {
            				type=service.selectTestType((String)list.get(0));
            				if(type==0) {
            					hint+=i+1+",";
            					
            				}
            				if(i==lists.size()-1&&!hint.equals("第")) {
            					hint=hint.substring(0,hint.length()-1);
            					hint+="条试题类型错误,请修改后重新导入";
            				}
            			} else {
            				hint="文件格式不符合上传要求,请使用模板上传数据";
            			}
            		}
            		
            		if("第".equals(hint)) {
            			for(int i=0;i<lists.size();i++) {
            				try {
            					List list= (List) lists.get(i);
            					Date now=new Date();
            					SimpleDateFormat f=new SimpleDateFormat("10"+(String)list.get(0)+"0"+"yyyyMMddHHmmss"+i);
            					
        						examin.setExaminationNumber(f.format(now));
        						examin.setExaminationType((String)list.get(0));
        						examin.setExaminationTitle((String)list.get(1));
        						examin.setExaminationAnswer1((String)list.get(2));
        						examin.setExaminationAnswer2((String)list.get(3));
        						examin.setExaminationAnswer3((String)list.get(4));
        						System.out.println("....................:"+	examin.getExaminationAnswer4());
        						examin.setExaminationAnswer4((String)list.get(5));
        						examin.setExaminationCorrect((String)list.get(6));
        						examin.setExaminationComplexity((String)list.get(7));
            					
            					service.importExaminExcel(examin);
            				} catch (Exception e) {
            					System.out.println(e.getMessage());
            				}
            			}
            			hint="上传成功";
            		}
        		}else if("判断".equals(examinationGenre)) {
        				
        		}else if("多选".equals(examinationGenre)) {
        				
        		}else if("简答".equals(examinationGenre)) {
        			
        		}
        		

        		errors=service.importExaminExcel(file);

    		} catch (Exception e) {
    			System.out.println(e.getMessage());
    			return hint;
    		}
         }	

		return hint;
	}
	//导入前查询
	@ResponseBody
	@RequestMapping(value="/importNotarize",method=RequestMethod.POST)
	public List importNotarize( MultipartFile file ){
		
		Excel<Examination> excel=new Excel();
		List lists=new ArrayList();
		try {
			lists = excel.importExcel(file);
			return lists;
		} catch (IOException e) {
			e.printStackTrace();
			return lists;
		}
		

	}

	//修改前查询数据
	@ResponseBody
	@RequestMapping("/updateFindExamin")
	public Map<String,Object> updateFindExamin(Integer id,String examinationGenre) {
		System.out.println("--------------++:"+examinationGenre);
		Map<String,Object> map=new HashMap<>();
		if("单选".equals(examinationGenre)) {
			
			examin=service.updateFindExamin(id);
			System.out.println(examin);
			map.put("obj", examin);
			
		}else if("多选".equals(examinationGenre)) {
			multipleChoice=mulService.finalMultiple(id);
			map.put("obj", multipleChoice);
			
		}else if("判断".equals(examinationGenre)) {
			judge=juService.finalJudge(id);
			map.put("obj", judge);
		}else if("简答".equals(examinationGenre)) {
			shortAnswer=shService.finalShort(id);
			map.put("obj", shortAnswer);
		}
		return map;
	}
	
	//修改数据
	@ResponseBody
	@RequestMapping("/updateExamin")
	public int updateExamin(Examination record) {
		try {
			System.out.println("======================="+record.getExaminationComplexity());
			
    		service.updateExamin(record);
    		return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	//添加题目类型
	@ResponseBody
	@RequestMapping("/addType")
	public int addType(String typeName) {
		try {

    		service.addType(typeName);
    		return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	//删除题目类型
	@ResponseBody
	@RequestMapping("/deleteType")
	public int deleteType(String typeNumber) {
		try {

    		service.deleteType(typeNumber);
    		return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	//修改题目类型
	@ResponseBody
	@RequestMapping("/updateType")
	public int updateType(ExaminationType examinationType) {
		try {
    		service.updateType(examinationType);
    		return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	//根据编号查询试题类型
	@ResponseBody
	@RequestMapping("/finalTypeByNum")
	public ExaminationType finalTypeByNum(String typeNumber) {
		return service.finalTypeByNum(typeNumber);
	}
	
	
	
	
	public List<Examination> change(List<Examination> list){
		 List<ExaminationType> types= selectAllTestType();
	        for(int i=0;i<list.size();i++) {
	        	for(int j=0;j<types.size();j++) {
	        		if(types.get(j).getTypeNumber().equals(list.get(i).getExaminationType())) {
	        			
	        			examin=list.get(i);
	        			examin.setExaminationType(types.get(j).getTypeName());
	        			list.set(i, examin);
	        		};
	        	}	
	        }
	        return list;
	}
	
	public List<Judge> changeJudge(List<Judge> list){
		 List<ExaminationType> types= selectAllTestType();
	        for(int i=0;i<list.size();i++) {
	        	for(int j=0;j<types.size();j++) {
	        		if(types.get(j).getTypeNumber().equals(list.get(i).getJudgeType())) {
	        			
	        			judge=list.get(i);
	        			judge.setJudgeType(types.get(j).getTypeName());
	        			list.set(i, judge);
	        		};
	        	}	
	        }
	        return list;
	}
	
	public List<MultipleChoice> changeMultipleChoice(List<MultipleChoice> list){
		 List<ExaminationType> types= selectAllTestType();
	        for(int i=0;i<list.size();i++) {
	        	for(int j=0;j<types.size();j++) {
	        		if(types.get(j).getTypeNumber().equals(list.get(i).getMultipleChoiceType())) {
	        			
	        			multipleChoice=list.get(i);
	        			multipleChoice.setMultipleChoiceType(types.get(j).getTypeName());
	        			list.set(i, multipleChoice);
	        		};
	        	}	
	        }
	        return list;
	}
	
	public List<ShortAnswer> changeShortAnswer(List<ShortAnswer> list){
		 List<ExaminationType> types= selectAllTestType();
	        for(int i=0;i<list.size();i++) {
	        	for(int j=0;j<types.size();j++) {
	        		if(types.get(j).getTypeNumber().equals(list.get(i).getShortAnswerType())) {
	        			
	        			shortAnswer=list.get(i);
	        			shortAnswer.setShortAnswerType(types.get(j).getTypeName());
	        			list.set(i, shortAnswer);
	        		};
	        	}	
	        }
	        return list;
	}

}
