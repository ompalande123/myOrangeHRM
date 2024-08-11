package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	private WebDriver driver;
	private LoginPage loginPage;
	
	@Given("I navigate to login page")
	public void I_navigate_to_login_page() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage=new LoginPage(driver);
		Thread.sleep(10000);
		
	}
	
	@When("I enter username {string}")
	public void I_enter_username(String uname) throws InterruptedException
	{
		
		loginPage.enterUsername(uname);
		Thread.sleep(5000);
	}
	
	@And("And I enter password {string}")
	public void I_enter_password(String pswd) throws InterruptedException
	{
		
		loginPage.enterPassword(pswd);
		Thread.sleep(5000);
	}
	
	@And("I click on Submit button")
	public void I_click_on_Submit_button()
	{
		loginPage.btnSubmit();
	}
	
	@Then("I should be logged in successfully")
	public void I_should_be_logged_in_successfully()
	{
		System.out.println("Login successful");
		driver.quit();
		
	}
	
	
}
