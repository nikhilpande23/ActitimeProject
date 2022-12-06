package com.actitime.Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

// Do not execute this program

public class _1_ListnerImplementation extends _2_Baseclass implements ITestListener {
	
	

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TestScript Passed",true);
	}

//	we have to take ss when test gets fails
	@Override
	public void onTestFailure(ITestResult result) {
		
		String name = result.getName(); //why result. bcoz all this block o/p stores into the result
		
//		WebDriver driver=new ChromeDriver(); sir removed this 2 steps later and extends baseclass above
//		driver.get("https://demo.actitime.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./Screenshot/ss.png"); //if more than 1 ss. it is not able to take bcoz it'll override, do next step to overcome
		File dest = new File("./Screenshot/"+name+".png"); // 1st step String name = result.getName(); 2nd step File dest = new File("./Screenshot/"+name+""); 
//		Files.copy(src, dest); is giving error so we using try catch block
		try {
			Files.copy(src, dest);
		} catch (Exception e) {
			
		}
	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
