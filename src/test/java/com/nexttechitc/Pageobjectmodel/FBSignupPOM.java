package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignupPOM {
	

	WebDriver driver;
	
	public FBSignupPOM(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")

	WebElement edit_Firstname;
	public WebElement firstname() {
	return edit_Firstname;
	}


@FindBy(name="lastname")

WebElement edit_Lastname;
public WebElement lastname() {
return edit_Lastname;
	
	}

@FindBy(name="reg_email__")

WebElement edit_emailaddress;
public WebElement emailaddress() {
return edit_emailaddress;
}
	
@FindBy(id="password_step_input")

WebElement edit_newpassword;
public WebElement editnewpassword() {
return edit_newpassword;
}

@FindBy(xpath="//*[@id=\"month\"]")
public WebElement click_month;

@FindBy(id="day")
public WebElement click_day;

@FindBy(id="year")
public WebElement click_year;



}