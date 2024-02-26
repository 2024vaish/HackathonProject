package stepDefinition;

import java.util.List;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.*;
import utilities.ExcelUtils;


public class languageSteps extends BaseClass {
	List<String> arr;
	List<String> arr2;
	
		@Given("user should be on homepage")
		public void user_should_be_on_homepage() {
			hp=new HomePage(driver);
			hp.clickNav1();
		}

		@When("User look for {string}")
		public void user_look_for(String string) {
			hp.submitSearch(string);
			hp.clickSearchIcon();  
		}

		@When("user extract all languages")
		public void user_extract_all_languages() {
			cp=new CoursesPage(driver);
			arr=cp.getAllLanguage();
			ExcelUtils.setCellData("courseDetails", "languages",arr);
			
		}

		@When("user extract all levels")
		public void user_extract_all_levels() {	
			arr2 = cp.getAllLevels(); 
			ExcelUtils.setCellData("courseDetails", "levels",arr2);
		}

		@Then("user display langauge and level information")
		public void user_display_langauge_and_level_information() {
			
			System.out.println("\n*********************All available languages*********************");
			for(String s:arr) {
				System.out.println(s.substring(0, s.indexOf(" ")));
			}
			
			System.out.println("\n*********************All available levels*********************");
			for(String s:arr2) {
				System.out.println(s.substring(0, s.indexOf(" ")));
			}
		   
		}

}