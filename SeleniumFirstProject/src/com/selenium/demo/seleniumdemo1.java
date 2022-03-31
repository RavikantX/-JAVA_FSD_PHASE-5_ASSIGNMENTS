package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemo1 {

	public static void main(String []args) {
		
		//set property for web driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
        String baseUrl="https://www.google.co.in/";
        String expected="Google";
        
        //launch Google Chrome and direct it to baseURL
        driver.get(baseUrl);
        
        //get Actual Title
        String actual= driver.getTitle();
        
        if(expected.equals(actual))
            System.out.println("Test Passed..!!");
        else
            System.out.println("Test Failed");
        
        driver.close();
	}
}
