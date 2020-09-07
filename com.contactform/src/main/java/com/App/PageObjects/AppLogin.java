package com.App.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppLogin {

	
public WebDriver driver;
	
	@FindBy(xpath="//*[@name='user']") WebElement username;
	@FindBy(name="pass") WebElement password;
	@FindBy(name="btnSubmit")WebElement button;
	
	
	public AppLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void verifyLogin(String un,String pw) {
		
		if(username.isEnabled()) {
			username.sendKeys(un);
			
		}
		
		if(password.isEnabled()) {
			password.sendKeys(pw);
		}
		
	
	}
	
	public void clickButton() {
		button.click();
	}
	
	
	
}
