package com.simplilearn.assertiontest.AssertionTestUsing_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AssertionTest {
	WebDriver driver;
	SoftAssert soft;
	
	@BeforeMethod
	public void beforeMethod() {
		soft= new SoftAssert();
	}
	@AfterMethod
	public void afterMethod() {
		soft=null;
	}
  @Test
  public void launch() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  try {
		Thread.sleep(3000);
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
  
  @Test(dependsOnMethods = {"launch"})
  public void facebook()
  {
	  driver.get("http://www.facebook.com");
	  soft.assertEquals("Facebook – log in or sign up", driver.getTitle());
	  try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
  }
  
  @Test(dependsOnMethods = {"facebook"})
  public void login()
  {
	  WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("ravikant@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("#pass"));
		password.sendKeys("ravi@123");

		WebElement button = driver.findElement(By.name("login"));
		button.click();
		
		soft.assertAll();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
  }
}
//All The cases Passed Successfully
