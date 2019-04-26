package com.qa.Dream11.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Dream11.base.TestBase;
import com.qa.Dream11.pages.SplashScreen;

public class SplashTest extends TestBase 
{
	SplashScreen obj = new SplashScreen();
	@BeforeMethod
	public void launcher()
	{
		initialization();
		SplashScreen obj = new SplashScreen();
	}
	@Test
	public void login()
	{
		obj.login();
	}
	
	@AfterTest
	public void close()
	{
		//driver.close();
	}
}
