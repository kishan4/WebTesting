package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingComplete_WebTableData {

	public static void main(String[] args) {


		
		FirefoxDriver drv = new FirefoxDriver();
		drv.get("https://www.timeanddate.com/worldclock/");
		drv.manage().window().maximize();
		//drv.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[8]
		
		
		for(int i=1;i<=36;i++)  //Row's 
		{
			for(int j=1;j<=8;j++) //Row of all columns
			{
 String data=drv.findElementByXPath
	 ("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]").getText();
		System.out.println(data+ " ");
		
			}
			System.out.println();
		}
		drv.close();		
	}

}
