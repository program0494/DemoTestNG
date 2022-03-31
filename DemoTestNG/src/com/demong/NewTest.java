package com.demong;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C://Users//853564//Downloads//chromedriver_win32//chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.guru99.com/first-webdriver-script.html");
	  //driver.window().maximize();
	
  }
 

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
