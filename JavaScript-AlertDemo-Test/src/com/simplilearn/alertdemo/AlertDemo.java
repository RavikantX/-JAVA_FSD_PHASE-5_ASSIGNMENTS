package com.simplilearn.alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		
		String baseUrl="https://nxtgenaiacademy.com/alertandpopup/";
		
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver= new ChromeDriver();
		driver.get(baseUrl);
		
		WebElement alert= driver.findElement(By.name("alertbox"));
		alert.click();
		driver.switchTo().alert().accept();
		
		//Confirm AlertBox
		WebElement confirmalert= driver.findElement(By.name("confirmalertbox"));
		confirmalert.click();
		
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		WebElement promptalert= driver.findElement(By.name("promptalertbox1234"));
		promptalert.click();
		driver.switchTo().alert().sendKeys("Yes");
		driver.switchTo().alert().accept();
	}

}
