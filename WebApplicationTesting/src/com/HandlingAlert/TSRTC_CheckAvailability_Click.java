package com.HandlingAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_CheckAvailability_Click {

	public static void main(String[] args) {


		FirefoxDriver drd = new FirefoxDriver();
		drd.get("http://tsrtconline.in/oprs-web/");
		drd.manage().window().maximize();
		drd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		//input id="searchBtn"
	drd.findElementById("searchBtn").click();
	
	 Alert alet=drd.switchTo().alert();
	 System.out.println(alet.getText());
	 alet.accept(); // CLICK ON OK BUTTON.
	// alet.dismiss(); //CLICK ON CANCEL.
	// alet.sendKeys("KISHAN"); //SENDING DATA INTO ELEMENT.
	 
	 		
	}

}
 