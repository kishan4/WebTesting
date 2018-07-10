package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_DisplayingLinkNames {

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
	System.out.println(x+"  " +LinksNames);
	}
	drive.close();
	
	}

}
