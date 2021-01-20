package com.qa.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.qa.pages.locators.ContactsPageLocators;
import com.qa.util.TestBase;

public class ContactsPage extends TestBase{

public ContactsPageLocators contactsPage;
	
	ContactsPage(){
		this.contactsPage=new ContactsPageLocators();
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.contactsPage);
	}
	
	public void clickOnNewContactsLink() {
		contactsPage.newContactsLink.click();
	}
}
