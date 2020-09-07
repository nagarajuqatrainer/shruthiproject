package com.App.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;




public class ConfigReader {
	
	public Properties prop;
	
	
	public ConfigReader() {
		
		
		
		try {
			//Calling the file
			File file = new File("./myfiles/login.properties");
			//Read data from file
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			
		}catch(Exception ex) {
			System.out.println("Exception is"+ex.getMessage());
		}
		
		
		
	}
	
	
	
	public String getChromepath() {
		return prop.getProperty("chromedriver");
		
	}
	
	public String getBrowsername() {
		return prop.getProperty("browsername");
	}
	
	
	
	public String getAppurl() {
		return prop.getProperty("appurl");
		
	}
	
	public String getUsername() {
		return prop.getProperty("username");
	}
	
	
	public String getPassword() {
		return prop.getProperty("password");
	}
	
	
	
	
	
	
	
	

}
