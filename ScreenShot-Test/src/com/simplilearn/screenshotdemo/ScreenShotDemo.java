package com.simplilearn.screenshotdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotDemo {

	public static void main(String[] args) {
		
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    
	    //Here i have used google link for screenshot purpose
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		
		//Here i have provided the path where my screenshot will be saved
		try {
			FileHandler.copy(src, new File("C:\\Selenium\\ScreenShots\\test1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
