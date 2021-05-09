package org.sophos.qa.automation.tottus.questions;

import org.sophos.qa.automation.tottus.interactions.WaitElement2;

import org.sophos.qa.automation.tottus.userinterface.AddProductUI;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidationAddProductSuccessfully implements Question<Boolean> {


	String product;

	
	public ValidationAddProductSuccessfully (String _product) {
		this.product = _product;
	}
		
	
	@Override
	public Boolean answeredBy(Actor actor) {

		
		actor.attemptsTo(WaitElement2.untilAppears(AddProductUI.SEE_PRODUCT_IN_CAR.of(product)));
		return Visibility.of(AddProductUI.SEE_PRODUCT_IN_CAR.of(product)).viewedBy(actor).asBoolean();
		
	}

	public static ValidationAddProductSuccessfully successMessage(String product) {
		return new ValidationAddProductSuccessfully(product);
	}
}
