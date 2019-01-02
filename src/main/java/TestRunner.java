


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/CucumberTests/",
		glue="StepDefinitions",
		format = { "pretty","html: cucumber-html-reports",
				"json: cucumber-html-reports/cucumber.json" },
		tags ={"@mainTests"}
)

public class TestRunner {
}
