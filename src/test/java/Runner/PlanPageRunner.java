package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/tst/resources/Features/Plan.feature",
		glue= {"StepDefinitions","Hooks"},
		plugin= {
				"pretty",
				"html:target/cucumber-report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		tags="@Smoke",
		monochrome=true
		)

public class PlanPageRunner extends AbstractTestNGCucumberTests {

}
