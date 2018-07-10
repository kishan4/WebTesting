package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeaderBlock_Testing {

	public static void main(String[] args) {

		
		
		FirefoxDriver drd = new FirefoxDriver();
		drd.get("http://tsrtconline.in/oprs-web/");
		//<div class="menu-wrap">
		
  WebElement headerblock =drd.findElementByClassName("menu-wrap");
List<WebElement>headerBlockLinks=headerblock.findElements(By.tagName("a"));
	System.out.println(headerBlockLinks.size());
	
	for(int i=0;i<headerBlockLinks.size();i++)
	{
		
 System.out.println(headerBlockLinks.get(i).getText());
 	headerBlockLinks.get(i).click();
 	System.out.println(drd.getTitle());
 	System.out.println(drd.getCurrentUrl());
 	System.out.println();
 	
 	drd.navigate().back();
 	Sleeper.sleepTightInSeconds(5);
 	 headerblock =drd.findElementByClassName("menu-wrap");
 	headerBlockLinks=headerblock.findElements(By.tagName("a"));
	}
	
	drd.close();
	
		
	}

}
