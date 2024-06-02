package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserSetup {
	
	public WebDriver driver;
	
	public WebDriver browser()
	{
		
		String browser = "chrome";
		switch(browser)
		{
		case "chrome":
			return driver = new ChromeDriver();
		default:
			return driver;
		}
		
	}

}
