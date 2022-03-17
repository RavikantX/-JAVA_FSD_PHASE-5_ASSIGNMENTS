package com.simplilearn.automatingweb;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShineAutomateRegistration {

	public static void main(String[] args) {
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    
         WebDriver driver = new ChromeDriver();
		
         //For filling up the Registration Form
		driver.get("https://www.shine.com/registration/parser/");
		
		WebElement name=driver.findElement(By.cssSelector("#id_name"));
		name.sendKeys("Ravi Kant");
		
		WebElement email=driver.findElement(By.cssSelector("#id_email"));
		email.sendKeys("ravikant90602@gmail.com");
		
		WebElement phone= driver.findElement(By.cssSelector("#id_cell_phone"));
		phone.sendKeys("9060268235");
		
		WebElement pass=driver.findElement(By.cssSelector("#id_password"));
		pass.sendKeys("Ravi@4ravimp");
		
		WebElement check= driver.findElement(By.cssSelector("#id_privacy"));
		if(!check.isSelected())
		{
			check.click();
		}
		
		WebElement button= driver.findElement(By.cssSelector("#registerButton"));
		button.submit();
       
	}

}
