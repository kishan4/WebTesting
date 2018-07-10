package com.GoogleTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Customxpath {

	public static void main(String[] args) {

		
		FirefoxDriver drv = new FirefoxDriver();
		drv.manage().window().maximize();
		drv.get("https://www.ebay.com");
drv.findElementByXPath("//*[@id='gh-ac']").sendKeys("JAVA");
drv.findElementById("gh-btn").click();
	

	}

}
