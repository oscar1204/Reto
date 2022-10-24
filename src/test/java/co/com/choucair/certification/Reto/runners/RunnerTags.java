package co.com.choucair.certification.Reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/demo.feature",
tags = "@tag1",
glue = "co.com.cartouche.certification.Reto.step-definitions",
snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
