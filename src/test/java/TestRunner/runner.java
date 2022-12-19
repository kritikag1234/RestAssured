package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"Test"},
        features = {"/src/test/resources/functionalTests"},
        glue = {"stepDefinitions"},
        monochrome = true,
        strict = true
)
public class runner {
}
