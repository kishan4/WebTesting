package com.WebTable;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingComplete_FirstColumnData {

	public static void main(String[] args) {
		
		
		
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://www.timeanddate.com/worldclock/");
		ff.manage().window().maximize();
		
	
		
//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]	
//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[1]
		
		
for(int i=1;i<=36;i++)
{

 String cityName=ff.findElementByXPath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td[1]").getText();

 System.out.println(cityName);
}
 ff.close(); 
	}

}
