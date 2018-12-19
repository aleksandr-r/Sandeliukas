


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/CucumberTests",
		glue="StepDefinitions",
		plugin = {"pretty", "html:target/cucumber"}
)

public class TestRunner {
}
