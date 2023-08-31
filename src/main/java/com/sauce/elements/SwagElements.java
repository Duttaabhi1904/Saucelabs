package com.sauce.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagElements {

	@FindBy(id = "user-name")
	private WebElement user;
	@FindBy(name = "password")
	private WebElement pass;
	@FindBy(css = "input.submit-button.btn_action")
	private WebElement login;
	
	
	public SwagElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}




}
