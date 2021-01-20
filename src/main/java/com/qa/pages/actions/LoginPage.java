package com.qa.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qa.pages.locators.LoginPageLocators;
import com.qa.util.TestBase;


public class LoginPage extends TestBase{

	
	public LoginPageLocators loginPage;
	
	public LoginPage() {
		this.loginPage=new LoginPageLocators();
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.loginPage);
	}
	
	public boolean validateCRMImage() {
		return loginPage.crmLogo.isDisplayed();
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage doLogin(String username,String password) {
		loginPage.username.sendKeys(username);
		loginPage.password.sendKeys(password);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginPage.loginBtn);
		return new HomePage();
	}
	
	
}
