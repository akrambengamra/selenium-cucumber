package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinitions {
	
	public LoginPage loginPage;
	private ConfigFileReader configFileReader;
	public LoginStepDefinitions(){
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
	}

	@Given("Je me connecte a l application Swag Labs")
	public void jeMeConnecteALApplicationSwagLabs() {
	 Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}
	@When("Je saisis le username {string}")
	public void jeSaisisLeUsername(String userName) {
		loginPage.fillUsername(configFileReader.getProperties("home.login"));
	}
	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String pwd) {
	    loginPage.fillPassword(configFileReader.getProperties("home.password"));
	}
	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
	   loginPage.clickOnLogin();
	}
	@Then("Je me redidirige vers la page home {string}")
	public void jeMeRedidirigeVersLaPageHome(String title) {
		
		String title_page = loginPage.title.getText();
		Assert.assertEquals(title_page, title);
	    
	}




}
