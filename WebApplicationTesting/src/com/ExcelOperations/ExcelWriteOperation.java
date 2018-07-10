package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperation {

	public static void main(String[] args) throws FileNotFoundException {
		
	FileInputStream file = new FileInputStream("C:\\Users\\kkish\\Desktop\\KishanSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\KishanTestData.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	 	Row r=sheet.createRow(2);
	 	
	    Cell c=r.createCell(3);
	    
	    c.setCellValue("HIII");
	    
  FileOutputStream file1 = new FileOutputStream("C:\\\\Users\\\\kkish\\\\Desktop\\\\KishanSelenium\\\\WebApplicationTesting\\\\src\\\\com\\\\ExcelTestDataFiles\\\\KishanTestData.xlsx");
  
	workbook.write(file1);	
		
 }

}
