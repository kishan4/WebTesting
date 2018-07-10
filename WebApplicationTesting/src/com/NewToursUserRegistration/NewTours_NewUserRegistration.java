package com.NewToursUserRegistration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_NewUserRegistration {

	public static void main(String[] args) {

		
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://newtours.demoaut.com");
		
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.findElementByLinkText("REGISTER").click();
		
		//<input size="20" name="firstName" maxlength="60">
		dr.findElementByName("firstName").sendKeys("Kishan");
		//<input size="20" name="lastName" maxlength="60">
		dr.findElementByName("lastName").sendKeys("Dontha");
		//<input size="15" name="phone" maxlength="20">
		dr.findElementByName("phone").sendKeys("1234567892");
		dr.findElementByName("userName").sendKeys("kishan@gmail.com");
		dr.findElementByName("address1").sendKeys("HI tech city");
		dr.findElementByName("city").sendKeys("Hyderabad");
		dr.findElementByName("state").sendKeys("Telangana");
		dr.findElementByName("postalCode").sendKeys("508211");
		dr.findElementByName("country").sendKeys("INDIA");

		dr.findElementByName("email").sendKeys("krish");
		dr.findElementByName("password").sendKeys("kishan12345");
		dr.findElementByName("confirmPassword").sendKeys("kishan12345");
		dr.findElementByName("register").click();

		 String  expected_UserName="krish";
 String actual_RegisteredUserName=dr.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();	 
		if(actual_RegisteredUserName.contains(expected_UserName))	
		{
			System.out.println("User Registered Succcessfully----PASSED");
		}
		else
		{
			System.out.println("Test Case Failed----FAILED");
		}	
		dr.close();
	}

}
