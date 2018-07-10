package com.Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest {
	FirefoxDriver dr;
	
	@BeforeTest
	public void setUp()
	{
	    dr = new FirefoxDriver();
	 	dr.get("http://newtours.demoaut.com");
	 	
	 	dr.manage().window().maximize();
	 	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void LoginTest()
	{
		
		dr.findElement(By.name("userName")).sendKeys("tutorials");
		//<input type="password" size="10" name="password">
		dr.findElement(By.name("password")).sendKeys("tutorials");
		
	//<input width="58" type="image" border="0" height="17" alt="Sign-In" 
	//src="/images/btn_signin.gif" value="Login" name="login">
		
		WebElement Signin = dr.findElement(By.name("login"));
		Signin.click();
		
		
		String expected_Title="Find"; //Client Requirement.
		String actual_Title=dr.getTitle();
		
		if(actual_Title.contains( expected_Title))
		{
			System.out.println("TestCase Passed");
		}
		
		else
		{
			System.out.println("TestCase  Not Passed");
		}	
}
	@AfterTest
	public void tearDow()
	{
		dr.close();
	}
}
