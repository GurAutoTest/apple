package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside given >>>>>>>>>>>>>>>>>>>>>>>>>>>");
//		throw new io.cucumber.java.PendingException();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside when >>>>>>>>>>>>>>>>>>>>>>>>>>>");
//		throw new io.cucumber.java.PendingException();
	}

	@And("click on login button")

	public void click_on_login_button() {
		System.out.println("inside and >>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}

	@Then("user is naviagted to home page")
	public void user_is_naviagted_to_home_page() {
		System.out.println("inside then >>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}

}
