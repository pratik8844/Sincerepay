package com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot { 
		public static void takeFailedscreenshot(WebDriver driver) throws IOException {
		Date currentdate=new Date();
		String s=currentdate.toString().replace(":","");
		File a=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File b=new File("D:/Project1/Sincere_Pay/screenshots/"+s+".bmp");
		FileUtils.copyFile(a,b);
		}
		
	}
