package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/* This is test runner file class created manually
 * This is used to run cucumber feature file
 */


@CucumberOptions(
		features="src/resources/features",
		glue="stepDefinitions"
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
