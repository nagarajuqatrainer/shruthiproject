package com.App.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	

	public static WebDriver getBrowser(String browserType,String AppUrl) {
		
		ConfigReader config = new ConfigReader();
		
		
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", config.getChromepath());
			driver=new ChromeDriver();
		}
		
		else if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./myDrivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEdriver.exe");
			driver=new InternetExplorerDriver();
		}
		
		
		
		driver.get(AppUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		return driver;
		
	}
	

	public void closeBrowser() {
		driver.quit();
	}
	
	
}
