package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonBestsellerPOM;
import com.nexttechitc.Pageobjectmodel.AmazonregistryPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbestseller {
	
	WebDriver driver;
	

@Given("^user visits Amazon homepage$")
public void user_visits_Amazon_homepage() throws Throwable {
	//How to open browser
System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
    driver = new ChromeDriver();
    
    //How open url
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}

@When("^user clicks on Bestseller$")
public void user_clicks_on_Bestseller() throws Throwable {
	
	AmazonBestsellerPOM ser=new AmazonBestsellerPOM(driver);
	ser.Amazonbestseller().click();
	
	Thread.sleep(3000);
    
   
}

@Then("^user should be able to redirect to the Bestseller page$")
public void user_should_be_able_to_redirect_to_the_Bestseller_page() throws Throwable {
	driver.quit();
    
}


	

}
