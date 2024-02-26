package stepDefinition;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.*;

public class SearchDefinitions extends BaseClass{
	//sWebDriver driver = BaseClass.setupDriver();
	HomePage hp;
	CoursesPage cp;
	CourseDetailsPage cdp;
    
	@Given("user should be on courseera homepage")
	public void user_should_be_on_courseera_homepage() {
		
		takeScreenshot("HomePage");	
	    
	}

	@When("user search for {string} courses")
	public void user_search_for_courses(String string) {
		hp=new HomePage(driver);
		hp.submitSearch(string);
		takeScreenshot("SearchQuery");
		hp.clickSearchIcon();
	}
	
	
	@When("user select English language")
	public void user_select_english_language() {
		cp=new CoursesPage(driver);
		cp.selectLanguage();
		takeScreenshot("SelectLanguage");
	   
	}
	@When("user select beginners level")
	public void user_select_beginners_level() {
		cp.selectLevel();
		takeScreenshot("SelectLevel");  
	}

	@Then("user should click on top two courses")
	public void user_should_click_on_top_two_courses() {
		cp.selectCourse();
		
	}


}