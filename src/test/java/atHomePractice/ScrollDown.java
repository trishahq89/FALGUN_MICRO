package atHomePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown {

@Test
	
	
	public void scrollDown() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // 
		driver.get("https://www.southwest.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize(); 
	
		//javascript ecexutor is one of the interfaces
	
	//
	//JavascriptExecutor executor = (JavascriptExecutor)driver;
		((JavascriptExecutor)driver).executeScript("scroll(0,-700)"); //900 is the maximum
	
		
		Thread.sleep(5000);
		
		
		
}
	
}
