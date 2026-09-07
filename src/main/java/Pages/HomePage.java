package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HomePage {
	
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
	FluentWait<WebDriver> fluentwait;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		this.fluentwait=new FluentWait<>(driver)
						.withTimeout(Duration.ofSeconds(10))
						.pollingEvery(Duration.ofSeconds(2))
						.ignoring(NoSuchElementException.class)
						.ignoring(StaleElementReferenceException.class);
		this.action=new Actions(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//h3[text()='This Adobe site does not match your location.']/ancestor::div[@class='dialog-modal region-modal']//button")
	WebElement RemovingPopUp;
	
	@FindBy(xpath="//div[@class='router-marquee']")
	WebElement HeroSection;
	
	@FindBy(xpath="//div[@class='feds-backdrop']/ancestor::header[@class='global-navigation']//div[@class='feds-brand-container feds-dark-bg']//span[@class='feds-brand-image desktop-brand']")
	WebElement Logo;
	
	@FindBy(xpath="//div[@class='feds-backdrop']/ancestor::header[@class='global-navigation']")
	WebElement NavigationMenu;
	
	@FindBy(xpath="//div[@class='unav-comp-profile unav-comp-theme-spectrum-2']/ancestor::div[@class='feds-utilities']//button")
	WebElement SignInButton;
	
	@FindBy(xpath="//li[@id='feds-menu-wrapper']/ancestor::header[@class='global-navigation']//li//a[text()='Plans']")
	WebElement PlanPricingButton;
	
	@FindBy(xpath="//footer[@class='global-footer' and @data-block-status='loaded']")
	WebElement footer;
	
	public void closeLocationPopup() {
		
		try {
			wait.until(ExpectedConditions.visibilityOf(RemovingPopUp));
			RemovingPopUp.click();
			
			System.out.println("HomePage pop up closed Successfully.");
		}
		catch(TimeoutException e) {
			System.out.print("Location pop up wasn't displayed.");
		}
		catch(Exception e) {
			System.out.println("Unable to close popUp.");
			e.printStackTrace();
		}
	}
	
	
	public boolean isHomePageVisible() {
		try {
			return wait.until(ExpectedConditions.visibilityOf(HeroSection)).isDisplayed();
		}
		catch(Exception e) {
			System.out.println("Home Page isn't visible");
			return false;
		}
		
	}
	
	
	public boolean isLogoDisplayed() {
		
		try {
			return wait.until(ExpectedConditions.visibilityOf(Logo)).isDisplayed();
		}
		catch(Exception e) {
			System.out.println("Logo isn't visible");
			return false;
		}
		
	}
	
	public boolean isNavigationMenuDisplayed() {
		try {
			return wait.until(ExpectedConditions.visibilityOf(NavigationMenu)).isDisplayed();
		}
		catch(Exception e) {
			System.out.println("Navigation Menu isn't displayed");
			return false;
		}
	}
	
	public boolean isSignInOptionDisplayed() {
		try {
			return wait.until(ExpectedConditions.visibilityOf(SignInButton)).isDisplayed();
		}
		catch(Exception e) {
			System.out.println("Sign-In option isn't Displayed");
			return false;
		}
	}
	
	public boolean isPlanAndPricingDisplayed() {
		try {
			return wait.until(ExpectedConditions.visibilityOf(PlanPricingButton)).isDisplayed();
		}
		catch(Exception e) {
			System.out.println("Plan and Pricing not Visible");
			return false;
		}
	}
	
	public boolean isFooterDisplayed() {
		try {
			return wait.until(ExpectedConditions.visibilityOf(footer)).isDisplayed();
		}
		catch(Exception e) {
			System.out.println("Footer isn't displayed");
			return false;
		}
	}
		
	
}
