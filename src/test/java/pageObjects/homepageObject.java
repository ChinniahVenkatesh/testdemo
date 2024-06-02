package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

public class homepageObject {
	
	public WebDriver driver;
	
	public homepageObject(WebDriver driver)
	{
		this.driver = driver;
		//PageFactory.initElements(driver,this);
	}
	
	By logo = By.cssSelector("div[class='brand greenLogo']");
	
	public WebElement logo()
	{
		return driver.findElement(logo);
	}
	
	
	
	
	
	
	
	
	

}
