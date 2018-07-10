package com.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {

	
	@BeforeMethod
	public void OpenApplication() 
	{
		System.out.println("Gmail Application Launched");
	}
	
	@Test(priority=0)
	public void Inbox()
	{
		System.out.println("Inbox Functionality Testing");
	}
	
	@Test(priority=1)
	public void ComposeMail()
	{
		System.out.println("Compose Mail Functionality Testing");
	}
	
	@AfterMethod
	public void ApplClose()
	{
		System.out.println("GmailApplication Close");
	}
}
/* Gmail Application Launched
Inbox Functionality Testing
GmailApplication Close
Gmail Application Launched
Inbox Functionality Testin
GmailApplication Close
*/

