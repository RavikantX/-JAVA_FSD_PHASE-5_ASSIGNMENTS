package com.simplilearn.autoi3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoI3Demo {

	public static void main(String[] args)throws IOException,InterruptedException {
		
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/parser/");
		WebElement email= driver.findElement(By.id("id_name"));
		email.sendKeys("ravikant97087@gmail.com");
		
		WebElement upload= driver.findElement(By.id("id_file"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
	
		executor.executeScript("arguments[0].click()", upload);
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Selenium\\fileupload.exe");
	}

}
