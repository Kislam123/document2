package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WalmartGrocery {
	
	WebDriver driver;

@Given("^user visits Walmart homepage$")
public void user_visits_Walmart_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.get("https//www.walmart.com/");
   driver.manage().window().maximize();
   Thread.sleep(2000);
   
}

@When("^user clicks on Grocery$")
public void user_clicks_on_Grocery() throws Throwable {

}

@Then("^user should be able to redirect to the Grocery page$")
public void user_should_be_able_to_redirect_to_the_Grocery_page() throws Throwable {

}


}
