package StepDefinitions;

import Base.BaseTest;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePageSteps extends BaseTest {

	HomePage homepage;

	@Given("User launches Adobe website")
	public void user_launches_Adobe_Website(){
		//product method to launch
		homepage=new HomePage(driver);
		homepage.closeLocationPopup();
	}

	@Then("Adobe homepage should be displayed")
	public void is_Adobe_homepage_displayed() {
		homepage.isHomePageVisible();
		//Assert.assertTrue(homepage.isHomePageVisible());
	}

	@Then("Adobe logo should be visible")
	public void is_logo_visible() {
		homepage.isLogoDisplayed();
		//Assert.assertTrue(homepage.isLogoDisplayed());
	}

	@Then("navigation menu should be visible")
	public void is_navigation_menu_visible() {
		homepage.isNavigationMenuDisplayed();
		//Assert.assertTrue(homepage.isNavigationMenuDisplayed());
	}

	@Then("Sign In option should be displayed")
	public void is_SignIn_option_visible() {
		homepage.isSignInOptionDisplayed();
		//Assert.assertTrue(homepage.isSignInOptionDisplayed(),"Sign In options is Visible");
	}

	@Then("Plans and Pricing option should be displayed")
	public void is_Plan_and_Pricing_option_visible() {
		homepage.isPlanAndPricingDisplayed();
		//Assert.assertTrue(homepage.isPlanAndPricingDisplayed());
	}

	@Then("footer section should be visible")
	public void is_Footer_visible() {
		homepage.isFooterDisplayed();
		//Assert.assertTrue(homepage.isFooterDisplayed());
	}

}
