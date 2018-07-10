package com.GoogleTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExternalBrowsers_Automation {

	public static void main(String[] args) {

		//Chrome Browsser		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\kkish\\Desktop\\KishanSelenium\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("http://facebook.com");
	
		//Edge Browser
		
//System.setProperty("webdriver.edge.driver","C:\\Users\\kkish\\Desktop\\KishanSelenium\\WebApplicationTesting\\DriverFiles\\MicrosoftWebDriver.exe");
//EdgeDriver driver = new EdgeDriver();
//driver.get("http://yahoo.com");

//Firefox Browser  latest version 50-60 version,, you need to
//have selenium 3 version. 

//Firefox Browser version from 44-48 ,, compatable version is 
// Selenium 2.15.

System.setProperty("webdriver.gecko.driver","C:\\Users\\kkish\\Desktop\\KishanSelenium\\WebApplicationTesting\\DriverFiles\\geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://youtube.com");




		
	}

}
