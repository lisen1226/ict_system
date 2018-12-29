package com.dhcc.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dhcc.mapper.ExaminationMapper;
import com.dhcc.pojo.Examination;
import com.dhcc.pojo.ExaminationType;
import com.dhcc.pojo.PageBean;
import com.dhcc.util.Excel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class ExaServiceimpl implements ExaService {
	@Autowired
	ExaminationMapper examinMap;
	@Autowired
	Examination examin;
	
	//分页查询信息
	
	/*public Map<String,Object> finalAll(int currPage,int pageSize,String examinationGenre) {
		
		Map<String,Object> map=new HashMap<String,Object>();
		//分页处理，显示第一页的pageSize条数据
        PageHelper.startPage(currPage, pageSize);
        //查询
        List<Examination> list = examinMap.finalAll(examinationGenre);
        // 取分页信息
        PageInfo<Examination> pageInfo = new PageInfo<Examination>(list);
        //获取总记录数
        Long total = pageInfo.getTotal(); 
        Long num=total;
        if(total%pageSize==0) {
        	total=total/pageSize;
        }else {
        	total=total/pageSize+1;
        }
       
        PageBean<Examination > bean=new PageBean<Examination>(num,total, list);
        map.put("PageBean", bean);
      
        
		return map;
	}
	
	*/
	@Override
	public  List<Examination> finalAllExamination() {
		return   examinMap.finalAllExamination();
	}
	

	//根据类型查询数据
	@Override
	public List<Examination> finalByType(Examination examin) {
        List<Examination> list = examinMap.finalByType(examin);//查询

		return list;

        // 取分页信息
        PageInfo<Examination> pageInfo = new PageInfo<Examination>(list);
        Long total = pageInfo.getTotal(); //获取总记录数
        Long num=total;
        if(total%pageSize==0) {
        	total=total/pageSize;
        }else {
        	total=total/pageSize+1;
        }
       
        PageBean<Examination > bean=new PageBean<Examination>(num,total, list);
        map.put("PageBean", bean);
      
        
		return map;
>>>>>>> branch 'master' of https://github.com/lisen1226/ict_system.git
	}

	//根据id删除数据
	@Override
	public void delectExaminById(Integer id) {
		examinMap.delectExaminById(id);
		
	}
	//添加数据
	@Override
	public void addExamin(Examination record) {
		examinMap.addExamin(record);
	}
	//查询题目类型
	@Override
	public List<ExaminationType> selectAllTestType() {
		
		return examinMap.selectAllTestType();
	}

	
	@SuppressWarnings( "resource" )
<<<<<<< HEAD
	public void importExaminExcel(Examination record) {
		examinMap.addExamin(record);
=======
	public List<Integer> importExaminExcel(MultipartFile myFile) throws Exception {
		Excel<Examination> excel=new Excel();
		List lists=excel.importExcel(myFile);
		int type=0;
		List<Integer> errors=new ArrayList<Integer>();
		
		for(int i=0;i<lists.size();i++) {
			
			List list= (List) lists.get(i);
			if(list.size()==7) {
				System.out.println("type:"+list.get(1));
				type=examinMap.selectTestType((String)list.get(1));
				if(type==0) {
					errors.add(i+1);
				}
			}else {
				errors.add(0);
				return errors;
			}
			
		}
		if(errors.size()==0) {
			for(int i=0;i<lists.size();i++) {
				try {
					List list= (List) lists.get(i);
					Date now=new Date();
					SimpleDateFormat f=new SimpleDateFormat((String)list.get(0)+(String)list.get(1)+"yyyyMMddHHmmss"+i);
					examin.setExaminationNumber(f.format(now));
					examin.setExaminationGenre((String)list.get(0));
					examin.setExaminationType((String)list.get(1));
					examin.setExaminationTitle((String)list.get(2));
					examin.setExaminationRight((String)list.get(3));
					examin.setExaminationWrong1((String)list.get(4));
					examin.setExaminationWrong2((String)list.get(5));
					examin.setExaminationWrong3((String)list.get(6));
					examinMap.addExamin(examin);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		return errors;
>>>>>>> branch 'master' of https://github.com/lisen1226/ict_system.git
	}

	@Override
	public Examination updateFindExamin(Integer id) {
		
		return examinMap.updateFindExamin(id);
	}

	@Override
	public int updateExamin(Examination record) {
		examinMap.updateExamin(record);
		return 0;
	}
<<<<<<< HEAD
	//添加试题类型
	@Override
	public void addType(String typeName) {
		Date now=new Date();
		SimpleDateFormat f=new SimpleDateFormat("yyyyMMddHHmmss"+0);
		examinationType.setTypeName(typeName);
		examinationType.setTypeNumber(f.format(now));
		examinMap.addType(examinationType);
	}
	//删除试题类型
	@Override
	public void deleteType(String typeNumber) {
		examinMap.deleteType(typeNumber);
		
	}
	//修改试题类型
	@Override
	public void updateType(ExaminationType examinationType) {
		examinMap.updateType(examinationType);
		
	}
	//根据试题类型编号查询试题类型
	@Override
	public ExaminationType finalTypeByNum(String typeNumber) {
		return examinMap.finalTypeByNum(typeNumber);
	}
	@Override
	public Integer selectTestType(String type) {
		return examinMap.selectTestType(type);
	}
=======

>>>>>>> branch 'master' of https://github.com/lisen1226/ict_system.git
}
