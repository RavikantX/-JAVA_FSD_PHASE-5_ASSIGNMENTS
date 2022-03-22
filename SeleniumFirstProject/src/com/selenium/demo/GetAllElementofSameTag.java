package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllElementofSameTag {

	public static void main(String[] args) {
		
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		List<WebElement> list   =driver.findElements(By.tagName("input"));
		
		for(WebElement w:list)
		{
			System.out.println(w.getAttribute("aria-label"));
		}
		
		driver.close();
	}

}
