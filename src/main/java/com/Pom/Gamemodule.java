package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gamemodule {
	WebDriver driver;
   @FindBy(xpath="(//div[@class='MuiButtonBase-root-87 MuiIconButton-root-79 dashmenu MuiIconButton-colorPrimary-83'])[26]")
	private WebElement Game1;
   
   @FindBy(xpath="//div[@class='MuiSelect-root-6932 MuiSelect-select-6933 MuiSelect-selectMenu-6936 MuiSelect-outlined-6935 MuiInputBase-input-442 MuiOutlinedInput-input-429']")
   private WebElement select;
   
   @FindBy(xpath="(//li[@class='MuiButtonBase-root-87 MuiListItem-root-1293 MuiMenuItem-root-1290 MuiMenuItem-gutters-1291 MuiListItem-gutters-1298 MuiListItem-button-1299'])[13]")
   private WebElement googleplay;
   
   @FindBy(xpath="//input[@class='MuiInputBase-input-442 MuiOutlinedInput-input-429'][1]")
   private WebElement consumer;
   
   @FindBy(xpath="//input[@name='Amount']")
   private WebElement Amount;
   
   @FindBy(xpath="(//input[@class='MuiInputBase-input-442 MuiOutlinedInput-input-429'])[3]")
   private WebElement pin;
   
   @FindBy(xpath="//button[@class='MuiButtonBase-root-87 MuiButton-root-494 MuiButton-contained-502 MuiButton-containedPrimary-503 MuiButton-containedSizeLarge-512 MuiButton-sizeLarge-514']")
   private WebElement Recharge;
   
   @FindBy(xpath="(//span[@class='MuiButton-label-495'])[4]")
   private WebElement transcation;
   
   @FindBy(xpath="(//span[@class='MuiButton-label-495'])[3]")
   private WebElement notranscation;
   
   @FindBy(xpath="(//span[@class='MuiButton-label-495'])[1]")
   private WebElement reset;
   
	public Gamemodule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void GameModule() {
		Game1.click();
	}
	public void operator() {
		select.click();
	}
	public void gplay() {
		googleplay.click();
	}
	public void number() {
		consumer.sendKeys("8983537692");
	}
	public void Amt() {
		Amount.sendKeys("500");
	}
	public void enterpin() {
		pin.sendKeys("416001");
	}
	public void Rechargebutton() {
		Recharge.click();
	}
	public void yesbutton() {
		transcation.click();
	}
	public void Rechargebut() {
		Recharge.click();
	}
	public void nobutton() {
		notranscation.click();
	}
	public void resetbutton() {
		reset.click();
	}

}
