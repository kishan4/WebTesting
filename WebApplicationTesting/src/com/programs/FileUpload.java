package com.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkish\\Desktop\\KishanSelenium\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");	
WebDriver driver = new ChromeDriver(); //launch chrome		
				
		
driver.manage().window().maximize();
driver.get("http://html.com/input-type-file/");
driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\kkish\\Desktop\\upload.docx");

	}

}
