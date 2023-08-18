package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazoncustomerservicePOM {
	

	WebDriver driver;
	
	public AmazoncustomerservicePOM(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice\"]" ) 
			
			
WebElement Click_Amazoncustomerservice;
public WebElement Amazoncustomerservice() {
return Click_Amazoncustomerservice;

}
}