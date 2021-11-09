package TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PomClassses.HomePage;

public class Verify extends PojoPackage.BaseClass {
	
	private WebDriver driver;
	private HomePage homepage;

	
	
	@Parameters ("browser")
	@BeforeTest 
	public void launchbrowser(String browser)
	{
		if (browser.equalsIgnoreCase("chrome"))
			{
				driver = launchChromeV95();
				
			}
	}
	
	@BeforeClass
	public void beforeClass()
	{
		homepage = new HomePage(driver);
	}
	
	@BeforeMethod
	public void launchUrl()
	{	driver.get("www.facebook.com");
		System.out.println("hi");
	}
	
	@Test
	public void beforeTest()
	{
		System.out.println("hello");
	}
	
	

}
