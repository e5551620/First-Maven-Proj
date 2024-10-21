package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestngListeners.class)
public class TestCaseListener2 {
	
	@Test
	public void TestCase4(){
		System.out.println("Test Case 4");
		
	}
	@Test
	public void TestCase5(){
		System.out.println("Test Case 5");
		//Assert.assertTrue(false);
	}

	@Test
	public void TestCase6(){
		System.out.println("Test Case 6");
		//throw new SkipException("---");
	}


}
