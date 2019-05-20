package example.test;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\smirnovaea\\IdeaProjects\\XML_To_JSON\\src\\test\\resources\\cucumber\\features\\CucumberTest.feature",
        glue = "example.test.glue",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE
)
public class CucumberRunnerTest {
}
