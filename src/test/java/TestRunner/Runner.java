package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Features"},
        glue = {"StepDefinitions"},
        tags = "",
        plugin = {"pretty","html:./Report/CucumberReport.html"},
        monochrome = true)

public class Runner extends AbstractTestNGCucumberTests {
}
