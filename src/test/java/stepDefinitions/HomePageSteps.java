package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pages.HomePage;
import utilities.DriverFactory;

public class HomePageSteps {
	
	private HomePage homepage;
	WebDriver driver;
	
	public HomePageSteps()
	{
		this.driver=DriverFactory.getDriver();
		homepage=new HomePage(DriverFactory.getDriver());
	}
	
	
	@And("I click on search button and enter {string}")
	public void I_click_on_search_button_and_enter(String searchText) throws InterruptedException
	{
		Thread.sleep(5000);
		homepage.enterSearchText(searchText);
		Thread.sleep(5000);
	}
	

}
