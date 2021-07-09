package adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.LoginPage.Select_Hotel_POM;

import adactin.baseclass.Base_class;
import adactin.runner.Runner;
import cucumber.api.java.en.*;

public class Select_Hotel_Stepdefinition extends Base_class{
	public static WebDriver driver = Runner.driver;
	
	Select_Hotel_POM sl = new Select_Hotel_POM(driver);
	
	
	@When("^Select radio button$")
	public void select_radio_button() throws Throwable {
	    
		clickOnElement(sl.getRadionButton());
	}

	@Then("^Click continue$")
	public void click_continue() throws Throwable {
	    
		clickOnElement(sl.getContinue());
	}


}
