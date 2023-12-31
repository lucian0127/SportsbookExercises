package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features.home",
        glue = {"stepdefs", "hooks"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    public Object[][] scenario()
    {
        return super.scenarios();
    }
}
