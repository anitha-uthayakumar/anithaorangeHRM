package com.orange_hrmpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_BaseClass {
	
	public WebDriver driver;
	
	
	
	@BeforeSuite
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void browserClose() {
		driver.close();
	}
	
	
	
	

}
