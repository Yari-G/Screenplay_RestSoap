package co.com.choucair.services.restsoap2.stepdefinitions;

import co.com.choucair.services.restsoap2.questions.LastResponseStatus;
import co.com.choucair.services.restsoap2.tasks.AddNumbers;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionsSoapAddNumbers {
    @When("^you add two number$")
    public void youAddTwoNumber(List<String>values) {
        theActorInTheSpotlight().attemptsTo(AddNumbers.with(values));
    }

    @Then("^I should see the response of the service is (\\d+)$")
    public void iShouldSeeTheResponseOfTheServiceIs(int code) {
        theActorInTheSpotlight().should(
                seeThat("last response status code is 200",
                        LastResponseStatus.isEqualsTo(code))
        );
    }
}
