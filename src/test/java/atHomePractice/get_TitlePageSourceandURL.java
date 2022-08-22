package atHomePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class get_TitlePageSourceandURL {
	
	@Test
	public void printTitle() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // make an object of the driver, must include driver  and then import
		driver.get("https://www.dell.com/en-us/dt/corporate/newsroom.htm#/filter-on/Country:en-us");//copy paste the url , launch the url
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //mention seconds, for loading page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // for loading HTML/ web elements
		driver.manage().deleteAllCookies(); //save password, tell not to save any history, delete it
		driver.manage().window().maximize(); 
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle()); //you need to change url inorder to get the title
		driver.quit();
	}	
		
		
}
