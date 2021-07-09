package com.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_POM {

	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement RadionButton;
	
	@FindBy(id = "continue")
	private WebElement Continue;

	public Select_Hotel_POM(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadionButton() {
		return RadionButton;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
	
}
