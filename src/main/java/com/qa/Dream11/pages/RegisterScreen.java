package com.qa.Dream11.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;
import com.qa.Dream.util.GenerateData;
import com.qa.Dream11.base.TestBase;

public class RegisterScreen extends TestBase {

	public Faker faker;
	public GenerateData dataOBJ;

	public void registerUser() throws InterruptedException {
		GenerateData dataOBJ = new GenerateData();
		Faker faker = new Faker();
		String phoneNumber = dataOBJ.generatingRandomNumber(9);

		driver.findElement(By.id("login_desktop")).click();

		driver.findElement(By.xpath("//a[@class='registerLink_cf5d8']")).click(); // register link

		List<WebElement> Element = driver.findElements(By.xpath("//input"));

		Element.get(0).sendKeys("9" + phoneNumber);
		String emailId = "a" + phoneNumber + "@gmail.com";

		Element.get(1).sendKeys(emailId);
		Element.get(2).sendKeys(faker.internet().emailAddress() + "1a@");

		driver.findElement(By.xpath("//button[@class='new-button fullWidthGreenButton_5063b']")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@class='input-field']")).sendKeys("123456");

		driver.findElement(By.xpath("//button[@class='new-button fullWidthGreenButton_5063b']")).click();

	}

}
