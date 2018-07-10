package com.DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnElement_JqueryuiApplication {

	public static void main(String[] args) {


		FirefoxDriver dr = new FirefoxDriver();
		dr.get("http://jqueryui.com/droppable/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().deleteAllCookies();
		
		//iframe class="demo-frame"
		
	dr.switchTo().frame(dr.findElementByClassName("demo-frame"));	
		
		
//	.//*[@id='draggable']
		
 WebElement source =dr.findElementByXPath(".//*[@id='draggable']");
 // .//*[@id='droppable']
		 
 WebElement destination =dr.findElementByXPath(".//*[@id='droppable']");
 
 	Actions act = new Actions(dr);
 	act.dragAndDrop(source, destination).build().perform();
 	 
 	
 	
	}

}
