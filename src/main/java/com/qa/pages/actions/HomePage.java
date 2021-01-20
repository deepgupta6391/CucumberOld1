package com.qa.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qa.pages.locators.HomePageLocators;
import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	public HomePageLocators homePage;
	
	public HomePage(){
		this.homePage=new HomePageLocators();
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.homePage);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName() {
		return homePage.usernameLabel.isDisplayed();
	}
	
	public void clickOnContactLink() {
		homePage.contactsLink.click();
	}
}
