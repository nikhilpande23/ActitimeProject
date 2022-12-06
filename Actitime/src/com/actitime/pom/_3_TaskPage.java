package com.actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.Generic._4_ReadDataFromExcel;

public class _3_TaskPage {
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy (xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy (xpath="(//textarea[@class='textarea'])[9]")
	private WebElement description;
	
	@FindBy (xpath="//div[@class='emptySelection']")
	private WebElement dropdown;
	
	@FindBy (xpath="(//div[@class='itemRow cpItemRow '])[3]")
	private WebElement bbcompany;
	
	@FindBy (xpath="(//div[@class='components_button_label'])[17]")
	private WebElement createcustbutton;

	public WebElement getDescription() {
		return description;
	}
	
	public WebElement getDropdown() {
		return dropdown;
	}
	
	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}
	public WebElement getBbcompany() {
		return bbcompany;
	}
	
	public WebElement getCreatecustbutton() {
		return createcustbutton;
	}
	
	public _3_TaskPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createnew() throws EncryptedDocumentException, IOException {
	
		addnew.click();
		newcust.click();
		_4_ReadDataFromExcel r=new _4_ReadDataFromExcel();
		String name = r.readDataFromExcelFile("Sheet1", 1, 1);
		custname.sendKeys(name);
		description.sendKeys("Banking");
		dropdown.click();
		bbcompany.click();
		createcustbutton.click();
		
	}

	
	

}
