package SmallConceptsSunday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class URLandPageSource_Print {

	@Test
	public void print() {
		
		//print the url , use method .get current url, get the title, every page has a title
		//for title, inspect, show on the bar contact us, cntrl F >>> type in title, contact us
		//(INTERVIEW) - USE geturl method in selenium, get page source method
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // make an object of the driver, must include driver  and then import
		driver.get("https://docs.oracle.com/javase/7/docs/api/");//copy paste the url , launch the url
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //mention seconds, for loading page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // for loading HTML/ web elements
		driver.manage().deleteAllCookies(); //save password, tell not to save any history, delete it
		driver.manage().window().maximize(); 
		
		System.out.println(driver.getCurrentUrl()); //print in console
		System.out.println(driver.getPageSource());//get all the page source
		
		
		
	}
	
	
	
	
	
	
}
