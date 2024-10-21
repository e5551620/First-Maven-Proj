package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallerBrowserTest {
	WebDriver driver ;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser){
		System.out.println("browserName--"+browser);
		if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
	}
	@Test
	public void testcase1() throws Exception{
		driver.get("https:/www.facebook.com/");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
	}

}
