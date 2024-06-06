package com.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	@BeforeTest
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--remote-allow-origins=*");
	        
	     driver = new ChromeDriver(co);
	// driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void failedScreenshot(ITestResult result) throws IOException{
	if(ITestResult.FAILURE ==result.getStatus()) {
	ScreenShot.getScreenshot(driver);
	}
	else if(ITestResult.SUCCESS==result.getStatus()){
	ScreenShot.getScreenshot(driver);
	}
	}
	

	
}
