package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='UserName']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='Password']")
	private WebElement password;
	
	@FindBy(xpath="//span[@class='MuiButton-label-271'][1]")
	private WebElement loginButton;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickonusername(String user) {
		username.sendKeys(user);
	}
	public void pass(String pass) {
		password.sendKeys(pass);
	}
	public void loginButton() {
		loginButton.click();
	}

}
