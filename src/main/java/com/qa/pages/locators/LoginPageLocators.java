package com.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

	@FindBy(xpath="//input[@placeholder='E-mail address']")
	public WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	public WebElement loginBtn;

	@FindBy(xpath="//div[@class='header item']")
	public WebElement crmLogo;
}
