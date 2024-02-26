package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {".\\src\\test\\resources\\FeatureFiles\\Main.feature"},
							
				//features={"@target/rerun.txt"},
				glue = "stepDefinition", 
				plugin = 	{ "pretty",
							"html:reports/myreport.html", "rerun:target/rerun.txt",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"rerun:target/rerun.txt"}, 
				dryRun = false, 
				monochrome = true, 
				publish = true)


public class TestRun{

}
