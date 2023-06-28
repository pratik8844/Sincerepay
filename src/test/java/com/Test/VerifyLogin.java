package com.Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Pom.Gamemodule;
import com.Pom.Login;
import com.Pom.Searchmodule;
import com.Utility.screenshot;


public class VerifyLogin extends Base{
	WebDriver driver;
	@BeforeTest
	@Parameters({"Browser"})
	  public void openbrowser(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
		driver= chromebrowserlaunch();
		driver.get("https://sincerepay.co.in/Login");
		}else if(Browser.equalsIgnoreCase("edge")) {
			driver=Base.openedge();
			driver.get("https://sincerepay.co.in/Login");
		}
	}
	@BeforeMethod
	public void Verifylogin() throws EncryptedDocumentException, IOException {
		Login ab =new Login (driver);
		String username=com.Utility.ExcelSheet.getDatafromExcel(4, 3);
    	ab.clickonusername(username);
    	String pass=com.Utility.ExcelSheet.getDatafromExcel(6, 3);
    	ab.pass(pass);		
    	ab.loginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
     @Test(priority=1)
	public void Gamemodule() throws InterruptedException {
		Gamemodule abc =new Gamemodule(driver);
		abc.GameModule();
		abc.operator();
	    abc.gplay();
		abc.number();
		abc.Amt();
		abc.enterpin();
		abc.Rechargebutton();
		abc.yesbutton();
		Thread.sleep(2000);
		abc.Rechargebut();
		abc.nobutton();
		abc.resetbutton();
		driver.navigate().back();
	}
	    @Test(priority=0)
	    public void Search() {
	    Searchmodule xyz=new Searchmodule(driver);
        xyz.Search();
        xyz.num();
        xyz.selectdate();
        xyz.pressback();
        xyz.date1select();
        xyz.toselect();
        xyz.clickok();
        xyz.selectsearch();
        driver.navigate().back();
	    }
	    @AfterMethod
	    public void verifysignout(ITestResult result) throws IOException, InterruptedException {
	    	if(ITestResult.SUCCESS==result.getStatus()) {
	    		screenshot.takeFailedscreenshot(driver);
	    	}else {
	    	if(ITestResult.FAILURE==result.getStatus()) {
	    	System.out.println("failscreenshot");
	    	}
	    	}
	    	}
}
	    	
	    
    
	
	
	
