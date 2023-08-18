package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchamazonPOM {
	
	WebDriver driver;
	//We have to make constructor
	//it is not a method but special types of method.it name is same class name
	//it has no return type
	public searchamazonPOM(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	//@FindBy(name="fields-keywords")
	@FindBy(id="twotabsearchtextbox")
	WebElement Type_amazonsearch;
	
	public WebElement Amazonsearch() {
		return Type_amazonsearch;
	}
	
	@FindBy(id="nav-search-submit-button")
	WebElement Click_searchicon;
	
	public WebElement Searchicon() {
		return Click_searchicon;

}
}