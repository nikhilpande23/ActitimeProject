package com.actitime.testscripts;

import java.io.IOException;
import java.util.concurrent.ConcurrentSkipListMap;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;

// to which class wants to monter
//lnking 2 classes using @listerns
// where to go put that package name in () & error is there...put .class
import org.testng.annotations.Test;

import com.actitime.Generic._2_Baseclass;
import com.actitime.pom._3_TaskPage;
import com.actitime.pom._2_HomePage;

@Listeners (com.actitime.Generic._1_ListnerImplementation.class)

public class _1_CreateCustomer extends _2_Baseclass{
	
	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		
		_2_HomePage hp=new _2_HomePage(driver);
		hp.tasklnk();
		
	_3_TaskPage tp=new _3_TaskPage(driver);
	tp.createnew();
	}
	
//	@Test
//	public void createCustomer() throws InterruptedException {
//		Reporter.log("customer created",true);
//		Thread.sleep(5000);
//		Assert.fail(); // intensionaly fails the testcase to get SS when program fails
////		now public void onTestSuccess "TestScript Passed" will not in o/p bcoz pgrm not executed
//	}
	
//	run this program
//	linked with the ListnerImplementation class 
//	in o/p
//	1st run this public void onTestStart(ITestResult result) {
//	Reporter.log("Test started",true);
	
//	then will run this
//	public void createCustomer() {
//		Reporter.log("customer created",true);
	
//	Now deleted 2nd @Test method
	
//	now removed @Test which was having assert.fail. bcoz now we'r doing actual test script
}
