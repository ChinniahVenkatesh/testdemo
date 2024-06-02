package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Features/Homepage.feature:16",
		glue = {"stepDefinitions"},
		monochrome = true,
		//tags = "@smoke and @Reg",
		plugin = {"html:target/cucumber.html","json:target/cucumber.json" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" ,
				}
		)

public class failedtestngrunner extends AbstractTestNGCucumberTests{

}
