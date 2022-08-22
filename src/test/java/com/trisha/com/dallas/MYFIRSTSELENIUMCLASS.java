package com.trisha.com.dallas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MYFIRSTSELENIUMCLASS { //did not use testng here, used main method

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asif\\Downloads\\DRIVER\\chromedriver.exe");//copy as path from the driver folder"
		
	/*Run the test
	 * Launch the application url
	 * click on contact //to click contact we need locator to find web elemts>>>id,name,linktext,xpath,css locator
	 * enter  email id
	 * enter contact name
	 * enter msg
	 * click send message
	 * 
	 */
	
	WebDriver driver = new ChromeDriver(); // make an object of the driver, must include driver  and then import
	driver.get("https://demoblaze.com/");//copy paste the url , launch the url
	driver.manage().window().maximize(); //maximize the window
	
	driver.findElement(By.linkText("Contact")).click(); //locator , enter email
	Thread.sleep(3000);
	driver.findElement(By.id("recipient-email")).sendKeys("test"); //enter name
	//driver.findElement(By.id(null))
	Thread.sleep(10000); //dont use try catch , manual wait
	driver.quit(); 
		
	}

}
