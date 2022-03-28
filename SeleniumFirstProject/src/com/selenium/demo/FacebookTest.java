package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) {
	//set property for web driver
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				

	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement email= driver.findElement(By.id("email"));
	String hint=email.getAttribute("placeholder");
	System.out.println(hint);
	
	WebElement element = driver.findElement(By.className("_8eso"));
	System.out.println(element.getText());
	driver.close();
    
    
	}

}
