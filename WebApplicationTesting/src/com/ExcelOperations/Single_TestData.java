package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Single_TestData {

	public static void main(String[] args) throws IOException {

FileInputStream file = new FileInputStream("C:\\Users\\kkish\\Desktop\\KishanSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\KishanTestData.xlsx");
XSSFWorkbook workBook = new XSSFWorkbook(file);
XSSFSheet sheet = workBook.getSheet("Sheet1");

Row r = sheet.getRow(0);
Cell c = r.getCell(0);
		
		
		
		
	}

}
