package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports_Test {
	private static WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setreport(){
		 htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@Test
	public void TestCase1() {
		ExtentTest test1 = extent.createTest("Test one");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		test1.log(Status.INFO, "load browser");
		
		driver.findElement(By.id("email")).sendKeys("asd@gmail.com");
		test1.pass("username entered");
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		test1.pass("password entered");
		
		driver.findElement(By.name("login")).click();
		test1.pass("button clicked");
			
		driver.close();
		test1.log(Status.INFO, "browser closed");			
	}
	@Test
	public void TestCase2() throws IOException{
		ExtentTest test2 = extent.createTest("Test Two");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		test2.log(Status.INFO, "load browser");
		
		driver.findElement(By.id("email")).sendKeys("asd@gmail.com");
		test2.pass("username entered");
		test2.addScreenCaptureFromPath("test2snap1.png");
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		test2.pass("password entered");
		test2.addScreenCaptureFromPath("test2snap2.png");
		
		driver.findElement(By.name("login")).click();
		test2.fail("button clicked");
		test2.addScreenCaptureFromPath("test2snap3.png");
			
		driver.close();
		test2.log(Status.INFO, "browser closed");
	}
	@AfterSuite
	public void lastActions(){
		extent.flush();		
	}

}
