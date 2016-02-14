
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, 
		plugin = {"pretty", "html:target/site/cucumber","json:target/cucumber.json" }, 
		tags = { "~@ignore" })
public class CalculatorTest {

}
