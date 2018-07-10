package com.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_Frame {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
	driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	driver.switchTo().frame("classFrame");
	driver.findElement(By.linkText("navBarCell1Rev")).click();
		
		
	}
}
