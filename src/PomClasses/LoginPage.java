package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.Util1;

public class LoginPage extends Util1{
	
	
	WebDriver driver;
	
	
	//WebElements	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginBtn;
	
	
	//constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	//public methods
	public void enterEmail()
	{
		emailField.sendKeys("akshaynarhare1541@gmail.com");
	}
	
	
	public void enterPassword()
	{
		passwordField.sendKeys("Akshay123");
	}
	
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}

}
