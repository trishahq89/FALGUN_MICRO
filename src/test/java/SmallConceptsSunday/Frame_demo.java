package SmallConceptsSunday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame_demo {

	@Test
	public void frame_demo() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // make an object of the driver, must include driver  and then import
		driver.get("https://docs.oracle.com/javase/7/docs/api/");//copy paste the url , launch the url
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //mention seconds, for loading page
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // for loading HTML/ web elements
		driver.manage().deleteAllCookies(); //save password, tell not to save any history, delete it
		driver.manage().window().maximize(); 
		
	   //Help
		driver.switchTo().frame("classFrame"); //name
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[8]/a")).click(); //if we only inspect and find this locator it wont work, need t ofind the frame ( by using above line)
		//driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(3000);
	driver.quit();
	//FAILED: com.trisha.com.dallas.Frame_demo.frame_demo >>>it failed
	
	//go to that frame and click it, every frame has a name
	
	

	
	
	
}
}

