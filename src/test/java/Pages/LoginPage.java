package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;

	By username = By.id("email");
	By passwd = By.id("pass");
	By loginbtn = By.name("login");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void EnterUname(String uname){
		driver.findElement(username).sendKeys(uname);
		
		
	}
	
	public void Enterpass(String pass){
		driver.findElement(passwd).sendKeys(pass);
	
	}
	
	public void Loginbtn(){
		 driver.findElement(loginbtn).click();
		
	}
}
