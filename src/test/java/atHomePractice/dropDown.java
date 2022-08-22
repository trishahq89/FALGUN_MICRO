package atHomePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class dropDown {
	
	@Test
	public void dd_Menu() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.target.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Find Stores")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div[1]/button")).click();
	driver.findElement(By.id("city")).sendKeys("Brooklyn");
	Thread.sleep(5000);
	
//Select your state from Drop-down menu:
	
	Select dropdown = new Select(driver.findElement(By.id("state"))); //select state
	//dropdown.selectByIndex(32); //use index number
	//dropdown.selectByValue("NY");
	dropdown.selectByIndex(10);
	 //dropdown.selectByVisibleText("UT");
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[3]/div/form/div[2]/div[1]/button")).click();
	
	Thread.sleep(5000);
	driver.quit();
	
	
	}
	
	
}
