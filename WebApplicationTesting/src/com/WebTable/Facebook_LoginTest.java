package com.WebTable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LoginTest {

	public static void main(String[] args) {


		FirefoxDriver ffd = new FirefoxDriver();
		ffd.get("http://www.facebook.com");
		
		ffd.manage().window().maximize();
		
	//	<input id="email"
		
 ffd.findElementById("email").sendKeys("kishankumar1220@yahoo.com");
	 
 Actions act = new Actions(ffd);
 act.sendKeys(Keys.TAB).build().perform();	
 
 act.sendKeys("gmailfacebookyahoo");
 act.sendKeys(Keys.ENTER).build().perform();
 ffd.close();
	}
	}
	
	
