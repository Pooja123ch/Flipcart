package UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util1 {
	
	//Explicit wait
	//Take screenshot
	//parameterization
	//javaScriptWxwcutor
	//Actions
	
	
	public static WebElement explicitWait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement newElement = wait.until(ExpectedConditions.visibilityOf(element));
		return newElement;
	}
	
	public static WebElement explicitWait(WebDriver driver, By xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement newElement = wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
		return newElement;
	}
	
	
	public static void getScreenshot(WebDriver driver, String tcName) throws IOException
	{
//		Date date = new Date();
//		SimpleDateFormat frmt = new SimpleDateFormat("hhmmss");
//		String time = frmt.format(date);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\\\Velocity\\\\Batch Daily Updates\\\\Velocity Batch 2nd April\\\\ScreenShots\\\\"+tcName+".jpg");
		FileHandler.copy(source, dest);
		
	}


}
