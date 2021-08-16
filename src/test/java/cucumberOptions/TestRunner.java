package cucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber;
//
//import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
features="src/test/java/features",
glue="stepDefinitions")

public class TestRunner {

}
