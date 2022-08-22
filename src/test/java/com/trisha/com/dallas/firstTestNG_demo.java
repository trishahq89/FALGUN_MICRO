package com.trisha.com.dallas;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTestNG_demo {
	


	/*Testcase: VERIFY USER LOGIN
	 * 1.launch url
	 * 2.click log in link
	 * 3.enter userid and password
	 * 4.click login
	 * 5.verify user login successfully >>>>>> (verify pass/fail)
	 */
	//Difference between pageload wait and implicit wait(INTERVIEW)
	
	
	
	@Test
	
	//@Test //need to import
	public void verifylogin() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // make an object of the webdriver, must include driver  and then import
		driver.get("https://demoblaze.com/");//copy paste the url , launch the url
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //mention seconds, for loading page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // for loading HTML/ web elements
		driver.manage().deleteAllCookies(); //save password, tell not to save any history, delete it
		driver.manage().window().maximize(); //maximize the window
		
		WebElement login = driver.findElement(By.id("login2")); //remove click(), login is the owner
		login.click();
		//JavascriptExecutor executor = (JavascriptExecutor)driver; //alternate way to click any webelement
		//executor.executeScript(", null)>>>need to learn

		
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("loginusername"));
		username.sendKeys("trishanewyork");
		WebElement password = driver.findElement(By.id("loginpassword"));
		password.sendKeys("123456");
		//use text function>>>> 1 OF 1
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		loginButton.click();
		
		
		//assert class given by TestNG validates our test case	    		    		
	   	 //if user id displayed then test case passed, otherwise failed
	    //boolean profilePage = driver.findElement(By.id("nameofuser")).isDisplayed(); //isdisplayed returning boolean>>need expath here, fix it		
		boolean profilePage = driver.findElement(By.xpath("//a[text()='Welcome trishanewyork']")).isDisplayed();
		
		Assert.assertTrue(profilePage);
	    Thread.sleep(4000);
	    driver.quit();
		
		/*PAGELOAD TIMEOUT - when open a page, page need to load first, tell selenium 20 seconds to wait, let it load first
		 * could be network issue,local network is fast, industry one is slow
		 * load means everything is visible
		 * sometimes it doesnt take long to load the page
		 * how long to wait? standard time is 20 seconds
		 * SYNTAX: driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 * maximum time is 20 seconds, however if the page loads in 2 seconds, selenium wont be waiting, 20 is the maximum after that will give error "cannot load the page"
		 * if any issue wait 20 seconds
		 */
		 
		/*IMPLICITLY WAIT - 
		 * page is loaded, however sometimes internet needs long time to load the HTML elements
		 * In case it finds the element before the duration specified, it moves on to the next line of code execution, thereby reducing the time of script execution.
		 * The Implicit wait will tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”.The default setting of Implicit wait is zero. Once you set the time, the web driver will wait for that particular amount of time before throwing an exception.
		 * Before clicking on Phones where does web driver go to find the location?>>>go to HTML ELEMENT/location(inspect)>>>>web elements not loading properly, cannot find here
		 * you cannot click on phone if web elements not found.	
		 * if html loads in 2 seconds, it will not wait for 20 seconds, 20 is the maximum again
		 */
		
		/*WelElement is an interface
		 * make an object or variable "login"
		 * 
		 * 
		 */

		/*(INTERVEIW)TestNG is a testing framework. TestNG has builT in Anotation, class, methods, that we can use for control and validate our test cases
		 * Java collection has a framework, it has built in classes, methods
		 * need library >>> repository like selenium, use latest version
		 * TestNG -  one test case equals one method
		 */
		
		/*TestNG Annotation - annotation is a program to control our test/test cases
		 * @Test - one test case = one method
		 * @Before test - LAUNCH URL IN EVERY TEST CASE (prerequest)
		 * @After test
		 * @Before method
		 * @After method
		 */
	//@Before test	
	 //   1.launch url
	//	 * 2.click log in link
	//	 * 3.enter userid and password
	//	 * 4.click login
	//@After test - post request - close the url
		
		
	//TestNG give us one of the class called Assert	to validate our test
		
	}
	
	
	
}
