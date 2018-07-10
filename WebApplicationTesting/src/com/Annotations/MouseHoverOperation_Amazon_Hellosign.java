package com.Annotations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHoverOperation_Amazon_Hellosign {

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
	}

	
	@Test
	public void Signin()
	{
		WebElement hello =driver.findElementById("nav-link-yourAccount");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(hello).build().perform();

		//.//*[@id='nav_prefetch_yourorders']/span
		
	driver.findElementByXPath(".//*[@id='nav_prefetch_yourorders']/span").click();
	}
	
	@AfterTest
	public void tearDow()
	{
		driver.close();
	}
	
}
