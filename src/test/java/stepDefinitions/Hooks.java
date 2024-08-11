package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;

/* This class is manually created to handle before and after steps
 * using @Before annotation we can setup driver and other things
 * using @After annotation we can write tearDown processes
 * These annotations are cucumber annotation , not testNG annotations
 */


public class Hooks {
	
	@Before
	public void setup()
	{
		DriverFactory.getDriver();
		System.out.println("Driver loaded successfully...");
	
	}
	
	
	@After
	public void tearDown()
	{
		DriverFactory.quitDriver();
		System.out.println("Driver quit successfully");
	}
	
	
	
}
