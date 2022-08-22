package atHomePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class mouseHover {
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
		
		//cannot work wihtout the driver, so pass it down
		
	
		
		
		Actions mouse = new Actions(driver);
		
		//mouse.moveToElement(driver.findElement(By.xpath("//span[text()='Products']"))); >>> after moveing to product need to do sth
		
		//mouse.movetoelemnt() what is element location put in ()
		
		mouse.moveToElement(driver.findElement(By.xpath("//span[text()='Products']"))).build().perform();
	//have to put buil and perform	
		driver.findElement(By.linkText("Servers")).click();
		Thread.sleep(5000);
		driver.quit();
}
}
