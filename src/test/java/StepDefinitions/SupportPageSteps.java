package StepDefinitions;

import Pages.SupportPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SupportPageSteps {

	SupportPage supportpage;

	//Background:
	@Given("User navigates to Adobe Support page")
	public void user_navigates_to_Adobe_Support_page() {

	}

	 //Scenario: Verify Support page loads successfully
	 @Then("Adobe Support page should be displayed")
	 public void adobe_support_page_should_be_displayed() {

	 }

	  //Scenario: Verify support categories are displayed
	  @Then("support categories should be visible")
	  public void support_categories_should_be_visible() {

	  }

	  //Scenario: Verify Account support section
	  @Then("Account support section should be displayed")
	  public void account_support_section_should_be_displayed() {

	  }

	  //Scenario: Verify Plans and Billing support section
	  @Then("Plans and Billing support section should be displayed")
	  public void plans_and_billing_support_section_should_be_displayed() {

	  }

	  //Scenario: Verify application support section
	  @Then("application support options should be displayed")
	  public void application_support_options_should_be_displayed() {

	  }

	  //Scenario: Search for support content
	  @When("User searches for support topic")
	  public void user_searches_for_support_topic() {

	  }

	  @Then("relevant support articles should be displayed")
	  public void relevant_support_articles_should_be_displayed() {

	  }

}
