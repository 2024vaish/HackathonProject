package stepDefinition;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.Form;
import pageObjects.HomePage;

public class formSteps extends BaseClass{
	
	HomePage hp;
	public Form f=new Form(driver);
	@Given("user should be on For Enterprise page")
	public void user_should_be_on_for_enterprise_page() {
		
		hp=new HomePage(driver);
		hp.clickNav2();
		takeScreenshot("EnterPrisePage");
	   
	}

	@When("user clicks on solution dropdown")
	public void user_clicks_on_solution_dropdown() {
		
		hp.clickSolutions();
		takeScreenshot("Solutions Option");
	}

	@When("user click on For Campus option")
	public void user_click_on_for_campus_option() {
		hp.clickForCampus();
		takeScreenshot("ForCampusPage");
	   
	}

	@Given("user should scroll down to the form")
	public void user_should_scroll_down_to_the_form() {
		hp=new HomePage(driver);
		hp.clickNav3();
		f.scrolltoForm();
		takeScreenshot("form");
	   
	}

	@When("user fills the form with {string},{string},{string},{string},{string},{string},{string}")
	public void user_fills_the_form(String fname,String lname,String email,String phone,String iname,String needs,String status) {
		f.setFirstName(fname);
		f.setLastName(lname);
		f.setEmail(email);
		f.setPhone(phone);
		f.setInstType();
		f.setInstName(iname);
		takeScreenshot(status+"FormData1");
		f.setJobRole();
		f.setDepartment();
		f.setDescription();
		f.setNeeds(needs);
		f.setLearners();
		f.setCountry();
		f.setState();
		f.clickChkBox();
		takeScreenshot(status+"FormData2");
		
	}

	@When("user submits the form")
	public void user_submits_the_form() {
		f.clickSubmit();  
	}

	@Then("user captures {string} message")
	public void user_captures_the_message(String str) {
		System.out.print("\n*********************Message after submiting "+str+" data*********************\n");
		String s=f.getMsg();
		takeScreenshot(str+"Message");
		System.out.print(s);
		
	    
	}
	
	@Then("user should close the browser")
	public void user_should_close_the_browser() {
		//driver.quit();
	}
	
	
	

}
