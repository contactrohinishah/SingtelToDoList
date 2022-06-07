package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\WS\\ToDoList\\FeatureFiles", 
		glue = { "first.stepdef"}, 
		tags = { "@Verifynumber,@ClearCompletedButton" }, 
		dryRun = false, 
		plugin = { "pretty", "html:target/site/cucumber-pretty",
				"json:target/cucumber/cucumber.json" })

public class Runner {
}
