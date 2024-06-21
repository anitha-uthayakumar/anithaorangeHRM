package com.orange_hrmpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OrangeHRM_PagesClass {
	
	
	public OrangeHRM_PagesClass(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name = "username")
	WebElement username;
	
	
	@FindBy(name = "password")
	WebElement password;
	
	
	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement login;
	
	@FindBy(xpath = "//p[text()='Time at Work']")
	WebElement dashboard;
	
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminTab;
	
	@FindBy(xpath = "//h5[text()='System Users']")
	WebElement adminUserManagement;
	
	
	@FindBy(xpath = "//form/div/div/div/div/div/input")
	WebElement searchUsername;
	
	
	@FindBy(xpath = "//label[text()='User Role']//parent::div//following-sibling::div")
	WebElement dropdown;
	
	@FindBy(xpath = "//span[text()='Admin']//parent::div")
	WebElement userRole;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement employeeName;
	
	@FindBy(xpath = "//div[text()='-- Select --']")
	WebElement status;

	
	@FindBy(xpath = "//span[text()='Enabled']")
	WebElement enabled;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	WebElement search;
	
	@FindBy(xpath = "//span[text()='No Records Found']")
	WebElement notFound;
	
	
	
	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getdashboard() {
		return dashboard;
	}


	public WebElement getAdminTab() {
		return adminTab;
	}
	
	public WebElement getAdminUserManagement() {
		return adminUserManagement;
	}


	public WebElement getSearchUsername() {
		return searchUsername;
	}


	public WebElement getDropdown() {
		return dropdown;
	}


	public WebElement getuserRole() {
		return userRole;
	}


	public WebElement getEmployeeName() {
		return employeeName;
	}


	public WebElement getStatus() {
		return status;
	}
	
	public WebElement getEnabled() {
		return enabled;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getNotFound() {
		return notFound;
	}

	
	
	
	

	
	
	
	

}
