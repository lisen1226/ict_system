package com.dhcc.util;

import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.el.ELException;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

public class Excel<T> {
	private final static String XLS="xls";
	private final static String XLSX="xlsx";
	/**
	 * 
	 * 导入Excel表格
	 * @throws IOException 
	 * 
	 * 	*/
	public  List importExcel(MultipartFile myFile) throws IOException{
		 
		Workbook workbook=null;
		
		String fileName =myFile.getOriginalFilename();
		
		if(fileName.endsWith(XLS)) {
			workbook=new HSSFWorkbook(myFile.getInputStream());
		}else if(fileName.endsWith(XLSX)) {
			workbook=new XSSFWorkbook(myFile.getInputStream());
		}
		Sheet sheet=workbook.getSheet("Sheet1");
		
		int rows =sheet.getLastRowNum();
		
		if(rows==0) {
			throw new ELException("请写入数据");
		}
		List lists=new ArrayList();
		Row firstRow=sheet.getRow(0);//获取表头
		int columnNum=firstRow.getPhysicalNumberOfCells();//获取表列数
		for(int i=1;i<=rows+1;i++) {
			Row row=sheet.getRow(i);
			List list=new ArrayList();
			if(row!=null) {
				for(int j=0;j<columnNum;j++) {
					
					System.out.println("colmn:"+row.getCell(j)==null);
					list.add(getCellValue(row.getCell(j)));
				}
				lists.add(list);
			}
		}
		return lists;
	}
	/**
	 * 获得Cell内容
	 * 
	 * 	*/
	public  String getCellValue(Cell cell) {
		String value ="";
		if(cell!=null) {
			//判断数据类型
			switch(cell.getCellType()) {
				case HSSFCell.CELL_TYPE_NUMERIC://数字
					value =cell.getNumericCellValue()+"";
					if(HSSFDateUtil.isCellDateFormatted(cell)) {
						Date date =cell.getDateCellValue();
						if(date!=null) {
							value=new SimpleDateFormat("yyyy-MM-dd").format(date);
							
						}else {
							value="";
						}
					}else {
						value =new DecimalFormat("0").format(cell.getNumericCellValue());
					}
					break;
				case HSSFCell.CELL_TYPE_STRING://字符串
					value = cell.getStringCellValue();
					break;
				case HSSFCell.CELL_TYPE_BOOLEAN://booleam
					value = cell.getBooleanCellValue()+"";
					break;
				case HSSFCell.CELL_TYPE_FORMULA://公式
					value = cell.getCellFormula()+"";
					break;
				case HSSFCell.CELL_TYPE_BLANK://空值
					value ="";
					break;
				case HSSFCell.CELL_TYPE_ERROR://故障
					value ="非法字符";
					break;
				default:
					value="未知类型";
					break;	
			}
		}
		
		
		return value.trim();
	}
		
	/**
	 * 
	 * 导出Excel文件
	 * 
	 * 	*/
	public  void exportExcel(HttpServletResponse response,List listHeadName,List<T> objectLists) throws IOException {
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("Sheet1");
		HSSFRow row=sheet.createRow(0);
		HSSFCellStyle style=wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		HSSFCell cell=null;
		for(int i=0;i<listHeadName.size();i++) {
			cell=row.createCell(i);
			cell.setCellValue((String)listHeadName.get(i));
			cell.setCellStyle(style);
		}
		for(int i=0;i<objectLists.size();i++) {
			row =sheet.createRow(i+1);
			T ObjectList= objectLists.get(i);
			String valueList=ObjectList.toString();
			System.out.println("valueList:"+valueList);
			String[] valueLists=valueList.split("\\=");
			for(int j=1;j<valueLists.length;j++) {
				String val=null;
				System.out.println("valueLists:"+valueLists[j]);
				if(j!=valueLists.length-1) {
					val=valueLists[j].split(",")[0];
				}else {
					val=valueLists[j].split("]")[0];
				}
				row.createCell(j-1).setCellValue(val);
			}
		}
		OutputStream outputStream=response.getOutputStream();
		response.reset();
		//文件命名规则
		long filename=System.currentTimeMillis();
		SimpleDateFormat df=new SimpleDateFormat("yyyyMMddHHmmss");
		String fileName=df.format(new Date());
		response.setHeader("Content-disposition", "attachment;filename="+fileName+".xls");
		response.setContentType("application/msexcel");
		wb.write(outputStream);
		outputStream.close();
	}

}
