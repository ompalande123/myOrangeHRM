package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* This class is manually created which will
 * create driver for particular browser and 
 * this we can use for all other classes so that we no need to create driver each time
 */



public class DriverFactory {

	
	private static WebDriver driver;
	
	//private constructor to prevent instantiation
	private DriverFactory() {}
	
	
	public static WebDriver getDriver()
	{
		if(driver==null)
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		return driver;
	}
	
	
	public static void quitDriver()
	{
		if(driver!=null)
		{
			driver.quit();
			driver=null;
		}
	}
	
	
	
}
