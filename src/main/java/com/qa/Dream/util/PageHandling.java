package com.qa.Dream.util;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.Dream11.base.TestBase;

public class PageHandling extends TestBase {

	public Actions actionObject;
	JavascriptExecutor js;

	public void scroll() {
		Dimension dimensions = driver.manage().window().getSize();
		System.out.println(dimensions);
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		// driver.swipe(0, scrollStart, 0, scrollEnd, 1000);
	}

	public void scrollTillWebElementDisplay(WebElement webElement) {
		while (true) {
			if (!webElement.isDisplayed()) {
				this.scroll();
			} else
				break;
		}
	}

	public void clickAnElement(WebElement element) {
		actionObject = new Actions(driver);
		actionObject.moveToElement(element).click().perform();
	}
	/**
	    * True : ScrollDown to the bottom of the Page False: ScrollUp to the Top of the
	    * page
	    *
	    * @param TopBottom
	    * @throws InterruptedException
	    */
	
	public void scrollTopBottom(Boolean TopBottom) throws InterruptedException {
	       js = (JavascriptExecutor) driver;

	      
	       if (TopBottom) {
	           js.executeScript("window.scrollBy(0, -5000);");
	           Thread.sleep(1000);
	       } else {
	           js.executeScript("window.scrollBy(0,5000);");
	           Thread.sleep(1000);
	       }
	   }
	
	public void scrollBottomTop()
	{
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-1000)");
	}

}
