package com.qa.Dream11.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

import com.qa.Dream11.base.TestBase;

public class SplashScreen extends TestBase
{
	@FindBy(xpath = "")
	WebElement a;
	
	@FindBy(id="login_desktop")
	WebElement loginButton;
	
	
	public void login()
	{
		loginButton.click();
	}
	
	
}
