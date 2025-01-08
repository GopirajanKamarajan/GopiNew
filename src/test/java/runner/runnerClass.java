package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\login.feature", 
		glue = {"stepDefinition"},
		plugin = {"pretty", "json:target/cucumber.json",
				"html:target/cucumber.html"}
		
		)
public class runnerClass {
	

}
