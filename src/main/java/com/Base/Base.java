package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver chromebrowserlaunch() {
		WebDriverManager.chromedriver().setup();

	    ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");

	     WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		return driver;
	}
	public static WebDriver openedge() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options =new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new EdgeDriver(options);
		driver.manage().window().maximize();
		return driver;
	}
}
