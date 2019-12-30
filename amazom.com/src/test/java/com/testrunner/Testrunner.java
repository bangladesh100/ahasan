package com.testrunner;

import java.io.File;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import gherkin.formatter.Reporter;

//RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features"},
		glue= {"com.steps"},
		monochrome=true
		//tags= {"@Contract sales",}
		)
    
   public class Testrunner extends AbstractTestNGCucumberTests {
	
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
    }
	
	
}
