package com.tests;


import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.ReUsableMethods;
import com.ObjectRepo.FlightPage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.RegisterPage;

public class FirstTest extends BaseClass {

    public   RegisterPage registerPageObj;
    public 	HomePage homePageObj;
    public FlightPage flightPageObj;
	
	
	@Test
	public void test1() {
		
		BaseClass.driver.get("http://newtours.demoaut.com/");
		
		     registerPageObj=new RegisterPage(BaseClass.driver);
			 homePageObj=new HomePage(BaseClass.driver);
			 flightPageObj= new FlightPage(BaseClass.driver);
			 
			 
		     homePageObj.clickRegisterButton();
		     registerPageObj.register();
		     
		     homePageObj.clickFlightButton();
		     
		     flightPageObj.fillDetailsAndClickContinue();
		     
		     homePageObj.clickSignOffButton();
		     
		     ReUsableMethods.takeScreenshot(BaseClass.driver, "SignOffPage");
		     
		
	}
	
	

	
}
