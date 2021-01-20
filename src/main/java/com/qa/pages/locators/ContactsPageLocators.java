package com.qa.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPageLocators {

	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	public WebElement contactsPageTitle;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	public WebElement newContactsLink;
}
