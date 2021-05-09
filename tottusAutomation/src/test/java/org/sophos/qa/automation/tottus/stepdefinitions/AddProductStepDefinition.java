package org.sophos.qa.automation.tottus.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import org.hamcrest.Matchers;
import org.sophos.qa.automation.tottus.driver.Driver;
import org.sophos.qa.automation.tottus.exceptions.UnsuccessfullAddProductToCar;
import org.sophos.qa.automation.tottus.questions.ValidationAddProductSuccessfully;
import org.sophos.qa.automation.tottus.task.AddToCar;
import org.sophos.qa.automation.tottus.task.Search;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class AddProductStepDefinition {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(Cast.ofStandardActors()); // para poder utilizar los actorea ntes de saber el nombre que tendra el actor 
	};
	
	@Given("^The customer is looking for a product in tottus$")
	public void theCustomerIsLookingForAProductInTottus(List<String> info) {
		
		Driver.web();
		theActorCalled(info.get(0)).whoCan(BrowseTheWeb.with(Driver.inThePage("https://www.tottus.com.pe/tottus/")));
		theActorInTheSpotlight().attemptsTo(Search.forProductInSection(info.get(1),info.get(2)));

    }


    @When("^the customer adds the product to the cart$")
    public void theCustomerAddsTheProductToTheCart() {
    	theActorInTheSpotlight().attemptsTo(AddToCar.withShippingMethod());

    }

    @Then("^The user must see the selected product in the shopping cart$")
    public void theUserMustSeeTheSelectedProductInTheShoppingCart(List<String> info) {
    	
		theActorInTheSpotlight().should(seeThat(ValidationAddProductSuccessfully.successMessage(info.get(0)), Matchers.is(true))
				.orComplainWith(UnsuccessfullAddProductToCar.class,UnsuccessfullAddProductToCar.UNSECCESSFULL_ADD_TO_CAR_MESSAGE));

    }
}
