package com.actitime.Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actitime.pom._1_LoginPage;
import com.actitime.pom._2_HomePage;

public class _2_Baseclass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver; //** sign 
//	why static..bcoz it should work in this class only. not to use in another class.
	
//	pre requise
	
	
	
//	giving database connection
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database is CONNECTED",true);
	}
	
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database DISCONNECTED",true);
	}
	
//	@Test //intially without Test anotation we can't run this base class, but now it is linked with base class so NO NEED of @Test
//	public void createCustomer() {
//		Reporter.log("Customer created",true);
//	}
	
	@BeforeTest
	public void launchbrowser() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void closebrowser() {
//		driver.close(); will not come here so soluntion is ** sign
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException {
//		To get data from readDataFromPropertyFile class do next step
		_3_readDataFromPropertyFile data = new _3_readDataFromPropertyFile();
		
		String URL = data.readDataFromProperty("url");
		String un = data.readDataFromProperty("username");
		String passw=data.readDataFromProperty("password");
		
		driver.get(URL); //No hardcoadig here
		
		_1_LoginPage lp=new _1_LoginPage(driver); //POM class
		lp.logintoActitime(un, passw);

//		Now using POM class so no need below steps
//		driver.findElement(By.id("username")).sendKeys(un); //No hardcoadig here
//
//		driver.findElement(By.name("pwd")).sendKeys(passw);
//
//		driver.findElement(By.xpath("//div[.='Login ']")).click();

	}
	
//	since login done by using @beoremetod, so logout should be done by using @aftermethod only.
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		_2_HomePage hp=new _2_HomePage(driver);
		hp.logout();
	}
	

}
