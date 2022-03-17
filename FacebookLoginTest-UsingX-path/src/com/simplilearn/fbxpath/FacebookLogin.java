package com.simplilearn.fbxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://m.facebook.com/");
		
		//We are writing logic for automated login using x-path
		WebElement email= driver.findElement(By.xpath("//*[@id=\"m_login_email\"]"));
		email.sendKeys("ravikant97087@gmail.com");
		
		WebElement pass= driver.findElement(By.xpath("//*[@id=\"m_login_password\"]"));
		pass.sendKeys("ravi@123");
		
		WebElement button= driver.findElement(By.xpath("//*[@id=\"login_password_step_element\"]/button"));
		button.submit();
	}

}
