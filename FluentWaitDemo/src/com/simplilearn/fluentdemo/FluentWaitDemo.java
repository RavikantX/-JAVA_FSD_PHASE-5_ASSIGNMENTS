package com.simplilearn.fluentdemo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	

		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
		//This is doing using Xpath as i have copied the xpath
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement element= wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver d) {
				WebElement ele= driver.findElement(By.xpath("//*[@id=\"demo\"]"));
				String getTextonPage= ele.getText();
				
				if(getTextonPage.equals("Software Testing Material - DEMO PAGE"))
				{
					System.out.println(getTextonPage);
					return ele;
				}
				else
				{
					System.out.println("Fluent wait failed");
					return null;
				}
			}
		});
	}

}
