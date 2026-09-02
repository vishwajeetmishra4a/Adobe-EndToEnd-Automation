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
	
	
	
	
}
