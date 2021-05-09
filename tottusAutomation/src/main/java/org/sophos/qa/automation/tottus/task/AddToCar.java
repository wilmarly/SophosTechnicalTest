package org.sophos.qa.automation.tottus.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.sophos.qa.automation.tottus.interactions.WaitToLoad;
import org.sophos.qa.automation.tottus.userinterface.AddProductUI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


public class AddToCar implements Task {

	public AddToCar () {
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
							Click.on(AddProductUI.ADD_TO_CAR_BUTTON),
							WaitToLoad.theMiliSeconds(500),
							Click.on(AddProductUI.SELECT_OPTION_DELIVERY),
							WaitToLoad.theMiliSeconds(500),
							Click.on(AddProductUI.SELECT_STORE),
							WaitToLoad.theMiliSeconds(500),
							Click.on(AddProductUI.CONFIRM_BUTTON),
							WaitToLoad.theMiliSeconds(5000),
							Click.on(AddProductUI.SEE_CAR_BUTTON),
							WaitToLoad.theMiliSeconds(5000)

				);
	}
	
	public static AddToCar withShippingMethod () {
		return instrumented(AddToCar.class);

	}

}
