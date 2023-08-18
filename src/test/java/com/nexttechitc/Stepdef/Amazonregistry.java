package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonregistryPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonregistry {
	
	WebDriver driver;
	

@Given("^user open amazon homepage$")
public void user_open_amazon_homepage() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
   driver = new ChromeDriver();
   
   driver.get("https://www.amazon.com");
   driver.manage().window().maximize();
   Thread.sleep(3000);
}

@When("^user clicks Registry$")
public void user_clicks_Registry() throws Throwable {
	
	AmazonregistryPOM ser=new AmazonregistryPOM(driver);
	ser.Amazonregistry().click();
	
	Thread.sleep(3000);
    
}

@Then("^user able to redirect to the Registry page$")
public void user_able_to_redirect_to_the_Registry_page() throws Throwable {
	driver.quit();
   
}


}
