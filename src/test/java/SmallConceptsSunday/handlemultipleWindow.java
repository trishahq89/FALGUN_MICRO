package SmallConceptsSunday;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class handlemultipleWindow {
/* driver.close() - means close the current window
 * driver.quit() - means any window open it will close
 */
	
	

	
	
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		 
		driver.manage().deleteAllCookies();
		System.out.println("Chrome Browser launch");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[4]/a/span[3]")).click();
		driver.findElement(By.xpath("//a[@href='https://realestatecenter.bankofamerica.com/']")).click();
		//xpath: a[id="findAHome"] or a#findAHome (by id)
		driver.findElement(By.cssSelector("a[title='Opens New Construction in a new tab.']")).click();
		//new window opens: we will tell selenium go to a child window validate sth and come back to the parent window and then close everything
		
		Set <String> window = driver.getWindowHandles(); //set of string, set is an interface, more than 1, if it returning sth we can hold it in a set
		
		//it is a loop in window as well, we use a method called iterator, its the same as loop
		//set has a method called iterator, it is responsible for going back and forth and we hold it in a string by creating a variable
		Iterator <String> ite = window.iterator(); //returning string
	//	ite.next() next is a method, as soon as i click the constructor boa, I will go to the next window
		
		String parentWindow = ite.next();
		String childWindow = ite.next();
		driver.switchTo().window(childWindow);
		System.out.println("We are in child window");
		Thread.sleep(4000);
		
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		Boolean result = driver.findElement(By.xpath("//h3[text()='Tools & Resources']")).isDisplayed();
		//tell selenium to wait for 20 seconds to validate if cannot find it, but if he finds it in 3 seconds, it wont wait
	    Assert.assertTrue(result);
		
		driver.switchTo().window(parentWindow);
		System.out.println("We are in parent window");
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		/*implicitly wait - we are giving maximum time to launch the page  - for all pages or every elements
		 * pageloadout - we are giving some maximum time to load the web elements - for every pages or every elements
		 * signin, home, contact, email (our test cases) - wait for every page
		 * it works for inidivdual web element to weait some seconds
		 */
		
		/* explicitly wait - works with condition = we are going to tell webdriver only wait for 20 seconds for signin
		 * it works for inidivdual web element to weait some seconds and then proceed with the next execution
		 * 
		 */
		
		
		/* sometimes thread.sleep gives some issue, how to deal with it? (INTERVIEW)
		 * EG only take fv coffee , putting a condition, a particular web element we are looking for
		 * thread.sleep = it stops execution totally does not matter how many seconds, either it is able to find or not , it will wwait 20 seconds
		 * unlike thread.sleep, if that finds it in 2 seconds it wont wait 20 seconds
		 * for thousands of testcases, 10 secs for every test case does not make sense
		 */
		
		
		//(interview) difference between explicit wait and implicit wait
		
		
		
	}

}
