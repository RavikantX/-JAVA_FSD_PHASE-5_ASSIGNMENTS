package com.simplilearn.tabswitch;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabSwitch {

	public static void main(String[] args) throws InterruptedException {
		
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    
	    //Here i have provided the link for google tab
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		//Here i have provided the link for facbook login page
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("window.open('https://m.facebook.com/','_blank')");
		
		ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		//switching will take place here
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(5000);
		
		//Here tab 1 will again switch to tab 0
		driver.switchTo().window(tabs.get(0));
	}

}
