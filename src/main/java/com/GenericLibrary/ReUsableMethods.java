package com.GenericLibrary;

import java.io.File;
import java.time.Duration;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	public static void takeScreenshot(WebDriver driver,String name) {
		
		try {
			File newFile =new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+".jpg");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src, newFile);
		}
		catch(Exception exe)
		{
			System.out.println(exe.getMessage());
		}
		
		
		
		
		
	}
	
}
