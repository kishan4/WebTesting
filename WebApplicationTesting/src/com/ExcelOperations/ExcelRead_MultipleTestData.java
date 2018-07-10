package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_MultipleTestData {

	public static void main(String[] args) throws FileNotFoundException {
	
 FileInputStream file = new FileInputStream("C:\\Users\\kkish\\Desktop\\KishanSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\KishanMultiple_TestData.xlsx");
	XSSFWorkbook   workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		 int RowCount = sheet.getLastRowNum();
		for(int i=0;i<RowCount;i++) // to goto every row
		{
			 Row r =sheet.getRow(i);
			 
			 int CellCount = r.getLastCellNum();
			 
			 for(int j=0;j<CellCount;j++) // of every row,moving internal to all the cells
			 {
				 Cell c= r.getCell(j);
				String  data = c.getStringCellValue();
				System.out.print(data+"  ");
			 }
			 System.out.println();
		}
	}

}
