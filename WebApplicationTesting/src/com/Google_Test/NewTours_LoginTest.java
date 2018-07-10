package com.Google_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LoginTest {

	public static void main(String[] args) {

		
		FirefoxDriver driv = new FirefoxDriver();
		driv.get("http://newtours.demoaut.com");
		
		//<a href="mercuryregister.php">REGISTER</a>
		//href- attribute.
		//selector--REGISTER.
		driv.findElement(By.linkText("REGISTER")).click();
		
		
	}

}
