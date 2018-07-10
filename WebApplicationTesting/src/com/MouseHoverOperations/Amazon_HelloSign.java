package com.MouseHoverOperations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSign {

	public static void main(String[] args) {

		
		FirefoxDriver drive = new FirefoxDriver();
		drive.get("http://amazon.in");
		drive.manage().window().maximize();
		
		//id="nav-link-yourAccount"
		
		Actions act = new Actions(drive);

 WebElement hello =drive.findElementById("nav-link-yourAccount");
	act.moveToElement(hello).build().perform();

	//.//*[@id='nav_prefetch_yourorders']/span
	
drive.findElementByXPath(".//*[@id='nav_prefetch_yourorders']/span").click();
	
//		driver.close();
	}

}
