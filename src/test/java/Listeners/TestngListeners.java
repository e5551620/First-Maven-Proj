package Listeners;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListeners implements ITestListener {

	public void onFinish(ITestContext con) {
		// TODO Auto-generated method stub
		System.out.println("on Finish----"+con.getName());
		
	}

	public void onStart(ITestContext con) {
		// TODO Auto-generated method stub
		System.out.println("on start---"+con.getName());
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult res) {
		// TODO Auto-generated method stub
		//System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	public void onTestFailure(ITestResult res) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure----"+res.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println(" onTestSkipped");
		
	}

	public void onTestStart(ITestResult res) {
		// TODO Auto-generated method stub
		System.out.println(" onTestStart----"+res.getName());
		
	}

	public void onTestSuccess(ITestResult res) {
		// TODO Auto-generated method stub
		System.out.println(" onTestSuccess-----"+res.getName());
		
		
	}

	
}
