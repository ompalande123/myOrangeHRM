package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/* This is page class where we can store all the WebElements from that page
 * This page class consists of 3 parts
 * 1. constructor - this will have driver and PageFactory class to achieve Page objects mapping easier
 * 2. locators - we can locate locators from respective page using @FindBy annotation (This is part of PageFactory)
 * 3. Action methods - These methods will define what action to be take on these WebElements
 */


public class LoginPage {
	
	private WebDriver driver;
	
	//Constructor
	
	  public LoginPage(WebDriver driver) { 
		  this.driver=driver;
	  PageFactory.initElements(driver, this); 
	  }
	 
	

	
	
	
	//locators
	@FindBy(xpath="//input[@name='username']")
	private WebElement txtUsername; 
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement txtPassword; 
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnSubmit; 
	
	
	//Action methods
	public void enterUsername(String username)
	{
		txtUsername.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void btnSubmit()
	{
		btnSubmit.click();
	}
	

}
