package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.DellActioServicePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellActionService {
	
	WebDriver driver;
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.dell.com/en-us");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

	@When("^user go to service dropdown and able to see View All Service$")
	public void user_go_to_service_dropdown_and_able_tosee_View_All_Service() throws Throwable {
		/*Actions act=new Actions(driver);
		DellActioServicePOM ser=new DellActioServicePOM(driver);
		act.moveToElement(ser.service()).build().perform();
		Thread.sleep(5000);
		ser.viewallservice().click();
		
	}*/
	Actions act=new Actions(driver);
	DellActioServicePOM ser=new DellActioServicePOM(driver);
	act.moveToElement(ser.support()).build().perform();
	Thread.sleep(3000);
	ser.supporthome().click();
	
}
	@Then("^user redirects to View All service$")
	public void user_redirects_to_View_All_service() throws Throwable {
		
		driver.quit();
	   
	}



}
