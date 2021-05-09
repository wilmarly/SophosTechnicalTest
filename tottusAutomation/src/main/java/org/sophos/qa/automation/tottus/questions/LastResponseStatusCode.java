package org.sophos.qa.automation.tottus.questions;

import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class LastResponseStatusCode {

	int code;
	
	public LastResponseStatusCode (int _code) {
		this.code = _code;
	}
	
	
    public static Question<Boolean> is(int code){
        return a -> lastResponse().statusCode() == code;
    }
    
    
	public static LastResponseStatusCode code (int code) {
		return new LastResponseStatusCode(code);
	}
}
