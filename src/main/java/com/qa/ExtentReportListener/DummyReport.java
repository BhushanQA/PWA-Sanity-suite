package com.qa.ExtentReportListener;

import java.io.File;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class DummyReport {

	ExtentReports reports;
	ExtentTest testInfo;
	ExtentHtmlReporter htmlReporter;

	@BeforeTest
	public void setup()

	{
		htmlReporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"NewHtmlReport.html"));
		String path = System.getProperty("user.dir")+"/configExtent.xml";
		htmlReporter.loadXMLConfig(new File(path), null);
		
	}

}
