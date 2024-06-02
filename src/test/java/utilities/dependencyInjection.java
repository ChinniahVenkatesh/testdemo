package utilities;

import org.openqa.selenium.WebDriver;

public class dependencyInjection {
	
	public WebDriver driver;
	
	public dependencyInjection()
	{
		browserSetup bs = new browserSetup();
		driver = bs.browser();
	}

}
