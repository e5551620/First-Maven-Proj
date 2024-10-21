package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestngListeners.class)
public class TestCaseListener {
	
	@Test
	public void one(){
		System.out.println("Test Case 1");
		
	}
	@Test
	public void two(){
		System.out.println("Test Case 2");
		//Assert.assertTrue(false);
	}

	@Test(priority = 0)
	public void three(){
		System.out.println("Test Case 3");
		//throw new SkipException("---");
	}
	@Test(priority = 4)
	public void four(){
		System.out.println("Test Case 3");
		//throw new SkipException("---");
	}


}
