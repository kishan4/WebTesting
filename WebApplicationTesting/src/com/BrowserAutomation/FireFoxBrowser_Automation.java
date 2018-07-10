package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser_Automation {

	public static void main(String[] args) {

		FirefoxDriver  kishan = new FirefoxDriver();
		kishan.get("http://www.gmail.com");
		kishan.navigate().to("http://www.facebook.com");
		kishan.close();
			
		
	}

}
