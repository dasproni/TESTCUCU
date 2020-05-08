package test;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featur",
        glue = "stepdefs",
        tags = {"@Test", "@Test1 "},
        snippets = SnippetType.UNDERSCORE
)
public class MyTestRunner {


}