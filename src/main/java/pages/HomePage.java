package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	
	//Constructor
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Locators
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement txtSearch;
	
	
	//Action methods
	public void enterSearchText(String search)
	{
		txtSearch.sendKeys(search);
	}
	
}
