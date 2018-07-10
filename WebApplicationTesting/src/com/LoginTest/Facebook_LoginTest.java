package com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LoginTest {

	public static void main(String[] args) {

		
				FirefoxDriver drvd= new FirefoxDriver();
				drvd.get("http://facebook.com");
	
				//<input type="email" data-testid="royal_email" 
				//tabindex="1" id="email" name="email" class="inputtext">			
			
				//id-- Locator
				//Selector-- email
				
		drvd.findElement(By.id("email")).sendKeys("Hello");
		//<input id="pass" class="inputtext" type="password" 
		//	data-testid="royal_pass" tabindex="2" name="pass">
		
		drvd.findElement(By.id("pass")).sendKeys("World!");
		
		drvd.findElement(By.id("loginbutton")).click();
		
		drvd.close();		

	}

}
