package com.ValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Google {

	public static void main(String[] args) {
	
		
		FirefoxDriver drv  = new FirefoxDriver();
		drv.get("http://google.com");
		
		String expected_Title="Google";
System.out.println(expected_Title+"  -  "+"Expected title of Google");
		
	String 	actual_Title=drv.getTitle();
System.out.println(actual_Title+"  -  "+"Actual title of Google");

	if(actual_Title.equals(expected_Title))
	{
		System.out.println("Test Case Passed");
	}
	else
	{
		System.out.println("Test Case Failed");
	}
		drv.close();

	}

}
