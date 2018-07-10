package com.TestFIle;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

i



public class ExcelTestDataFIle {

	public static void main(String[] args) throws FileNotFoundException
	{
	
		FileInputStream file = new FileInputStream("C:\\Users\\kkish\\Desktop\\TestData.xlsx");
	XSSFWorkbook fil = new XSSFWorkbook(file);
		
	}

}
