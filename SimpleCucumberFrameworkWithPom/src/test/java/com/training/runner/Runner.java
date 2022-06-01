package com.training.runner;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

//import com.firebase.utility.GenerateReports;

//import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports/cucumber.html",
							"json:target/cucumber-reports/cucumber.json" }, 
				 features = {"src/test/resources/com/training/features/FireBaseApp.feature" }, 
				 glue = { "com.training.steps" })

public class Runner extends AbstractTestNGCucumberTests {
	
}
