package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
