package adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;

import com.LoginPage.Search_Hotel_POM;

import adactin.baseclass.Base_class;
import adactin.runner.Runner;
import cucumber.api.java.en.*;

public class Search_Hotel_Stepdefinition extends Base_class {
	
	public static WebDriver driver = Runner.driver;
	
	Search_Hotel_POM sh = new Search_Hotel_POM(driver);

	@When("^User enter the location$")
	public void user_enter_the_location() throws Throwable {
	    dropDownElement(sh.getLocation(),"byValue", "London");
	}

	@When("^User enter the hotels$")
	public void user_enter_the_hotels() throws Throwable {
	  
		dropDownElement(sh.getHotels(),"byValue", "Hotel Sunshine");
	}

	@When("^User enter the room type$")
	public void user_enter_the_room_type() throws Throwable {
	    dropDownElement(sh.getRoomType(),"byValue", "Standard");
	}

	@When("^User enter the number of rooms$")
	public void user_enter_the_number_of_rooms() throws Throwable {
	   dropDownElement(sh.getRoomNos(),"byIndex", "3");
	}

    @When("^User enter the checkin date$")
	public void user_enter_the_checkin_date() throws Throwable {
		inputOfElement(sh.getDatePickin(), "29/06/2021");
	  
	}

	@When("^User enter the checkout date$")
	public void user_enter_the_checkout_date() throws Throwable {
	  inputOfElement(sh.getDatePickout(), "30/06/2021");
	}

	@When("^User enter the adults per room$")
	public void user_enter_the_adults_per_room() throws Throwable {
	   dropDownElement(sh.getAdultRoom(),"byIndex", "3");
	}

	@When("^User enter the children per room$")
	public void user_enter_the_children_per_room() throws Throwable {
	   dropDownElement(sh.getChildRoom(), "byIndex", "2");
	}

	@Then("^User clickon search button$")
	public void user_clickon_search_button() throws Throwable {
	  clickOnElement(sh.getSubmit());
	}


}
