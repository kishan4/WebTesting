package com.GoogleTest;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		
		
		FirefoxDriver driver = new FirefoxDriver();
	//	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//driver.findElementByName("proceed").click();
	//Thread.sleep(5000);
    //  Alert alert =driver.switchTo().alert();
     //System.out.println(alert.getText());
       // alert.accept();
         driver.get("https://html.com/input-type-file/");
         driver.manage().window().maximize();
         driver.findElementById("fileupload").sendKeys
     ("C:\\Users\\kkish\\Desktop\\B1.PNG");
         driver.close();
         
         
		
          
          
          
	}

}
