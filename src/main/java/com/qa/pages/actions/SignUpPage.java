package com.qa.pages.actions;

import org.openqa.selenium.By;

public class SignUpPage {
	
	By name=By.name("name");
	By submit=By.name("submit");

	public SignUpPage() {
		System.out.println("this is signup page class");
	}
}
