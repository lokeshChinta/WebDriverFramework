package com.tests;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.ReUsableMethods;
import com.ObjectRepo.FlightPage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.Login;
import com.ObjectRepo.RegisterPage;
import com.aventstack.extentreports.ExtentReports;

public class FirstTest extends BaseClass  {

    public   RegisterPage registerPageObj;
    public 	HomePage homePageObj;
    public FlightPage flightPageObj;
    public Login loginObj;
	
	
	@Test
	public void test1() throws IOException {
		
		
	
		
		BaseClass.driver.get("http://newtours.demoaut.com/");
		
		     registerPageObj=new RegisterPage(BaseClass.driver);
			 homePageObj=new HomePage(BaseClass.driver);
			 flightPageObj= new FlightPage(BaseClass.driver);
			 
			 loginObj=new Login(BaseClass.driver);
			 
		     homePageObj.clickRegisterButton();
		     
		     ReUsableMethods.logger.info("Register Button is clicked successfully");
		     
		     String name=ReUsableMethods.takeScreenshot(BaseClass.driver, "RegisterPage");
		     
		     ReUsableMethods.logger.addScreenCaptureFromPath(name, "REGISTER PAGE");
		     
		     
		     registerPageObj.register();
		     
		     ReUsableMethods.logger.info("Register Button is clicked successfully");
			 
			 // loginObj.loginToApp();
			 
			 ReUsableMethods.logger.info("Logging into APP Successfully");
		     
		    homePageObj.clickFlightButton();
		     
		     ReUsableMethods.logger.info("Flight Button is clicked successfully");
		     
		     ReUsableMethods.waitForPageToLoad(BaseClass.driver, 10);
		     
		     flightPageObj.fillDetailsAndClickContinue();
		     
		     ReUsableMethods.logger.info("Details entered by the user and clicked on Continue  Button");
		     
		     homePageObj.clickSignOffButton();
		     
		     ReUsableMethods.logger.info("sign Off Button is clicked successfully");
		     
		     ReUsableMethods.takeScreenshot(BaseClass.driver, "SignOffPage");
		     
		     
		     
		     
		
	}
	
	

	
}
