package com.CapturingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class URL_Facebook {

	public static void main(String[] args) {
		
		FirefoxDriver drv  = new FirefoxDriver();
		drv.get("http://facebook.com");
		
	 String expected_Url="facebook.com"; //Client Expectation.
	 System.out.println(expected_Url+"  -  "+"expected  Url"); //Client
		
		
		 String actual_Url=drv.getCurrentUrl();
		System.out.println(actual_Url+"   -   "+ "ActualUrl");
		
		
		if(actual_Url.contains(expected_Url)) //IMPORTANT//
			
		{
			System.out.println("URL MATCHED---PASS");
			
		}
		
		else
		{
			System.out.println("URL NOT MATCHED---FAIL");
		}
		
	}

}
