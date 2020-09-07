package com.AppScripts;





import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.App.PageObjects.AppLogin;
import com.App.Utilities.BrowserFactory;
import com.App.Utilities.ConfigReader;
import com.App.Utilities.ScreenCapture;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class AppLoginTest extends ConfigReader 
{
	public static WebDriver driver;
	public static ConfigReader appreader;
	public static BrowserFactory bfactory;
	
	public static ExtentReports extentreport;
	public static ExtentTest test;
	public static ScreenCapture screencapture;
	
	private static Logger logger = Logger.getLogger(AppLoginTest.class);
	

	@BeforeSuite
	public void setupSuite() {
		appreader=new ConfigReader();
		bfactory=new BrowserFactory();
		extentreport=new ExtentReports("./reports/report.html");
		test=extentreport.startTest("sample test");
		screencapture=new ScreenCapture();
		
	}
	
	
    @Test
    public void verifyLogin() throws Exception    {
    	
    	PropertyConfigurator.configure("./myfiles/log4j.properties");
    	
    	driver =BrowserFactory.getBrowser(appreader.getBrowsername(),appreader.getAppurl());
    	test.log(LogStatus.PASS, "Launching browser");
    	
    	
		
    	
    	
    	String screenshotpath = ScreenCapture.captureScreenshot(driver, "Test1");
		String image=test.addScreenCapture(screenshotpath);
    	
    	AppLogin loginpage = PageFactory.initElements(driver, AppLogin.class);
    	loginpage.verifyLogin(appreader.getUsername(), appreader.getPassword());
    	
    	
    	
    	
    	
    	
    	
    	
    	test.log(LogStatus.INFO, "verifyUsername"+"\t"+"verifyPassword");
    	test.log(LogStatus.INFO,image);
    	
    	
    	//Waiting methods
    	//Implicity wait //Explicity wait // fluent wait
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	
    	
    	
    	System.out.println("verify user name"+"\t"+"verify Password");
    	logger.info("verify user name"+"\t"+"verify Password");
    	
    	
    	
    	loginpage.clickButton();
    	test.log(LogStatus.INFO, "Clicking Button");
    	test.log(LogStatus.INFO, image);
    	
    	
    	System.out.println("Clicking Button");
    	logger.info("clicking button");
    	//Thread.sleep(3000);
    	
    	bfactory.closeBrowser();
    	test.log(LogStatus.INFO, "Closing Browser");
    	test.log(LogStatus.INFO, image);
    	
    	
    	System.out.println("closing Browser");
    	logger.info("Closing Browser");
    	test.log(LogStatus.INFO, image);
    	
    	
    	extentreport.flush();
    }
}
