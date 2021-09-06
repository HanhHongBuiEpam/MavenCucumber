package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/01_Register.feature",
        glue = {"StepDefinitions"},
        tags = "",
        format= {"json:target/cucumber.json"}
)
public class Runner extends AbstractTestNGCucumberTests {

}
