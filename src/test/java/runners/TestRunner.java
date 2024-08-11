package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/resources/features",
		glue="stepDefinitions"
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
