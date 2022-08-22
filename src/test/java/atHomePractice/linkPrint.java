package atHomePractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class linkPrint {

	

	@Test

	public void newAccount() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
	List<WebElement> linkTarget = driver.findElements(By.tagName("a")); //import webelement and List, its not list of strings integer double but webelements
	System.out.println(linkTarget); //prints sth i dont know
	
	System.out.println(linkTarget.size()); //total number of link
	
	//The getAttribute() method helps to get the value of any attribute of a web element, which is returned as a String
	//to print serially, link always has an attribute called "href"
	
	
	
	for(int i = 0; i<linkTarget.size();i++) { //arraylist so size will be here, size showing integer
		System.out.println(linkTarget.get(i).getAttribute("href")); //we want the value of an attribute>>> the value is the hyperlink
		driver.close();
		
		
		
		
	}
	
	}
	
}
