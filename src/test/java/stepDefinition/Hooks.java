package stepDefinition;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
	
	public static WebDriver driver;
	@BeforeAll
	public static void setup() {
		
		driver=BaseClass.setupDriver();
		driver.get("https://www.coursera.org");
	}
	
	@AfterAll
	public static void tearDown() {
		driver.quit();
	}
}
