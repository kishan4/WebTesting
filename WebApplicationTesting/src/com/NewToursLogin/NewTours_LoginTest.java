package com.NewToursLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LoginTest {

	public static void main(String[] args) 
	{
		FirefoxDriver  dr = new FirefoxDriver();
		dr.get("http://newtours.demoaut.com");
		
		//<input type="text" size="10" name="userName">
		
		dr.findElement(By.name("userName")).sendKeys("tutorials");
		//<input type="password" size="10" name="password">
		dr.findElement(By.name("password")).sendKeys("tutorials");
		
	//<input width="58" type="image" border="0" height="17" alt="Sign-In" 
	//src="/images/btn_signin.gif" value="Login" name="login">
		
		WebElement Signin = dr.findElement(By.name("login"));
		Signin.click();
		dr.close();
		
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
}