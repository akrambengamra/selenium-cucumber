package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class LoginPage {
	
	/*
	 * Retrieve Elements
	 */
	
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;
	
	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Products')]")
	public static WebElement title;
	
	public LoginPage() {
		
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	/*
	 * Methods
	 */
	
	public void fillUsername(String userName) {
		username.clear();
		username.sendKeys(userName);
	}
	
	public void fillPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		btnLogin.click();	
		}

}
