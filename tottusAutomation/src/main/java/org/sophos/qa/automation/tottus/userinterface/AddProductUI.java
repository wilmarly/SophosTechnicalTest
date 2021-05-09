package org.sophos.qa.automation.tottus.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddProductUI {

	public static final Target CLOSE_START_WINDOW = Target.the("button close start window")
			.locatedBy("//header/button[1]");
	
	public static final Target SELECT_SECTION = Target.the("preferred section")
			.locatedBy("//div[contains(text(),'{0}')]");
	
	public static final Target NEXT_BUTTON = Target.the("next button")
			.locatedBy("//button[2]/img[1]");
	
	public static final Target SELECT_PRODUCT = Target.the("select the product")
			.locatedBy("//h2[contains(text(),'{0}')]");
	
	public static final Target ADD_TO_CAR_BUTTON = Target.the("add to car button")
			.locatedBy("//button[contains(text(),'Agregar al carro')]");
	
	public static final Target SELECT_OPTION_DELIVERY = Target.the("select option delivery")
			.locatedBy("//button[1]//*[contains(text(),'Retiro en tienda')]");
			
	public static final Target SELECT_STORE = Target.the("Select store")
			//.locatedBy("//div[8]//*[contains(text(),'8')]");
			.locatedBy("//button[1]//*[contains(text(),'Sodimac Angamos')]");
	
	public static final Target CONFIRM_BUTTON = Target.the("confirm button")
			.locatedBy("//button//*[contains(text(),'Confirmar')]");
	
	public static final Target SEE_CAR_BUTTON = Target.the("see car button")
			.locatedBy("//*[@id='tottus_productcart']");
	
	public static final Target SEE_PRODUCT_IN_CAR = Target.the("See product in cart")
			.locatedBy("//span[contains(.,'{0}')]");
	
}
