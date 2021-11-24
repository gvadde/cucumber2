package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/java/features",
		dryRun = true,
		glue="stepdefinition",
		plugin = {"pretty", "html:Reports/HTML Report", "json:Reports/JSON Report.json", "junit: Reports/Junit Report.xml"}
		)
public class MyRunner {

}
