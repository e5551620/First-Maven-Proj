package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sdf@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		
		driver.close();
		System.out.println("completed");

	}

}
