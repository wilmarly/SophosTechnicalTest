package org.sophos.qa.automation.tottus.stepdefinitions;

import java.util.List;

import org.sophos.qa.automation.tottus.task.ConsultTheUsers;
import org.sophos.qa.automation.tottus.questions.LastResponseStatusCode;


import static org.sophos.qa.automation.tottus.utilities.RestService.BASE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class RestAssuredStepDefinition {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(Cast.ofStandardActors());
	};
	
    @Given("^request the users of the page$")
    public void requestTheUsersOfThePage(List<String> info) {
      
    	theActorCalled(info.get(0)).whoCan(CallAnApi.at(BASE_URL.toString()));
    	theActorInTheSpotlight().attemptsTo(ConsultTheUsers.ofThePage(Integer.parseInt(info.get(1))));
    }


    @Then("^I should have code response$")
    public void iShouldHaveResponse(List<String> info) {
        	theActorInTheSpotlight().should(seeThat("last response status code is 200" , LastResponseStatusCode.is(Integer.parseInt(info.get(0)))));

    }
}
    
