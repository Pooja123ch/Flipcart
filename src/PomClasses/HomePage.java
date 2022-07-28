package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.Util1;

public class HomePage extends Util1{
	
	
	WebDriver driver;
	
	
	@FindBy(xpath="//div[text()='Akshay']")
	private WebElement profileName;
	
	

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public String getProfileName() throws InterruptedException
	{
		Thread.sleep(1000);
		String pName = profileName.getText();
		return pName;
	}

}
