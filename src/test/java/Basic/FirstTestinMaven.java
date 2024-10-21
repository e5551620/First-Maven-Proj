package Basic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestinMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "Downloads");
		driver.close();

	}

}
