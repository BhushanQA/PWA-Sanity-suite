package com.qa.Dream11.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.Dream.util.TestUtil;
import com.qa.Dream.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
//
	public static void initialization(){
		
		{
			try {
				prop = new Properties();
				
				FileInputStream ip1 = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/Dream11/config/config.properties");
				prop.load(ip1);
				//System.out.println("Size of file =  s"+prop.size());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			String directory = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", directory+"/Drivers/chromedriverversion.exe");	
			driver = new ChromeDriver(); 

			driver.manage().window().maximize();
			
			
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "");	
			driver = new FirefoxDriver(); 
		}
		
	
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
	
	
	

}
