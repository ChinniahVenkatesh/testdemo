package stepDefinitions;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homepageObject;
import utilities.dependencyInjection;



public class homepage {
	public dependencyInjection di;
	public WebDriver driver;
	public homepageObject ho;
	public Properties p;
	
	public homepage(dependencyInjection di)
	{
		this.di = di;
	}
	
	
	
	@Given("User is on the greenkart homepage {string}")
	public void user_is_on_the_greenkart_homepage(String string) {
	   
	   Assert.assertEquals(this.di.driver.getCurrentUrl(),string);
	   
	   
	}

	@When("Maximize the home_page")
	public void maximize_the_home_page() {
		//this.di.driver.manage().window().maximize();
	}

	@Then("Validate the greenkart logo is displayed or not")
	public void validate_the_greenkart_logo_is_displayed_or_not() {
		ho = new homepageObject(this.di.driver);
		boolean displayed = ho.logo().isDisplayed();
		Assert.assertEquals(displayed,true);
		
	}

	@Then("Validate the greenkart logo is clickable")
	public void validate_the_greenkart_logo_is_clickable() {
	  Assert.assertEquals(ho.logo().getTagName(),"div");
	}
	
	@When("User locates the searchbox field")
	public void user_locates_the_searchbox_field() throws IOException {
		
		String path = System.getProperty("user.dir")+"//locators.properties";
	    FileInputStream fis = new FileInputStream(path);
		p = new Properties();
		p.load(fis);
		this.di.driver.findElement(By.xpath(p.getProperty("searchbox")));
	}
	@Then("Enter the product name {string}")
	public void enter_the_product_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		this.di.driver.findElement(By.xpath(p.getProperty("searchbox"))).sendKeys(string);
		//Assert.assertEquals(true,false);
		
	}

	
	

}