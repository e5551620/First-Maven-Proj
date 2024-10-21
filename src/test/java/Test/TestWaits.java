package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWaits {
	
	public static void main(String args[]){
		
		WaitsExample();
	}
	
	public static void WaitsExample(){
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		WebElement uname = driver.findElement(By.id("emailxxx"));
		WebElement pwd = driver.findElement(By.id("pass"));
		WebElement btn = driver.findElement(By.name("login"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement u = wait.until(ExpectedConditions.visibilityOf(uname));
		//u.sendKeys("as@gmail.com");
		
		
		driver.close();
	}

}
