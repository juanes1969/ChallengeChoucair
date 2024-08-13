package co.com.choucair.certificacion.challengeChoucair.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/example_feature.feature",
        glue = "co.com.choucair.certificacion.challengeChoucair.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = true

)

public class RunnerExample {
}
