package com.AppScripts;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class signUpFree {

	
	public static ExtentReports extentreport;
	public static ExtentTest logger;
	
	
	
	@BeforeSuite
	public void setupExtent() {
		
		extentreport=new ExtentReports("./reports/myextenttest.html");
		logger = extentreport.startTest("Starting test");
		
	}
	
	
@Test(priority=1)
  public void SignUpFreeAccount() {
	  
		
	  logger.log(LogStatus.PASS, "It is Extent Reports");
	  logger.log(LogStatus.FAIL, "Extent report failed");
	  
	  extentreport.flush();
	  
	  
	  
  }
}
