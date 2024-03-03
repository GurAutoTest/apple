package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefinations" }, 
monochrome = true,
plugin = { "pretty", "html:target/Htmlreports/cucumber.html", "json:target/Jsonreports/cucumber.json", "junit:target/Xmlßreports/cucumber.xml" }

)
public class testrunner {

}
