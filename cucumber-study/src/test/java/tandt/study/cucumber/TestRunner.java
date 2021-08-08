package tandt.study.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"tandt.study.cucumber"/*, "vinid.keyword.steps"*/},
        tags = "@Cucumber-Scenario01",
        plugin = {"html:target/cucumber-report.html", "json:target/cucumber-report.json"}
)
public class TestRunner {
}
