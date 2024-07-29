package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mainSteps {
	
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User landed in NetBanking Page");
	}
//	@When("User login into application with {string} and password {string}")
//	public void user_login_into_application(String Username,String Password) {
//	    // Write code here that turns the phrase above into concrete actions
//		 
//		System.out.println(Username+"and password is"+" "+Password);
//	}
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application(String Username,String Password) {
	    // Write code here that turns the phrase above into concrete actions
		 
		System.out.println(Username+"and password is"+" "+Password);
	}
	
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Home Page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Cards are displayed");
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
		 System.out.println("User lon Practice landing page");
	}

	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
	   System.out.println(data.get(0));
	   System.out.println(data.get(1));
	   System.out.println(data.get(2));
	   System.out.println(data.get(3));
	}
	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {
		System.out.println("**************************");
		System.out.println("setup the entries in database");
	}
	@Given("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
		System.out.println("launch the browser from config variables");
	}
	@Given("Hit the home page url of banking site")
	public void hit_the_home_page_url_of_banking_site() {
		System.out.println("Hit the home page url of banking site");
	}
}
