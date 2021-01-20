package com.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath="//span[@class='user-display']")
	public WebElement usernameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	public WebElement contactsLink;
	
	
}
