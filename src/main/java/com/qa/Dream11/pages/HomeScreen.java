package com.qa.Dream11.pages;

import org.openqa.selenium.By;

import com.qa.Dream11.base.TestBase;

public class HomeScreen extends TestBase
{
	
	public void selectAnyMatch()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[3]/a[1]/div")).click();
		
	}
}
