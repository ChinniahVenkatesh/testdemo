package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.dependencyInjection;

public class hooks {
	
	public dependencyInjection di;
	
	   public hooks(dependencyInjection di)
	   {
		   this.di = di;
	   }
	
       @Before
       public void test()
       {
    	   this.di.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    	   this.di.driver.manage().window().maximize();
       }

       @After
       public void test1() throws InterruptedException
       {
    	   Thread.sleep(1000);
    	   this.di.driver.close();
    	   Thread.sleep(1000);
       }
       
       @AfterStep
       public void test2(Scenario scenario)
       {
    	   System.out.println(scenario.getStatus());
       }
}
