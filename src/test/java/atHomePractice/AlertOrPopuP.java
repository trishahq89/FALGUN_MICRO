package atHomePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertOrPopuP {


	@Test
	public void alert_demo() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize(); 
		
		
		//driver.findElement(By.name("proceed")); hold this on web element
		WebElement signin =   driver.findElement(By.name("proceed"));
		signin.click();
	//pop up comes, what to do after that?	handle it
	//driver.switchTo().alert().accept(); (PRACTICE)
		
		
		
		
		
		
		
		
		driver.switchTo().alert().accept(); //when pop up appears, it says invalid user name>>>click ok
		
		Thread.sleep(5000);
			driver.quit();
		
		
		
		
	}
	
		
		
	}

