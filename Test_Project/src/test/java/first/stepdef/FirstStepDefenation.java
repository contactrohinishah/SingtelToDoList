package first.stepdef;

import java.util.List;
import java.util.Map;

import automation.config.Verify;
import automation_new.GenericFunctions;
import browsers.BrowserFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pom.Login;

public class FirstStepDefenation{
	Login s = new Login();
	GenericFunctions genericFunctions = new GenericFunctions();
	Verify verify;
	
//	FirstStepDefenation()
//	{
//		
//		s= new Login();
//	}
	
	@Given("^As user I should be able to launch the site \"([^\"]*)\"$")
	public void as_user_I_should_be_able_to_launch_the_site(String arg1) throws Throwable {
	    
		s.loginToURL(arg1);
	}
	
	@Then("^I add the do to list \"([^\"]*)\"$")
	public void i_add_the_do_to_list(String arg1) throws Throwable {
	    
		s.addToDoList(arg1);
		Assert.assertEquals(s.getNameOfList(arg1), arg1);
	}
	
	@Then("^I click on active todo list button$")
	public void i_click_on_active_todo_list_button() throws Throwable {
	    
		s.clickActiveButton();
	}
	
	@Then("^I click on completed todo list button$")
	public void i_click_on_completed_todo_list_button() throws Throwable {
	    
		s.clickCompletedButton();
	}
	
	@Then("^I click on all todo list button$")
	public void i_click_on_all_todo_list_button() throws Throwable {
	    
		s.clickAllButton();
	}
	
	@Then("^I click on clearCompleted todo list button \"([^\"]*)\"$")
	public void i_click_on_clear_Completed_todo_list_button(String listName) throws Throwable {
	    
		s.selectEntryfromTodoList(listName);
	}
	
	@Then("^I verify the number Added to List (\\d+)$")
	public void i_verify_the_number_Added_to_List(int number) throws Throwable {
	    
		Assert.assertEquals(s.numberofList(), number);
	}
	
	@And("^I close the browser$")
	public void closeBrowser()
	{
		genericFunctions.closeBrowser();
	}
}
