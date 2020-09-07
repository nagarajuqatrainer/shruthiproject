package com.App.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppLogin {

	
public WebDriver driver;
	
	@FindBy(xpath="//*[@name='user']") WebElement username;
	@FindBy(name="pass") WebElement password;
	@FindBy(name="btnSubmit")WebElement button;
	
	
	WebDriverWait wait = new WebDriverWait(driver,10);
	
	public AppLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void verifyLogin(String un,String pw) {
		
		if(username.isEnabled()) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='user']")));
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
