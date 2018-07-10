package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class NewTours_HomePage_LinksTesting {

	public static void main(String[] args) {

		FirefoxDriver drive = new FirefoxDriver();
		drive.get("http://newtours.demoaut.com");
//<a href="mercurysignon.php?osCsid=11b83e744197ca9228336ea9f5f9e6a3">SIGN-ON</a>
//<a href="mercuryregister.php?osCsid=11b83e744197ca9228336ea9f5f9e6a3">REGISTER</a>	
//<a href="mercuryunderconst.php?osCsid=11b83e744197ca9228336ea9f5f9e6a3">SUPPORT</a>
		
	List<WebElement>Links=drive.findElements(By.tagName("a"));	
	System.out.println(Links.size());
	for(int x=0;x<Links.size();x++)
	{
	String LinksNames=Links.get(x).getText();
//	String LinksNames=Links.get(0).getText();
	System.out.println(x+"  " +LinksNames);
	Links.get(x).click();
	System.out.println(drive.getTitle());
	System.out.println(drive.getCurrentUrl());
	System.out.println();
	Sleeper.sleepTightInSeconds(5);
	drive.navigate().back();
	Links=drive.findElements(By.tagName("a"));	

	}
	
	drive.close();
		
	}

}
