package com.BasicJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Facebook {

	public static void main(String[] args)
	{
		
		FirefoxDriver  kishan = new FirefoxDriver();
		kishan.navigate().to("http://www.tutorialspoint.com");
		kishan.close();
	}

}
