package com.simplilearn.automatingwebsite.Automate_Web_App_usingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomateRegistration {

    private WebDriver driver;

    @Test
    public void launchFacebook() {
    	driver.get("https://www.shine.com/registration/parser/");
    }
    @Test
    public void login() {
    	
    	
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
		//button.submit();
    }
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
                   driver = new ChromeDriver();
               }
    @AfterTest
    public void afterTest() {
    }
}

