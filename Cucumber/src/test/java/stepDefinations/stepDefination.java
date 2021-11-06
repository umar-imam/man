package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;



public class stepDefination {


	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("AAAA");
	  
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("AAAA");
	  
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("AAAA");
	   
	}
	 @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	    }
	 

	 @Then("^Cards diplayed are \"([^\"]*)\"$")
	 public void cards_diplayed_are(String arg1) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     System.out.println(arg1);
	 }

}