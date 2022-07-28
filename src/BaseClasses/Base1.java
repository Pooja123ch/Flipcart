package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\Batch Daily Updates\\Velocity Batch 2nd April\\Software and Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	
	

}
