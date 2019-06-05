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
		return generatedString;
	}

	public String generatingRandomNumber(int charlimit) {
		String generatedString = RandomStringUtils.randomNumeric(charlimit);
		return generatedString;
	}

	// ---------------------------------Select round

	public void selectRound() {

		List<WebElement> listofRounds = driver.findElements(By.xpath("//div[@class='matchCardMain_954a1']"));
		int size = listofRounds.size();
	
		
		// --size;
		int size1 = size - 2;
		listofRounds.get(size1).click();

	}

	// --------------------------------------------------------------------------------

	public void createTeam() throws InterruptedException {
		
		//Thread.sleep(5000);
		
		System.out.println("inside create team");
		PageHandling pageHandle = new PageHandling();
		WebElement skip = pageHandle.waitForClickableElement(By.xpath("//div[contains(text(),'Skip')]"));
		
		pageHandle.clickAnElement(skip);
		//skip.click();
		//driver.findElement(By.xpath("//div[contains(text(),'Skip')]")).click();

		// -----------------------Select Wicket keeper----------------

		List<WebElement> wicketkeeper = driver.findElements(By.xpath("//i[contains(text(),'add')]"));
		wicketkeeper.get(0).click();

		// -----------Select batsman--------------------------------

		driver.findElement(By.xpath("//div[contains(text(),'BAT')]")).click();

		Thread.sleep(10000);

		List<WebElement> Batsman = driver.findElements(By.xpath("//i[contains(text(),'add')]"));

		for (int i = 0; i < Batsman.size(); i++) {
			WebElement bat = Batsman.get(i);
			pageHandle.scrollTillWebElementDisplay(bat);
			pageHandle.clickAnElement(bat);
		}

		// ----------------select All rounder-----------------

		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),'AR')] ")).click();
		Thread.sleep(10000);

		List<WebElement> AR = driver.findElements(By.xpath("//i[contains(text(),'add')]"));

		for (int i = AR.size(); i >= AR.size(); i--) {
			int index = i;
			--index;
			WebElement ARounder = AR.get(index);

			ARounder.click();

		}

		// ----------------select Bowler-----------------

		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),'BOWL')] ")).click();

		List<WebElement> BL = driver.findElements(By.xpath("//i[contains(text(),'add')]"));

		for (int i = BL.size(); i > 0; i--) {
			int index1 = i;
			--index1;
			WebElement Bowler = BL.get(index1);
			pageHandle.scrollTillWebElementDisplay(Bowler);
			pageHandle.clickAnElement(Bowler);
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

		selectCaptain.get(0).click();
		selectCaptain.get(3).click();

		driver.findElement(By.xpath("//button[@class='new-button raisedGreenButton_20c05']")).click();

		List<WebElement> contestList = driver.findElements(By.xpath("//button[contains(@class,'smallGreen')]"));
		contestList.get(0).click();

		driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("01");
		driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("1993");

		driver.findElement(By.xpath("//div[@class='form-field-link-content']")).click();

		List<WebElement> stateList = driver.findElements(By.xpath("//div[@class='dialog-body']/div"));
		stateList.get(0).click();

		driver.findElement(By.xpath("//button[@class='btn btn--raised']")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Go Ahead')]")).click();

	}
}
