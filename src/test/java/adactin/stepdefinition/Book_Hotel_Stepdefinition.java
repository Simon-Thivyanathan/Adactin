package adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.LoginPage.Book_Hotel_POM;

import adactin.baseclass.Base_class;
import adactin.runner.Runner;
import cucumber.api.java.en.*;

public class Book_Hotel_Stepdefinition extends Base_class {
	 
public static WebDriver driver = Runner.driver;

	Book_Hotel_POM bh = new Book_Hotel_POM(driver);

	
	@When("^user enters the fist name$")
	public void user_enters_the_fist_name() throws Throwable {
	   inputOfElement(bh.getFirstName(), "siana");
	}

	@When("^user enters the last name$")
	public void user_enters_the_last_name() throws Throwable {
	    inputOfElement(bh.getLastName(), "Thivyanathan");
	}

	@When("^user enters the billing address$")
	public void user_enters_the_billing_address() throws Throwable {
	   inputOfElement(bh.getAddress(), "47/40 puthumandapathur,Pallipalayam");
	}

	@When("^user enters the credit card no$")
	public void user_enters_the_credit_card_no() throws Throwable {
	   
		inputOfElement(bh.getCreditcardNumber(), "9688153574143456");
	}

	@When("^user enters the card type$")
	public void user_enters_the_card_type() throws Throwable {
	    dropDownElement(bh.getCreditcardType(), "byValue", "AMEX");
	}

	@When("^user enters the expiry month$")
	public void user_enters_the_expiry_month() throws Throwable {
	    dropDownElement(bh.getMonth(), "byValue", "10");
	}

	@When("^user enters the expiry year$")
	public void user_enters_the_expiry_year() throws Throwable {
	    
		dropDownElement(bh.getYear(), "byValue", "2017");
	}

	@When("^user enters the cvv number$")
	public void user_enters_the_cvv_number() throws Throwable {
	   
		inputOfElement(bh.getCvvNUmber(),"1234");
	}

	@Then("^user validate book now$")
	public void user_validate_book_now() throws Throwable {
	   
		clickOnElement(bh.getBookNow());
	}


}
