package com.qa.Dream.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.Dream11.base.TestBase;

public class GenerateData extends TestBase {
	PageHandling pageHandle = new PageHandling();

	public String generatingRandomAlphabeticString(int charlimit) {
		String generatedString = RandomStringUtils.randomAlphabetic(charlimit);
		System.out.println("String : " + generatedString);
		return generatedString;
	}

	public String generatingRandomNumber(int charlimit) {
		String generatedString = RandomStringUtils.randomNumeric(charlimit);
		System.out.println("String : " + generatedString);
		return generatedString;
	}

	public void createTeam() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/div[1]/button")).click();
		System.out.println("After skip");

		// -----------------------Select Wicket keeper----------------

		List<WebElement> wicketkeeper = driver.findElements(By.xpath("//i[contains(text(),'add')]"));
		wicketkeeper.get(0).click();
		System.out.println("after list" + wicketkeeper.size());

		// -----------Select batsman--------------------------------

		driver.findElement(By.xpath("//div[contains(text(),'BAT')]")).click();
		System.out.println("After click on Bat");

		Thread.sleep(10000);

		List<WebElement> Batsman = driver.findElements(By.xpath("//i[contains(text(),'add')]"));
		System.out.println("Batsman = " + Batsman.size());

		for (int i = 0; i < Batsman.size(); i++) {
			WebElement bat = Batsman.get(i);
			pageHandle.scrollTillWebElementDisplay(bat);
			pageHandle.clickAnElement(bat);
			System.out.println("i: " + i);
		}

		// ----------------select All rounder-----------------

		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),'AR')] ")).click();
		Thread.sleep(10000);

		List<WebElement> AR = driver.findElements(By.xpath("//i[contains(text(),'add')]"));
		System.out.println("All rounder = " + AR.size());



		System.out.println("beeeee");

		// AR.get(0).click();
		// AR.get(1).click();

		for (int i = AR.size(); i >= AR.size(); i--) {
			int index = i;
			--index;
			WebElement ARounder = AR.get(index);
			// boolean result = ARounder.isDisplayed();
			// System.out.println("Boolean result" + result);

			ARounder.click();



		}

		// ----------------select Bowler-----------------

		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),'BOWL')] ")).click();

		List<WebElement> BL = driver.findElements(By.xpath("//i[contains(text(),'add')]"));
		System.out.println("All rounder = " + BL.size());

		for (int i = BL.size(); i > 0; i--) {
			int index1 = i;
			--index1;
			WebElement Bowler = BL.get(index1);
			pageHandle.scrollTillWebElementDisplay(Bowler);
			pageHandle.clickAnElement(Bowler);
			System.out.println("i: " + i);
		}

		// -----------click on continue-----------------

		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='new-button raisedGreenButton_20c05']")).click();

		// -------------select captain--------------------


		driver.navigate().refresh();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='new-button raisedGreenButton_20c05']")).click();

		List<WebElement> selectCaptain = driver
				.findElements(By.xpath("//div[@class='rolesContainer_7991a']//div[contains(text(),'C')]"));
		System.out.println("size of team =" + selectCaptain.size());

	

		selectCaptain.get(0).click();
		selectCaptain.get(3).click();

		driver.findElement(By.xpath("//button[@class='new-button raisedGreenButton_20c05']")).click();

		List<WebElement> contestList = driver.findElements(By.xpath("//button[contains(@class,'smallGreen')]"));
		System.out.println("contest list =" + contestList.size());
		contestList.get(0).click();

		driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("01");
		driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");

		driver.findElement(By.xpath("//div[@class='form-field-link-content']")).click();

		List<WebElement> stateList = driver.findElements(By.xpath("//div[@class='dialog-body']/div"));
		System.out.println("State list =" + stateList.size());
		stateList.get(0).click();

		driver.findElement(By.xpath("//button[@class='btn btn--raised']")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Go Ahead')]")).click();


	}
}
