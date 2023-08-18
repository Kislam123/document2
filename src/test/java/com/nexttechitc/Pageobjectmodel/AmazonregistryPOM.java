package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonregistryPOM {
	
	WebDriver driver;
	
	public AmazonregistryPOM(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href=\"/gp/browse.html?node=16115931011&ref_=nav_cs_registry\"]")
			
WebElement Click_Amazonregistry;
public WebElement Amazonregistry() {
return Click_Amazonregistry;
}
}
