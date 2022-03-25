package com.simplilearn.csstest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) {
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
					
	    WebDriver driver= new ChromeDriver();
		driver.get("https://m.facebook.com/");
		
		WebElement email= driver.findElement(By.cssSelector("input[id*='mail']"));
		System.out.println(email.getAttribute("placeholder"));
		
		WebElement button= driver.findElement(By.cssSelector("button[value='Log In'][type='button']"));
		button.submit();
		System.out.println(button.getAttribute("data-sigil"));
		driver.close();

	}

}
