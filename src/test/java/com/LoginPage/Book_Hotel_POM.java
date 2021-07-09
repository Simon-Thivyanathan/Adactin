package com.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_POM {
	
	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement FirstName;
	
	@FindBy(id = "last_name")
	private WebElement LastName;
	
	@FindBy(id = "address")
	private WebElement Address;
	
	@FindBy(id = "cc_num")
	private WebElement CreditcardNumber;
	
	@FindBy(id = "cc_type")
	private WebElement CreditcardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement Month;
	
	@FindBy (id = "cc_exp_year")
	private WebElement Year;
	
	@FindBy(id = "cc_cvv")
	private WebElement CvvNUmber;
	
	@FindBy(id = "book_now")
	private WebElement BookNow;

	

	public Book_Hotel_POM(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCreditcardNumber() {
		return CreditcardNumber;
	}

	public WebElement getCreditcardType() {
		return CreditcardType;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getCvvNUmber() {
		return CvvNUmber;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	
	
}
