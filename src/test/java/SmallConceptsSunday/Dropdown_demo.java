package SmallConceptsSunday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_demo {
/* dropdown - Select class(INTERVIEW) HOW DO WE HANDLE DROPDOWN MENU? HANDLE BY SELECT CLASS
 * mouse hover - Action class	(INTERVIE) handle mouse hovere by action class
 */
	
	
	
//classname is select, mouseover >>>action class
	//any dropdown always start with select
	
	@Test
	
	public void dropDown() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // make an object of the driver, must include driver  and then import
		driver.get("https://www.ebay.com/");//copy paste the url , launch the url
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //mention seconds, for loading page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // for loading HTML/ web elements
		driver.manage().deleteAllCookies(); //save password, tell not to save any history, delete it
		driver.manage().window().maximize(); 
		
		/*select class....class so make an object
		 * we can select by index (not practical)
		 * we can select by value>>>> 550
		 * we can select by visible text>>>> Art
		 */
		//Select dropdownMenu = new Select make object of the class Seelct , import it
		//it itself will give error
		//because it is asking for the location of the dropdown so do driver.blabla
		
		
		Select dropdownMenu = new Select(driver.findElement(By.id("gh-cat"))); //import it from SE, give location of the drop down>>> give locator
		
		
		
		//dropdownMenu.selectByValue("20081"); //antiques
		dropdownMenu.selectByVisibleText("Cameras & Photo");
		//dropdownMenu.selectByIndex(10);
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
