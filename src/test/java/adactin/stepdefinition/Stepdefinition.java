package adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.LoginPage.LoginPage;
import com.adactin.property.File_Reader_Manager;
import com.adactin.property.Page_Object_Manager;

import adactin.baseclass.Base_class;
import adactin.runner.Runner;
import cucumber.api.java.en.*;

public class Stepdefinition extends Base_class {

	public static WebDriver driver = Runner.driver;

	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^User launch url of adactin application$")
	public void user_launch_url_of_adactin_application() throws Throwable {
		String url = File_Reader_Manager.getInsatnce().getInstanceCR().getUrl();
		url(url);
	}

	@When("^User enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {

		inputOfElement(pom.getInstanceLogin().getUsername(), arg1);
	}

	@When("^User enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {

		inputOfElement(pom.getInstanceLogin().getPassword(), arg1);
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {

		clickOnElement(pom.getInstanceLogin().getLogin_btn());
	}

	@Then("^User validate login button$")
	public void user_validate_login_button() throws Throwable {

	}

}
