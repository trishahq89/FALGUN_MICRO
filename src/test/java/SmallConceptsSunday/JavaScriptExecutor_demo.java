package SmallConceptsSunday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor_demo {
/* sometimes selenium cannot click it, need an alternative way
 * java script executor(interface), it can click any elements
 * (INTERVIEW) If selenium cannot handle click what to do? We can use JavaScriptExecutor to click anything
 */
	@Test
	public void verifylogin() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demoblaze.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		
		//WebElement login = driver.findElement(By.id("login2")); //webelement >>> ctrl shift
		//login.click();  
	//Use java script executor to click,  it is an interface so need to import it,
		
		JavascriptExecutor executor = (JavascriptExecutor)driver; //import it, executor is the object
		executor.executeScript("arguments[0].click();", driver.findElement(By.id("login2")));
		
		
		WebElement username = driver.findElement(By.id("loginusername"));
		Thread.sleep(3000);
		username.click();
		Thread.sleep(3000);
		username.sendKeys("trishanewyork");
		WebElement password = driver.findElement(By.id("loginpassword"));
		password.click();
		Thread.sleep(3000);
		password.sendKeys("123456");
		//WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Log in']"));//text() function xpath
		//loginbutton.click();
	   executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[text()='Log in']")));
	
}
}
