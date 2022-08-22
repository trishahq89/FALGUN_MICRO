package atHomePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {

	
	@Test
	public void frame_demo() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // make an object of the driver, must include driver  and then import
		driver.get("https://docs.oracle.com/javase/7/docs/api/");//copy paste the url , launch the url
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //mention seconds, for loading page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // for loading HTML/ web elements
		driver.manage().deleteAllCookies(); //save password, tell not to save any history, delete it
		driver.manage().window().maximize(); 
	//attribute and text funtion not working for help
	
		
		//driver.findElement(By.xpath("/html/body/div[1]/ul/li[8]")).click();
	//	org.openqa.selenium.NoSuchElementException: Unable to find element with locator By.xpath: /html/body/div[1]/ul/li[8]
		//se gets confused which frame to go and click
		//every frame has a name, go to inspect

		
		
//step1: switch to frame first	
		//driver.switchTo().frame("classFrame"); //bc its string select that frame
//step2: get the locator
	//	driver.findElement(By.xpath("/html/body/div[1]/ul/li[8]")).click();
        		
		//Thread.sleep(3000);

		
		
//new frame		
		driver.switchTo().frame("packageListFrame"); //name = packagelist
		
		driver.findElement(By.linkText("java.applet")).click();
		
		Thread.sleep(7000);		
		
		
		driver.quit();
		
		
	
	}
	
}
