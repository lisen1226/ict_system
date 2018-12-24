package com.dhcc.controller;

import java.util.ArrayList;
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
import com.dhcc.service.ExaService;

@Controller

public class questionbankController {
	@Autowired
	private ExaService service;
	
	
	@RequestMapping(value="/index")
	public String index() {
		//addListExamin();
		return "zds/listExamination";
	}
	@RequestMapping(value="/singleChoice")
	public String singleChoice() {
		return "zds/singleChoice";
	}
	@RequestMapping(value="/judge")
	public String judge() {
		return "zds/judge";
	}
	@RequestMapping(value="/topicType")
	public String topicType() {
		return "zds/topicType";
	}
	
	
	
	//分页查询数据
	@ResponseBody
	@RequestMapping("/listAll")
	public Map<String,Object> listAll(int currPage,String examinationGenre) {
		Map<String,Object> map =service.finalAll(currPage, 20, examinationGenre);
		return map;
	}
	//按类型查询试题
	@ResponseBody
	@RequestMapping("/finalByType")
	public Map<String,Object> finalByType(int currPage,String type,String examinationGenre) {
		Map<String,Object> map =service.finalByType(currPage, 20,type,examinationGenre);
		
		return map;
	}
	
	//根据id删除数据
	@ResponseBody
	@RequestMapping("/delectExaminById")
	public int delectExaminById(Integer id) {
		
		try {
			service.delectExaminById(id);
			 return 1;
		} catch (Exception e) {
			 return 0;
		}
		
		
	}
	
	//批量删除数据
	@ResponseBody
	@RequestMapping("/deleteAll")
	public int deleteAll(Integer[] listId) {
		try {
			for(int i=0;i<listId.length;i++) {
				service.delectExaminById((int)listId[i]);
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
			System.out.println(record.getExaminationGenre());
			service.addExamin(record);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	
	/*public int addListExamin() {
		try {
			for(int i=0;i<100;i++) {
				Examination record=new Examination("0"+i,"单选"+i,"java"+i,"题"+i,"正确答案1","错误答案1","错误答案2","错误答案3");
				service.addExamin(record);
			}
			
			 return 1;
		} catch (Exception e) {
			 return 0;
		}
	}*/
	//查询所有题目类型
	@ResponseBody
	@RequestMapping("/selectAllTestType")
	public List<ExaminationType> selectAllTestType() {
		return service.selectAllTestType();
	}
	
	//Excel导入
	@ResponseBody
	@RequestMapping(value="/importExaminExcel",method=RequestMethod.POST)
	public String importExaminExcel(MultipartFile file){
		String errors="";
        if(!file.isEmpty()){  
        	try {
        		errors=service.importExaminExcel(file,7);
    		} catch (Exception e) {
    			System.out.println(e.getMessage());
    			return errors;
    		}
         }	
        System.out.println(errors);
		return errors;
	}
	
	//Excel导入
		@ResponseBody
		@RequestMapping(value="/importExaminExcelJudge",method=RequestMethod.POST)
		public String importExaminExcelJudge(MultipartFile file){
			String errors="";
	        if(!file.isEmpty()){  
	        	try {
	        		errors=service.importExaminExcel(file,5);
	    		} catch (Exception e) {
	    			System.out.println(e.getMessage());
	    			return errors;
	    		}
	         }	
	        System.out.println(errors);
			return errors;
		}
	//修改前查询数据
	@ResponseBody
	@RequestMapping("/updateFindExamin")
	public Examination updateFindExamin(Integer id) {
		
		return service.updateFindExamin(id);
	}
	//修改数据
	@ResponseBody
	@RequestMapping("/updateExamin")
	public int updateExamin(Examination record) {
		try {
			
			
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
}
