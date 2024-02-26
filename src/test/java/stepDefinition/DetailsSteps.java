package stepDefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.*;
import pageObjects.CourseDetailsPage;
import pageObjects.CoursesPage;
import pageObjects.HomePage;
import utilities.ExcelUtils;

public class DetailsSteps extends BaseClass {
	String courseName;
	String courseRating;
	String courseDuration;
	ExcelUtils eu=new ExcelUtils();
	
	List<String> courseOne=new ArrayList<>();
	List<String> courseTwo=new ArrayList<>();
	

	@Given("user should be on first course page")
	public void user_should_be_on_first_course_page() {
		cdp=new CourseDetailsPage(driver);
		cdp.switchToWindow(1);
	}

	@When("user capture the first course details")
	public void user_capture_the_first_course_details() {
		courseName=cdp.getCourseName();
		courseRating=cdp.getCourseRatings();
		courseDuration=cdp.getCourseDuration();
		courseOne.add(courseName);
		courseOne.add(courseRating);
		courseOne.add(courseDuration);
		try {
			ExcelUtils.setCellData("courseDetails","courses", 1, courseOne);
		} catch (IOException e) {}
		takeScreenshot("Course1");
	}

	@Then("display the first course details")
	public void display_the_first_course_details() {
		System.out.println("\n*******************Printing First Course Details*******************");
		System.out.println("Course Name:- "+courseName);
		System.out.println("Course Ratings:- "+courseRating);
		System.out.println("Course Duration:- "+courseDuration);	
		 
	}

	@Given("user should be on second course page")
	public void user_should_be_on_second_course_page() {
		cdp.switchToWindow(2);
	    
	}

	@When("user capture the second course details")
	public void user_capture_the_second_course_details() {
		courseName=cdp.getCourseName();
		courseRating=cdp.getCourseRatings();
		courseDuration=cdp.getCourseDuration();
		courseTwo.add(courseName);
		courseTwo.add(courseRating);
		courseTwo.add(courseDuration);
		takeScreenshot("Course2");
	}

	@Then("display the second course details")
	public void display_the_secind_course_details() {
		System.out.println("\n*******************Printing Second Course Details*******************");
		System.out.println("Course Name:- "+courseName);
		System.out.println("Course Ratings:- "+courseRating);
		System.out.println("Course Duration:- "+courseDuration);	
		try {
			ExcelUtils.setCellData("courseDetails","courses", 2, courseTwo);
		} catch (IOException e) {}
			
		
	}

}
