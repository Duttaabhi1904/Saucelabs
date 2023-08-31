package com.sauce.stepdefenition;

import org.testng.Assert;

import com.sauce.base.BaseFunction;
import com.sauce.data.GetCredentials;
import com.sauce.elements.SwagElements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseFunction {

	GetCredentials cr;
	SwagElements sc;

	@Given("Launch the browser")
	public void launchTheBrowser() {
		browserLaunch("Edge");
		cr = new GetCredentials();
		sc = new SwagElements(driver);
	}

	@When("Enter the URL")
	public void enterTheURL() {
		urlGo(cr.getUrl());

	}

	@When("Enter the invalid username")
	public void enterTheInvalidUsername() {
		sendKeyss(sc.getUser(), cr.getInvalidUser());

	}

	@When("Enter the invalid password")
	public void enterTheInvalidPassword() {
		sendKeyss(sc.getPass(), cr.getInvalidPass());

	}

	@When("Click login")
	public void clickLogin() {
		clicks(sc.getLogin());

	}

	@Then("Validate wheather the login failed")
	public void validateWheatherTheLoginFailed() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, cr.getUrl());

	}

	@Given("Launch browser")
	public void launchBrowser() {
		browserLaunch("Edge");
		cr = new GetCredentials();
		sc = new SwagElements(driver);

	}

	@When("Enter URL")
	public void enterURL() {
		urlGo(cr.getUrl());
	}

	@When("Enter the username")
	public void enterTheUsername() {
		sendKeyss(sc.getUser(), cr.getValidUser());
	}

	@When("Enter the password")
	public void enterThePassword() {
		sendKeyss(sc.getPass(), cr.getValidPass());
	}

	@When("Click login btn")
	public void clickLoginbtn() {
		clicks(sc.getLogin());
	}

	@Then("Validate wheather the login passed")
	public void validateWheatherTheLoginPassed() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertNotEquals(currentUrl, cr.getUrl());
	}

}
