package atHomePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class JavascripExecutor {
	@Test

	public void newAccount() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//WebElement clickSignIn = driver.findElement(By.xpath("//span[text()='Sign in']"));
		//clickSignIn.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("argument[0].click();", driver.findElement(By.xpath("//span[text()='Sign in'")));
		
		
		
		//WebElement createAccount = driver.findElement(By.xpath("//span[text()='Create Account']"));
		//createAccount.click();
		//JavascriptExecutor executor = (JavascriptExecutor)driver; Create the executor object once 
		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Create Account']"))); 
		Thread.sleep(3000);
		
		WebElement enterEmail = driver.findElement(By.id("username"));
		enterEmail.click();
		enterEmail.sendKeys("trisha@newyork.com");
		WebElement firstName = driver.findElement(By.id("firstname"));
		firstName.click();
		firstName.sendKeys("trisha");
		WebElement lastName = driver.findElement(By.id("lastname"));
		lastName.click();
		lastName.sendKeys("hoque");
		WebElement addPhone = driver.findElement(By.id("phone"));
		addPhone.click();
		addPhone.click();
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.click();
		passWord.sendKeys("123456");
		WebElement createAccountButton = driver.findElement(By.id("createAccount"));
		createAccountButton.click();
		

		Thread.sleep(7000);
	
	driver.quit();
	
	
	}
}
