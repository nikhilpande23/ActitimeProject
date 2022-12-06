package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class _2_HomePage {
//	1. Declearation
	@FindBy(id="logoutLink")
	private WebElement lgoutlnk;
	
	@FindBy (xpath = "//div[.='Tasks']")
	private WebElement tasklnk;
	
	@FindBy (xpath = "//div[.='Reports']")
	private WebElement reportlnk;
	
	@FindBy (xpath = "//div[.='Users']")
	private WebElement userlnk;
	
//	2.Intiallization
	public _2_HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
// Taken gatters methods
	public WebElement getLgoutlnk() {
		return lgoutlnk;
	}

	public WebElement getTasklnk() {
		return tasklnk;
	}

	public WebElement getReportlnk() {
		return reportlnk;
	}

	public WebElement getUserlnk() {
		return userlnk;
	}
	
//	creating Genaralized method
	public void logout() {
		lgoutlnk.click();
	}
	
	public void report() {
		reportlnk.click();
	}
	
	public void tasklnk() throws InterruptedException {
		tasklnk.click();
		Thread.sleep(1000);
	}
	

}
