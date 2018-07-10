package com.NewToursUserRegistration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_NewUserRegistration_TestData {

	public static void main(String[] args) throws FileNotFoundException {

		
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://newtours.demoaut.com");
		
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.findElementByLinkText("REGISTER").click();
		
	FileInputStream file = new FileInputStream("");
	XSSFWorkbook workbook = new XSSFworkbook("file");
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	Int RowCount=sheet.getLastRowNum();
	//zeroth row has got the Headings.
	
	for(int i=1;i<=RowCount;i++ )
	{
		
		Row r =sheet.getRow();	
		
		
dr.findElementByName("firstname").clear();		
dr.findElementByName("firstName").sendKeys(r.getCell(0).getStringCellValue());
dr.findElementByName("lastName").sendKeys(r.getCell(1).getStringCellValue());
dr.findElementByName("phone").sendKeys(r.getCell(2).getNumericCellValue());
dr.findElementByName("userName").sendKeys(r.getCell(3).getStringCellValue());
dr.findElementByName("address1").sendKeys(r.getCell(4).getStringCellValue());
dr.findElementByName("city").sendKeys(r.getCell(5).getStringCellValue());
dr.findElementByName("state").sendKeys(r.getCell(6).getStringCellValue());

  double d = r.getCell(7).getNumericCellValue();
  long y =(long)d;
   String s=Long.toString(y);
dr.findElementByName("postalCode").sendKeys(s);
dr.findElementByName("country").sendKeys(r.getCell(8).getStringCellValue());

dr.findElementByName("email").sendKeys(r.getCell(9).getStringCellValue());
dr.findElementByName("password").sendKeys(r.getCell(10).getStringCellValue());
dr.findElementByName("confirmPassword").sendKeys(r.getCell(11).getStringCellValue());
dr.findElementByName("register").click();

		 String  expected_UserName=r.getCell(9).getStringCellValue();
 String actual_RegisteredUserName=dr.findElementByXPath
("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();	 
		if(actual_RegisteredUserName.contains(expected_UserName))	
		{
			System.out.println("User Registered Succcessfully----PASSED");
r.createCell(12).setCellValue("User Registered Succcessfully----PASSED");
		}
		else
		{
			System.out.println("Test Case Failed----FAILED");
			r.createCell(12).setCellValue("Test Case Failed----FAILED");
		}
FileOutputStream file1 = new FileOutputStream("");
workbook.write(file1);
		dr.navigate().back();
	}
	}
	
	}