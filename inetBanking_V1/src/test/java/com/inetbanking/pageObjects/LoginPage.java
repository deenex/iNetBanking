package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	
	@FindBy(name="uid")
	WebElement userID;
	
	@FindBy(name="password")
	WebElement uPass;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;

	public void setUserName(String uname) {
		userID.sendKeys(uname);
	}
	
	
	public void setPassword(String pwd) {
		uPass.sendKeys(pwd);
	}
	
	public void clickSubmit () {
		loginBtn.click();;
	}
	
}
