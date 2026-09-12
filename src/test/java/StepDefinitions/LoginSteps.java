package StepDefinitions;

import Base.BaseTest;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends BaseTest{

	LoginPage loginpage;

	@Given("User navigates to Adobe login page")
	public void user_navigates_to_Adobe_login_page() {

	}

//	@Scenario("Login with valid credentials")

	@When("User enters a valid email address")
	public void user_enters_a_valid_email_address() {

	}

	@And("User clicks Continue")
	public void user_clicks_continue_with_valid_credentials() {

	}

	@And("User enters a valid password")
	public void user_enters_a_valid_password() {

	}

	@And("User clicks Sign In")
	public void user_clicks_sign_in() {

	}

	@Then("User should be logged into Adobe account")
	public void user_should_be_logged_into_Adobe_account() {

	}



//    @Scenario("Login with invalid email")

	@When("User enters an invalid email address")
	public void user_enters_an_invalid_email_address() {

	}

	@And("User clicks Continue")
	public void user_clicks_continue_with_invalid_email() {

	}

	@Then("appropriate email validation message should be displayed")
	public void appropriate_email_validation_message_should_be_displayed() {

	}


//    @Scenario("Login with empty email")

	@When("User leaves email field blank")
	public void user_leaves_email_field_blank() {

	}

	@And("User clicks Continue")
	public void user_clicks_continue_with_empty_email() {

	}

	@Then("email required validation message should be displayed")
	public void email_required_validation_message_should_be_displayed() {
	}


//    @Scenario("Login with invalid password")

	@When("User enters a valid email address")
	public void user_enters_a_valid_email_address_with_invalid_password() {

	}

	@And("User clicks Continue")
	public void user_clicks_continue_with_invalid_passowrd() {

	}

	@And("User enters an invalid password")
	public void user_enters_an_invalid_password() {

	}

	@And("User clicks Sign In")
	public void user_clicks_sign_in_with_invalid_password() {

	}

	@Then("login should fail with appropriate error message")
	public void login_should_fail_with_appropriate_error_message() {

	}


//    @Scenario("Verify Forgot Password functionality")

	@When("User clicks Forgot Password option")
	public void user_clicks_forget_password_option() {

	}

	@Then("password recovery page should be displayed")
	public void password_recovery_page_should_be_displayed() {

	}
}
