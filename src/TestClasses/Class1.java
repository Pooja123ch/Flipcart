package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import BaseClasses.Base1;
import PomClasses.HomePage;
import PomClasses.LoginPage;


public class Class1 {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver = Base1.getDriver();
		
		VerifyUserCanLogin();
		
	}
	
	
	public static void VerifyUserCanLogin() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.enterEmail();
		lp.enterPassword();
		lp.clickLoginBtn();
		
		
		HomePage hp = new HomePage(driver);
		
		String pName = hp.getProfileName();
		
		System.out.println(pName);
		
		if(pName.equals("Akash"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test failed");
			HomePage.getScreenshot(driver, "VerifyUserCanLogin");
		}
	}

}
