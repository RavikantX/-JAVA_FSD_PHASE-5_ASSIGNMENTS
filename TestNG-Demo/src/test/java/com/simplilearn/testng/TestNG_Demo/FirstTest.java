package com.simplilearn.testng.TestNG_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTest {
  @Test
  public void f() {
	  System.out.println("Test Case 1 Executed");
  }
  //I Have Written this case for Failure so that i can check failure cases also
  @Test
  public void testone() {
	//Here if i put (false , true) then it fails then after changing it if we execute that fail case file then we see test passed 
	  assertEquals(false,false);
	  System.out.println("Test Case 2 Executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Before Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest Method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest Method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite Method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite Method");
  }

}
