package com.ObjectRepo;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.GenericLibrary.ReUsableMethods;

public class FlightPage {
	
	 private  WebDriver driver;
	 
	 @FindBy(name="passCount")
	 private WebElement passengersSelectDropDown;
	 
	 
	 @FindBy(xpath="//*[contains(@value,'Business')]")
	 private WebElement businessClassRadioBtn;
	 
	 @FindBy(name="findFlights")
	 private WebElement continueBtn;
	 
	  
	 
	 @FindBy(name="reserveFlights")
	 private WebElement reserveFlightsContinueBtn;
	 
	 @FindBy(name="buyFlights")
	 private WebElement buyFlightsContinueBtn;
	 
	 
	 @FindBy(xpath="//*[contains(text(),'USD')]")
	 private List<WebElement> resultVal;
	 
	public FlightPage(WebDriver driver) {
		this.driver=driver;
	  PageFactory.initElements(this.driver, this);
	}
	
   public void fillDetailsAndClickContinue() {
	   
	   String ExpectedVal="$1169 USD";
	   
	   ReUsableMethods.selectByIndexusingSelectClass(this.passengersSelectDropDown, 1);
	   businessClassRadioBtn.click();
	   continueBtn.click();
	   ReUsableMethods.waitForPageToLoad(driver, 10);
	   this.reserveFlightsContinueBtn.click();
	   ReUsableMethods.waitForPageToLoad(driver, 10);
	   this.buyFlightsContinueBtn.click();
	   ReUsableMethods.waitForPageToLoad(driver, 10);
	   
	   System.out.println("Result is "+resultVal.get(1).getText());
	   
	   Assert.assertEquals(resultVal.get(1).getText().trim(),ExpectedVal);
	   
   }
	
	
	
}
