package adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browser)
	{
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();
			}
			
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.driver",
						System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
				driver = new FirefoxDriver();
			}
			
			else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + ("\\Driver\\msedgedriver.exe"));
				driver = new EdgeDriver();
				}
			else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void url(String value) {
		driver.get(value);

	}
	public static void inputOfElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void clearOnElement(WebElement element) {
		element.clear();
	}
	
	public static void dropDownElement(WebElement element, String Options, String value) {
		Select s = new Select(element);
		{
			try {
				if (Options.equalsIgnoreCase("byIndex")) {
					int parseInt = Integer.parseInt(value);
					s.selectByIndex(parseInt);
				}
				else if (Options.equalsIgnoreCase("byValue")) {
					s.selectByValue(value);
					}
				else if (Options.equalsIgnoreCase("byVisibleText")) {
					s.selectByVisibleText(value);
				}
				else {
					System.out.println("Invalid Selection");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}

	

	

}




	


