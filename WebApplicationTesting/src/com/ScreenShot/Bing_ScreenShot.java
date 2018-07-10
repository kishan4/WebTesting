package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Bing_ScreenShot {

	public static void main(String[] args) throws IOException {

		
		FirefoxDriver dv =  new FirefoxDriver();
		dv.get("http://bing.com");
		Sleeper.sleepTightInSeconds(10);
  File source=((TakesScreenshot)dv).getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(source,new File("C:\\Users\\kkish\\Desktop\\KishanSelenium\\WebApplicationTesting\\Screenshots\\bing.png"));
	dv.close();
				
		
	}

}
