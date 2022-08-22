package atHomePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class userNamePass_Print {

	
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
		
		WebElement clickSignIn = driver.findElement(By.xpath("//span[text()='Sign in']"));
		clickSignIn.click();
		WebElement createAccount = driver.findElement(By.xpath("//span[text()='Create Account']"));
		createAccount.click();
		Thread.sleep(3000);
		
		WebElement enterEmail = driver.findElement(By.id("username"));
		enterEmail.click();
		enterEmail.sendKeys("trisha@newyork.com");
		
//print my email in username
		String myemail = driver.findElement(By.id("username")).getAttribute("value");
		
		System.out.println(myemail);
		
		
		
		WebElement firstName = driver.findElement(By.id("firstname"));
		firstName.click();
		firstName.sendKeys("trisha");
//we want to print right after we typed in 		
//print trisha
		
		String firstN = driver.findElement(By.id("firstname")).getAttribute("value"); //getattribute will always return a string
		
		System.out.println(firstN);
//NULL value
		
		//if we do not type anything it will give null value, for example profile page where my username is reflecting
		
		WebElement lastName = driver.findElement(By.id("lastname"));
		lastName.click();
		lastName.sendKeys("hoque");
		WebElement addPhone = driver.findElement(By.id("phone"));
		addPhone.click();
		addPhone.click();
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.click();
		passWord.sendKeys("123456");
	
	
	
	
	}
	
}
