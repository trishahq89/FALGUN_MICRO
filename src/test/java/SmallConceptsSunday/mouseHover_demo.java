package SmallConceptsSunday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseHover_demo {

	@Test
	public void mouseHover() throws Exception {
		
		//mousehover reuires Action class
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // make an object of the driver, must include driver  and then import
		driver.get("https://www.dell.com/en-us");//copy paste the url , launch the url
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //mention seconds, for loading page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // for loading HTML/ web elements
		driver.manage().deleteAllCookies(); //save password, tell not to save any history, delete it
		driver.manage().window().maximize(); 
		
		Actions ac = new Actions(driver); //need to pass the driver here
		//it mouse hovers  in products
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Products']"))).build().perform(); //put the location of the element
		Thread.sleep(3000);
		
		//now need servers from products
		
		driver.findElement(By.linkText("Servers")).click();
		
		Thread.sleep(5000);
		driver.quit();
		// need to run here
	}
	
	
	
	
	
	
	
	
}
