package org.sophos.qa.automation.tottus.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.sophos.qa.automation.tottus.interactions.WaitToLoad;
import org.sophos.qa.automation.tottus.userinterface.AddProductUI;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Search implements Task {
	
	String section;
	String product;

	
	public Search (String _section, String _product) {
		this.section = _section;
		this.product = _product;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		

		
		actor.attemptsTo(
							Click.on(AddProductUI.CLOSE_START_WINDOW),
						    WaitToLoad.theMiliSeconds(500),
							Scroll.to(AddProductUI.SELECT_SECTION.of(section)),
							Click.on(AddProductUI.SELECT_PRODUCT.of(product)),
							WaitToLoad.theMiliSeconds(500)
							);
		
	}
	
	public static Search forProductInSection(String section,String product) {
		return instrumented(Search.class, section, product);

	}

}
