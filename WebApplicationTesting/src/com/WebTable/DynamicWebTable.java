package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable
{

	public static void main(String[] args) 
	{

		FirefoxDriver drv = new FirefoxDriver();
		drv.get("https://www.timeanddate.com/worldclock/");
		
		//html/body/div[1]/div[9]/section[2]/div[1]/table
  WebElement table=drv.findElementByXPath("html/body/div[1]/div[9]/section[2]/div[1]/table");
	List <WebElement>rows=table.findElements(By.tagName("tr"));
	
	for(int i=0;i<rows.size();i++)//rows
	{
		List <WebElement> cols =rows.get(i).findElements(By.tagName("td"));
	
			for(int k=0;k<cols.size();k++)//columns
				{
					String columnsname =cols.get(k).getText();
					System.out.print(columnsname+" ");
				}
		System.out.println();
		System.out.println();

	}
		
	
 }
}
