package atHomePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class AlternateeClickOption {
	
	
	
	
	
	JavascriptExecutor executor = (JavascriptExecutor)driver; //import it, executor is the object
	executor.executeScript("arguments[0].click();", driver.findElement(By.id("login2")));
	
	
	
}
