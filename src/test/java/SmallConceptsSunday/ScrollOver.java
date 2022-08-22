package SmallConceptsSunday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollOver {
	//Click: syntax for clicking
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", Put Element Here);
	
	

	@Test
	
	
	public void scrollDown() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // 
		driver.get("https://www.southwest.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   
		driver.manage().deleteAllCookies(); 
		driver.manage().window().maximize(); 
		
		//(JavascriptExecutor) if put interface inside the bracket it is called type casting (INTERVIEW)  
		//not creating object of the interface
		//type casting : making object of the interface if we would like to, putting the interface inside parenthesis called type casting
		
		//Syntax: ScrollDown: ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		((JavascriptExecutor)driver).executeScript("scroll(0,900)"); //400 is the standard, we can go up to 900, 900 is the maximum
		
		Thread.sleep(5000);
		
		
	}
	
	
	
	
}
