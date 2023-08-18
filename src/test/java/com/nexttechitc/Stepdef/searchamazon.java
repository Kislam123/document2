package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.searchamazonPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchamazon {
	
	WebDriver driver;

	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");	
	    driver=new ChromeDriver();
	    
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

	@When("^user types \"([^\"]*)\" and click search icon$")
	public void user_types_and_click_search_icon(String arg1) throws Throwable {
		
		searchamazonPOM search = new searchamazonPOM(driver);
		search.Amazonsearch().sendKeys(arg1);
	   Thread.sleep(3000);
	   search.Searchicon().click();
	}

	@Then("^user should be able to see the expected product$")
	public void user_should_be_able_to_see_the_expected_product() throws Throwable {
		driver.quit();
	    
	}


}
