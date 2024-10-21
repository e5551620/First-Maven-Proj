package Test;

import org.testng.Assert;

import org.testng.annotations.Test;


public class TestGrouping {
	
	@Test
	public void test1(){
		System.out.println("Test case 1");
		
	}
	
	@Test(retryAnalyzer = Listeners.RetryAnalyzer.class)
	public void test2(){
		System.out.println("Test case 2");
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void test3(){
		System.out.println("Test case 3");
		
	}
	

}
