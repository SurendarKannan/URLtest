package org.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./FeatureFileFolder/login.feature",
		
		glue = "org.StepDefintion", 
		
		dryRun = false,
		
		plugin = {"pretty", "html:target/reports", "json:json-output/index.json"},
		
		monochrome = true
		
		
		
		)

public class Runner {

}
