package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest1 {

	public static void main(String[] args) {
		
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
					
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        //We have used this after inspecting facebook login page and used the used the class as mentioned there
        //We have used here findElement webdriver locator
        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        
        email.sendKeys("ravikant97087@gmail.com");
        pass.sendKeys("ravi@123");
        
        WebElement login= driver.findElement(By.name("login"));
        login.submit();
	}

}
