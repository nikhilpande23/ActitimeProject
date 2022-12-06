package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _1_LoginPage {
	
//	why used findby bcoz if page fails by wrong id pass , page will refresh and address is being change so use this
//	@finby work same as findelemens works
//	after wrong pass username driver.finelements will not able to locate thats why using @Findby 
	
//	1. Deleclarion - follow steps 
	@FindBy (id="username")
	private WebElement untbx;
	
	@FindBy (name ="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;
	
//	2.Intitiallizaion
	public _1_LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this); //PageFactory is class to use POM. initElements is static method hence callng by class name. 
//		If we do like public _1_LoginPage (WebDriver driver) there will error bcoz they dont no what is driver
		
//		this = will take driver and wll provide it to the above program for execution
	}
	
//	after this goto source -->Generte gatters and setters ---> get all getters

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
// do it to take all info to the base class
	
//	creating gereric method to use following data into base class---> in @before method
//	means creting non static method
	public void logintoActitime(String un, String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
	
//	after this go to base class --> @before method
	
	
	

}
