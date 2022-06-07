package first.stepdef;

import automation.config.TestConfig;
import automation_new.GenericFunctions;
import cucumber.api.java.en.Then;

public class TestJava { 
	
	public GenericFunctions genericFunctions;
	
	public TestJava()
	{
		genericFunctions = new GenericFunctions();
	}
	
	@Then("^I launch webSite$")
	public void i_launch_webSite() throws Throwable {
		String url = TestConfig.valueFor("url"); 
		System.out.println(url);
		genericFunctions.navigateToUrl(url);
	}
	
	
}
