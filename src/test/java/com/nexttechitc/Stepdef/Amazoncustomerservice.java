package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonBestsellerPOM;
import com.nexttechitc.Pageobjectmodel.AmazoncustomerservicePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazoncustomerservice {
	
	WebDriver driver;
	

@Given("^user open Amazon homepage$")
public void user_open_Amazon_homepage() throws Throwable {
	//How to open browser
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    //How open url
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
   
}

@When("^user clicks on customer service$")
public void user_clicks_on_customer_service() throws Throwable {
	AmazoncustomerservicePOM ser=new AmazoncustomerservicePOM(driver);
	ser.Amazoncustomerservice().click();
    
}

@Then("^user should be able to redirect to the customer service page$")
public void user_should_be_able_to_redirect_to_the_customer_service_page() throws Throwable {

}



}
