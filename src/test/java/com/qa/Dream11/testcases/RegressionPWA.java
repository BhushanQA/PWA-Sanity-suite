package com.qa.Dream11.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.github.javafaker.Faker;
import com.qa.Dream.util.GenerateData;
import com.qa.Dream11.base.TestBase;
import com.qa.Dream11.pages.Regression;

public class RegressionPWA extends TestBase {
	public GenerateData dataOBJ;
	public Faker faker;
	public Regression RegisterOBJ;

	@BeforeClass
	public void start() throws InterruptedException {

		initialization();
		dataOBJ = new GenerateData();
		RegisterOBJ = new Regression();
	}

	@Test(priority = 1)
	public void registerUser() throws InterruptedException {
		RegisterOBJ.registerUser();
		
		
	}
	
	@Test(priority = 2)
	public void selectRound()
	{
		dataOBJ.selectRound();
	}
	@Test(priority = 3)
	public void createTeam() throws InterruptedException
	{
		dataOBJ.createTeam();
	}

	@AfterClass
	public void close() {
		//driver.close();
	}
}
