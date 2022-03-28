package com.simplilearn.paralleltest.PrallelTest_UsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	private WebDriver driver;

	//test1
	@Test(groups = "Chrome")
	public void launchFacebook() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();;
		}
	}

	//test2
	@Test(groups="Chrome", dependsOnMethods = "launchFacebook")
	public void login() {
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("ravikant@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("#pass"));
		password.sendKeys("ravi@123");

		WebElement button = driver.findElement(By.name("login"));
		button.click();
	}
	
	//test 3
	@Test(groups = "Firefox", dependsOnGroups = "Chrome")
	public void launchFirefox() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Ravikant\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();;
		}
	}

	//test 4
	@Test(groups="Firefox", dependsOnMethods = "launchFirefox")
	public void loginWithFirefox() {
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("ravikant@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("#pass"));
		password.sendKeys("ravi@123");

		WebElement button = driver.findElement(By.name("login"));
		button.click();
	}

}
//So Here Out of 4 Tests 2 passes,1 failure and 1 skipped