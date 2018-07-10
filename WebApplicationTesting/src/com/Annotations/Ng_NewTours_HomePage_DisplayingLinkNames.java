package com.Annotations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ng_NewTours_HomePage_DisplayingLinkNames
{

	FirefoxDriver drive;
	
	@BeforeTest
	public void setUp()
	{
		 drive = new FirefoxDriver();
		drive.get("http://newtours.demoaut.com");
		
		drive.manage().window().maximize();
	 	drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
	
	@Test
	public void LoginTest()
	{
		
		List<WebElement>Links=drive.findElements(By.tagName("a"));	
		System.out.println(Links.size());
		for(int x=0;x<Links.size();x++)
		{
		String LinksNames=Links.get(x).getText();
		System.out.println(x+"  " +LinksNames);
		}
		
		
	}
	
	@AfterTest
	public void tearDow()
	{
		
		drive.close();
		
	}
	
}
