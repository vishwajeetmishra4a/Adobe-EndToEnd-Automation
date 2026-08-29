package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.*;

public class BaseTest {

	public static WebDriver driver;
	
	Scanner sc=new Scanner(System.in);
	
	String url="https://www.adobe.com/";
	String browser = System.getProperty("browser", "chrome");
	
	public void initialization() {
	
		
		switch(browser.toLowerCase()) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			
			case "edge":
				driver=new EdgeDriver();
				break;
			
			case "firefox":
				driver=new FirefoxDriver();
				break;
				
			default:
				throw new RuntimeException("Invalid or Browser not Supported: "+browser);
				
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void conclude() {
		if(driver!=null) {
			System.out.println("Closing the Browser...............!");
			driver.quit();
		}
	}
	
	
}