package com.actitime.Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class webdrivermetods {
	
	public void selecdrop(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
}
