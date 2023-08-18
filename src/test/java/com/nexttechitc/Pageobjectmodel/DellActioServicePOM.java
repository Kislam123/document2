package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActioServicePOM {
	
WebDriver driver;
	
	public DellActioServicePOM(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
	
	WebElement Action_Service;
	public WebElement service() {
	return Action_Service;
	}
@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a")
	WebElement Click_ViewallService;
	public WebElement viewallservice() {
	return Click_ViewallService;
}*/
@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/button/span")

	WebElement Action_Support;
	public WebElement support() {
	return Action_Support;
	}
@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/a")

	
	WebElement Click_SupportHome;
	public WebElement supporthome() {
	return Click_SupportHome;
	}
}



