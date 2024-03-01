//This class will run as TESTNG SUITE

package testRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {".\\src\\test\\resources\\FeatureFiles\\f001_Smoke.feature",".\\src\\test\\resources\\FeatureFiles\\f002_Main.feature",".\\src\\test\\resources\\FeatureFiles\\f003_Regression.feature"},
							
				//features={"@target/rerun.txt"},
				glue = "stepDefinition", 
				plugin = 	{ "pretty",
							"html:reports/myreport.html", "rerun:target/rerun.txt",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"rerun:target/rerun.txt"}, 
				dryRun = false, 
				monochrome = true, 
				publish = true)


public class TestRun2 extends AbstractTestNGCucumberTests{

}
