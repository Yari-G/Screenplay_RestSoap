package co.com.choucair.services.soaprest.stepdefinitions;

import co.com.choucair.services.soaprest.model.ModelCreateUserRest;
import co.com.choucair.services.soaprest.questions.LastResponseStatusCode;
import co.com.choucair.services.soaprest.tasks.CreateUserRest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import static co.com.choucair.services.soaprest.utils.Constant.VALUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionRestCreateUser {
    @When("^you create an user$")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRests) {
        theActorInTheSpotlight().attemptsTo(CreateUserRest.with(modelCreateUserRests));
    }

    @Then("^I should see the user created$")
    public void iShouldSeeTheUserCreated() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));
    }
}
