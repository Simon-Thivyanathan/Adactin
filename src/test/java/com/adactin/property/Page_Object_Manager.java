package com.adactin.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.LoginPage.LoginPage;

public class Page_Object_Manager {

	public static WebDriver driver; 
	
	private LoginPage Login;

	public Page_Object_Manager(WebDriver Ldriver) {
		this.driver = Ldriver;
		PageFactory.initElements(Ldriver, this);
	}

 public LoginPage getInstanceLogin() {
	Login = new LoginPage(driver);
	return Login;

}

}
