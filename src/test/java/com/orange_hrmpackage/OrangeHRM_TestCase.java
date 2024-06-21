package com.orange_hrmpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class OrangeHRM_TestCase extends OrangeHRM_BaseClass {

	public OrangeHRM_PagesClass pgc;
	// public static WebDriver driver;

	@Test
	public void loginOrangeHRM() throws InterruptedException {

		pgc = new OrangeHRM_PagesClass(driver);

		// To launch the Browser
		
		// When enters the username
		WebElement username = pgc.getUsername();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		username.sendKeys("Admin");

		
		// When enters the password
		WebElement password = pgc.getPassword();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		password.sendKeys("admin123");

		// When click the login button
		WebElement login = pgc.getLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		login.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String text = pgc.getdashboard().getText();

		System.out.println(text);

		Assert.assertEquals(text,"Time at Work");

		// When click the Admin tab in Dashboard
		WebElement adminTab = pgc.getAdminTab();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		adminTab.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String text1 = pgc.getAdminUserManagement().getText();

		System.out.println(text1);

		Assert.assertEquals(text1,"System Users");


		// When search the user name
		WebElement searchUsername = pgc.getSearchUsername();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		searchUsername.sendKeys("Admin");

		// When select dropdown to get the role
		WebElement dropdown = pgc.getDropdown();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		dropdown.click();

		// When select user role as Admin
		WebElement getuserRole = pgc.getuserRole();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		getuserRole.click();

		// When enters the employee name to search
		WebElement employeeName = pgc.getEmployeeName();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		employeeName.sendKeys("Admin");

		// When select status as Enabled
		WebElement status = pgc.getStatus();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		status.click();

		WebElement enabled = pgc.getEnabled();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		enabled.click();

		// When click search
		WebElement search2 = pgc.getSearch();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		search2.click();

	}

}
