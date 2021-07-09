package adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.property.File_Reader_Manager;

import adactin.baseclass.Base_class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//adactin//feature",
glue = "adactin//stepdefinition",
plugin={"pretty","com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html",
		"json:Report/CucumberJSON_Report.json"},monochrome=true)

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = File_Reader_Manager.getInsatnce().getInstanceCR().getBrowser();

		driver = Base_class.getBrowser(browser);
	}

//	@AfterClass
//	public static void teardown() {

//driver.quit();
	
}
