package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1
{
	@Test(priority=0)
	public void BrowserLaunch()
	{
		System.out.println("Firefox Browser Launch");
	}
	
	@Test(priority=1)
	public void Login()
	{
		System.out.println("LogIn Functionality");
		
	}
	
	@Test(priority=2)
	public void Inbox()
	{
		System.out.println("Inbox Functionality");
		
	}
	
	@Test(priority=3)
	public void ComposeMail()
	{
		System.out.println("Compose Mail Functionality");
		
	}
	
	@Test(enabled=false)
	public void ApplClose()
	{
		System.out.println("ApplClose Functionality");
		
	}
	
}
