package com.CapturingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title_Google {

	public static void main(String[] args) {
		
		FirefoxDriver drv  = new FirefoxDriver();
		drv.get("http://google.com");
		String 	actual_Title=drv.getTitle();
		System.out.println(actual_Title+"  -  "+"Actual title of Google");
		System.out.println(drv.getCurrentUrl());
		drv.close();
		
		}

}
