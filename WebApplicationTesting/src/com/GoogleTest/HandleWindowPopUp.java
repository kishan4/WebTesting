package com.GoogleTest;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
	

	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.popuptest.com/goodpopups.html");

	driver.findElementByClassName("blu").click();
	
	 Set<String> handler = driver.getWindowHandles();
	 
	 Iterator<String> it = handler.iterator();
	 String parentWindowId = it.next();
		System.out.println("parent window id:"+ parentWindowId);
		System.out.println();
		
		
		String childWindowId = it.next();
		System.out.println("Child window id:"+childWindowId);
		System.out.println();
		
		driver.switchTo().window(childWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("child window pop up title is " +   driver.getTitle());
		System.out.println();
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("parent window title is  " +    driver.getTitle());
		
		
		
	}

}
