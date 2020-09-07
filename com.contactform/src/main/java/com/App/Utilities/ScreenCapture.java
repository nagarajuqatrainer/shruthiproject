package com.App.Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenCapture {
	
	
	
	
	  public  static String captureScreenshot(WebDriver driver,String screenname) throws Exception {
	 
		  try {
	  TakesScreenshot ss = (TakesScreenshot)driver;
	  File file = ss.getScreenshotAs(OutputType.FILE);
	  
	  String dest = "F:\\Soni_TestNG\\myTestNGProject\\screens"+screenname+".png";
	  File destination = new File(dest);
	  
		FileUtils.copyFile(file, destination);
		System.out.println("Screentshot taken");
		return dest;
	  } catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		return e.getMessage();
	  }
	
	  }

}
