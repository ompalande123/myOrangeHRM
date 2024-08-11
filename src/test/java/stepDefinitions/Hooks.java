package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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
