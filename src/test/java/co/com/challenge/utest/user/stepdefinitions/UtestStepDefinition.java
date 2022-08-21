package co.com.challenge.utest.user.stepdefinitions;

import co.com.challenge.utest.user.model.UtestData;
import co.com.challenge.utest.user.questions.CompleteSetup;
import co.com.challenge.utest.user.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Jose Luis wishes to register on the Utest page$")
    public void thanJoseLuisWishesToRegisterOnTheUtestPage() {
        OnStage.theActorCalled("Jose Luis")
                .wasAbleTo(OpenUp.thePage());
    }

    @When("^the user enters the data required by the system$")
    public void theUserEntersTheDataRequiredByTheSystem(List<UtestData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.fill(data),
                Address.getAddress(data), Devices.getDevices(data), Setup.lastSetup(data)

        );
    }

    @Then("^the registration is completed when you see the Complete Setup button$")
    public void theRegistrationIsCompletedWhenYouSeeTheCompleteSetupButton(List<UtestData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompleteSetup.allComplet(data)));
    }
}
