package com.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {

	@BeforeTest
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
	
	@AfterTest
	public void ApplClose()
	{
		System.out.println("ApplClose Functionality Testing");
	}
}
