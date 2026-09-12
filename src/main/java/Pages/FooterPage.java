package Pages;


import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterPage {

	WebDriver driver;
	Actions action;
	WebDriverWait wait;
	FluentWait<WebDriver> fluentwait;

	public FooterPage(WebDriver driver) {
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


}
