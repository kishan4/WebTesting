package com.GoogleTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click {

	public static void main(String[] args) {

		
		
		FirefoxDriver drd = new FirefoxDriver();
		drd.get("http://www.google.com");
		
		//<a class="gb_P" href="https://mail.google.com/mail/?tab=wm"
		//data-pid="23">Gmail</a>
		
		//drd.findElementByClassName("gb_P").click();
		
		//drd.findElementByLinkText("Gmail").click();
		
		drd.findElementByPartialLinkText("Gma").click();		
		drd.close();
		
	}

}
