package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/Features/Product.feature",
		glue= {"StepDefinitions","Hooks"},
		plugin= {
				"pretty",
				"html:target/cucumber-report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		tags="",
		monochrome=true
		)

public class ProductPageRunner extends AbstractTestNGCucumberTests{

}
