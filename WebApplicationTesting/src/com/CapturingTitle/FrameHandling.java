package com.CapturingTitle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver drv  = new FirefoxDriver();
		drv.manage().window().maximize();
		
		
 drv.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
 drv.get("http://www.freecrm.com");
 drv.findElement(By.name("username")).sendKeys("krish1");
 drv.findElement(By.name("password")).sendKeys("Durgamatha123@");
 drv.findElement(By.xpath("//input[@type='submit']")).click();
  Thread.sleep(2000);
 
drv.switchTo().frame("mainpanel");
Thread.sleep(2000);
  //drv.findElement(By.linkText("Contacts")).click();
 drv.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click(); // Creating own xpath
	}
}

	