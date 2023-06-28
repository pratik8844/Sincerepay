package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchmodule {
	WebDriver driver;
	   
	   @FindBy(xpath="(//li[@class='nav-item'])[2]")
	   private WebElement Searchmodule;
	   
	   @FindBy(xpath="//input[@class='MuiInputBase-input-442 MuiOutlinedInput-input-429']")
       private WebElement consumernum;	
	   
	   @FindBy(xpath="(//button[@class='MuiButtonBase-root-87 MuiIconButton-root-79'])[1]")
	   private WebElement fromdate;
	   
	   @FindBy(xpath="(//span[@class='MuiIconButton-label-86'])[9]")
	   private WebElement back;
	   
	   @FindBy(xpath="(//span[@class='MuiButton-label-495'])[6]")
	   private WebElement date1;
	   
	   @FindBy(xpath="(//button[@class='MuiButtonBase-root-87 MuiIconButton-root-79'])[2]")
	   private WebElement todate;
	   
	   @FindBy(xpath="(//span[@class='MuiButton-label-495'])[6]")
	   private WebElement okbutton;
	   
	   @FindBy(xpath="//span[@class='MuiButton-label-495']")
	   private WebElement searchbuttn;
	   
	   
	   public Searchmodule(WebDriver driver) {
			PageFactory.initElements(driver, this);
	   }
	   public void Search() {
		   Searchmodule.click();
		}
	   public void num() {
		   consumernum.sendKeys("8983537692");
	   }
	   public void selectdate() {
		   fromdate.click();
	   }
	   public void pressback() {
		   back.click();
	   }
	   public void date1select() {
		   date1.click();
	   }
	   public void toselect() {
		   todate.click();
	   }
	   public void clickok() {
		   okbutton.click();
	   }
	   public void selectsearch() {
		   searchbuttn.click();
	   }

}
