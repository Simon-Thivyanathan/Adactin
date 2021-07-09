package com.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_POM {
	
	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement Location;
	
	@FindBy(id = "hotels")
	private WebElement Hotels;
	
	@FindBy(id = "room_type")
	private WebElement RoomType;
	
	@FindBy(id = "room_nos")
	private WebElement RoomNos;
	
	@FindBy(id = "datepick_in")
	private WebElement DatePickin;
	
	@FindBy(id = "datepick_out")
	private WebElement DatePickout;
	
	@FindBy(id = "adult_room")
	private WebElement AdultRoom;
	
	@FindBy(id = "child_room")
	private WebElement ChildRoom;
	
	@FindBy(id = "Submit")
	private WebElement Submit;


	public Search_Hotel_POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNos() {
		return RoomNos;
	}

	public WebElement getDatePickin() {
		return DatePickin;
	}

	public WebElement getDatePickout() {
		return DatePickout;
	}

	public WebElement getAdultRoom() {
		return AdultRoom;
	}

	public WebElement getChildRoom() {
		return ChildRoom;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	

	
	
}
