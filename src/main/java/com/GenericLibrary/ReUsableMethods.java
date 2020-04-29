package com.GenericLibrary;

import java.time.Duration;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReUsableMethods {
	
	public static WebDriverWait wait;
	
	private static  Select select;
	
	 
	 
	
	
	//public static WebElement wb;
	
	public  static void waitForElementToAppearInUI(WebDriver driver,int seconds,By by) {
		
		wait=new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		
		
	}
	
     public  static void waitForElementToDisplayInUI(WebDriver driver,int seconds,WebElement wb) {
		
		wait=new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(wb));
		
		
	}
	
	public static void selectByIndexusingSelectClass(WebElement wb,int index) {
		select =new Select(wb);
		select.selectByIndex(index);
	}

	public static void waitForPageToLoad(WebDriver driver, long seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
}
