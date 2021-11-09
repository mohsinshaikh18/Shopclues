package PojoPackage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver launchChromeV95()
	{
		System.setProperty("wewbdriver.chrome.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"Browser drivers"+File.separator+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver launchmozillaV91()
	{
		System.setProperty("wewbdriver.chrome.driver", "src/test/resources/Browser drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
