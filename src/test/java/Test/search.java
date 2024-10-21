package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.ConfigFile;

import Pages.LoginPage;

public class search {
	
	private WebDriver driver = null;
	public static String fburl = null;
	
	@BeforeTest
	public void getBrowser() throws Exception{
		driver = new ChromeDriver();
		ConfigFile.getValue();
		//driver.get("https://www.facebook.com/");
		driver.get(fburl);
	}
	
	@Test
	public void SearchGooogle(){
			
		LoginPage loginobj = new LoginPage(driver);
		
		loginobj.EnterUname("a@gmail.com");
		loginobj.Enterpass("1234");
		loginobj.Loginbtn();
		
		
	}
	
	@AfterTest
	public void closesession(){
		driver.close();
		System.out.println("Test completed");
	}
}
