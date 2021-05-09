package org.sophos.qa.automation.tottus.exceptions;

@SuppressWarnings("serial")
public class UnsuccessfullAddProductToCar  extends AssertionError  {
	
	public static final String UNSECCESSFULL_ADD_TO_CAR_MESSAGE =  "No se ha podido agregar el producto al carro"; 
	
	public UnsuccessfullAddProductToCar(String message) {
		super(message);//inicializar la clase base excepciones antes de que java lo haga con un metodo sin parametros
	}
	
	public UnsuccessfullAddProductToCar(String message, Throwable cause) {
		super(message,cause);
	}
	
}
