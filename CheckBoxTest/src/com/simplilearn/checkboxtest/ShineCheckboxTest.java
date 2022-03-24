package com.simplilearn.checkboxtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShineCheckboxTest {

	public static void main(String[] args) {
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/parser/");
		
		WebElement check= driver.findElement(By.id("id_privacy"));
		
		if(check.isSelected())
		{
			check.click();
		}
		
		//We can use this to close the page but i have disabled it so that i can observe the result properly
		//driver.close();

	}

}
