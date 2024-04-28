package com.lib.GenericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	public static  WebDriver driver;
	
	
	@BeforeClass
	public void precondition() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = ReadProperty.readValue("URL");
		driver.get(url);
	}
	@AfterClass
	public void postcondition() {
		driver.quit();

	}
	public static void explicitWait(WebElement ele) {
		WebDriverWait waits=new WebDriverWait(driver, 50);
		waits.until(ExpectedConditions.elementToBeClickable(ele));	

	}
	public static void explicitWait_and_click(WebElement ele) {
		WebDriverWait waits=new WebDriverWait(driver, 50);
		waits.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

	}
	  public  static void javaScriptClick(WebElement ele) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", ele);

		}
}
