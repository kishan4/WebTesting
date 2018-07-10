package com.Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ng_NewTours_NewUserRegistartion {
	
	FirefoxDriver drd;
	
	@BeforeTest
	public void setUp()
	{
	    drd = new FirefoxDriver();
		drd.get("http://newtours.demoaut.com");
		drd.manage().window().maximize();
		drd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Test
	public void Register()
	{
				drd.findElementByLinkText("REGISTER").click();
		//<input size="20" name="firstName" maxlength="60">
				drd.findElementByName("firstName").sendKeys("Kishan");
		//<input size="20" name="lastName" maxlength="60">
				drd.findElementByName("lastName").sendKeys("Dontha");
		//<input size="15" name="phone" maxlength="20">
				drd.findElementByName("phone").sendKeys("1234567892");
				drd.findElementByName("userName").sendKeys("kishan@gmail.com");
				drd.findElementByName("address1").sendKeys("HI tech city");
				drd.findElementByName("city").sendKeys("Hyderabad");
				drd.findElementByName("state").sendKeys("Telangana");
				drd.findElementByName("postalCode").sendKeys("508211");
				drd.findElementByName("country").sendKeys("INDIA");

				drd.findElementByName("email").sendKeys("krish");
				drd.findElementByName("password").sendKeys("kishan12345");
				drd.findElementByName("confirmPassword").sendKeys("kishan12345");
				drd.findElementByName("register").click();

				 String  expected_UserName="krish";
String actual_RegisteredUserName=drd.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();	 
				if(actual_RegisteredUserName.contains(expected_UserName))	
				{
					System.out.println("User Registered Succcessfully----PASSED");
				}
				else
				{
					System.out.println("Test Case Failed----FAILED");
				}	
	}
	
	@AfterTest
	public void tearDow()
	{
		drd.close();
	}
	
	
}
