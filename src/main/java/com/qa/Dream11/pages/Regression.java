package com.qa.Dream11.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;
import com.qa.Dream.util.GenerateData;
import com.qa.Dream11.base.TestBase;

public class Regression extends TestBase {

	public Faker faker;
	public GenerateData dataOBJ;

	public void registerUser() throws InterruptedException {
		GenerateData dataOBJ = new GenerateData();

		String phoneNumber = "9" + dataOBJ.generatingRandomNumber(9);
		String emailId = "bhushan@gmail.com";
		String password = "1@bhushan";
		
		
		
		String title = "Play Fantasy Cricket Game & Fantasy Leagues Online - Dream11 Official Partner of VIVO IPL 2019";

		Assert.assertEquals(driver.getTitle(),title, "Register Page Title not Loaded");
		
		
		driver.findElement(By.id("login_desktop")).click();
		String title1 = driver.findElement(By.xpath("//div[@class='toolbar-title']")).getText();
		Assert.assertEquals(title1, "LOGIN", "Log in page is not load");

		driver.findElement(By.xpath("//a[@class='registerLink_cf5d8']")).click(); // register link
		List<WebElement> Element ;
		do {
			Element = driver.findElements(By.xpath("//input"));// list of input box
			System.out.println("WHILE");
		} while (Element.size() < 3);
		

		Element.get(0).sendKeys(phoneNumber);
		
		Element.get(1).click();
		Element.get(1).clear();
		Element.get(1).sendKeys("a"+phoneNumber+"@gmail.com");

		Element.get(2).sendKeys("1@abcd123");

		driver.findElement(By.xpath("//button[@class='new-button fullWidthGreenButton_5063b']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class='input-field']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@class='input-field']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@class='input-field']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@class='input-field']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@class='input-field']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@class='input-field']")).sendKeys("6");

		driver.findElement(By.xpath("//button[@class='new-button fullWidthGreenButton_5063b']")).click();


	}

}
