package co.com.choucair.services.restsoap2.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = {"src/test/resources/features/soap/add_two_numbers.feature"},
        glue = {"co.com.choucair.services.restsoap2.stepdefinitions",
                "co.com.choucair.services.restsoap2.utils"},
        snippets = CAMELCASE )

public class SoapAddNumbers {
}