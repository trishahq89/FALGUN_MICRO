package SmallConceptsSunday;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class countLink {

	
	/*how many link available >>>integer
	 * 
	 * print them as string
	 * 
	 */
	@Test
	public void link_demo() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // make an object of the driver, must include driver  and then import
		driver.get("https://www.dell.com/en-us");//copy paste the url , launch the url
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //mention seconds, for loading page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // for loading HTML/ web elements
		driver.manage().deleteAllCookies(); //save password, tell not to save any history, delete it
		driver.manage().window().maximize(); 
		
		//since more than 1 link, lists (find elements) not element
		//why suing list? because it has a lot of elements need to use list
		//locator >>by.tagname
		//link has an attribute called href alaways
		//import webelement and list
		
		
		
		
		
	//The getAttribute() method helps to get the value of any attribute of a web element, which is returned as a String
		
		
		List<WebElement> listoflink = driver.findElements(By.tagName("a")); //all the links are available under tagname a/ anchor link , import list ....LIST FROM WEBELEMTS, WE ARE TYRYING TO FIND WEBELEMTS
		System.out.println(listoflink.size());//use size() to know how many >>> 381 links
		for(int i = 0; i<listoflink.size(); i++) { // i is index
			System.out.println(listoflink.get(i).getAttribute("href")); //it will only index i so need to apply getattribute here
		}
		driver.quit();
		
		
		
		
		
		
		
	}
	
	
	
}
