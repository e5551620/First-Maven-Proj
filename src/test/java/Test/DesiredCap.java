package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesiredCap {
	
	public static void main(String args[]) throws InterruptedException{
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		caps.setCapability("enableElementCacheCleanup", true);
		caps.setCapability("enablePersistentHover", true);
		caps.setCapability("enableFullPageScreenshot", true);
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		el.sendKeys("ASDF");
		
	
		//driver.findElement(By.name("q")).sendKeys("ASDFG");
		driver.close();
		driver.quit();
	}

}
