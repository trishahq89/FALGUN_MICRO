package com.trisha.com.dallas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Practice {

	/*Testcase: VERIFY USER LOGIN >>> all test cases need atleast 1 validation, we can do more 
	 * 1.launch url
	 * 2.click log in link
	 * 3.enter userid and password
	 * 4.click login
	 * 5.verify user login successfully >>>>>> (verify pass/fail)
	 */
	@Test
 public void verifylogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //since chrome is a class, make an object of the class 
		driver.get("https://demoblaze.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //standard time in 20 seconds for the page to load, everything visible, if it loads in 1 sec, SE wont wait for 20 seconds
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//At this point page is already loaded. HTML/web elements not load automatically sometimes, it takes time to load. Not specific but all elements
		driver.manage().deleteAllCookies(); //delete all history, not saving
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("login2")).click(); we can do it this way, but there is another way aswell
		//Webelement is an interface, returning a web element
		
		WebElement login = driver.findElement(By.id("login2")); //webelement >>> ctrl shift
		login.click();
		WebElement username = driver.findElement(By.id("loginusername"));
		Thread.sleep(3000);
		username.click();
		Thread.sleep(3000);
		username.sendKeys("trishanewyork");
		WebElement password = driver.findElement(By.id("loginpassword"));
		password.click();
		Thread.sleep(3000);
		password.sendKeys("123456");
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Log in']"));//text() function xpath
		loginbutton.click();
		
		//if my userid is displayed then test case has passed or else failed >>>> BOOLEAN
		
	  //boolean loginSuccessful = driver.findElement(By.id("nameofuser")).isDisplayed();// this did not work, go with xpath,java.lang.AssertionError: expected [true] but found [false]
	boolean loginSuccess = driver.findElement(By.xpath("//a[text()='Welcome trishanewyork']")).isDisplayed(); //id want not working so used xpath
		//validate test case by Assert class by testNG
  
	Assert.assertTrue(loginSuccess); //assertion error will if not true

	    Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
