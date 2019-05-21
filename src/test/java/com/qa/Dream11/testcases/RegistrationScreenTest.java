package com.qa.Dream11.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.qa.Dream.util.GenerateData;
import com.qa.Dream11.base.TestBase;
import com.qa.Dream11.pages.HomeScreen;
import com.qa.Dream11.pages.RegisterScreen;

public class RegistrationScreenTest extends TestBase {
	public GenerateData dataOBJ;
	public Faker faker;
	public RegisterScreen RegisterOBJ;

	@BeforeClass
	public void start() {

		initialization();

		dataOBJ = new GenerateData();
		RegisterOBJ = new RegisterScreen();
	}

	@Test
	public void login() throws InterruptedException {

		RegisterOBJ.registerUser();
		dataOBJ.selectRound();
		dataOBJ.createTeam();
	}

	@AfterClass
	public void close() {
//	driver.close();
	}
}
