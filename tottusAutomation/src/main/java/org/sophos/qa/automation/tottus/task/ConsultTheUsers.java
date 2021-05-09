package org.sophos.qa.automation.tottus.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.rest.interactions.Get;

import static org.sophos.qa.automation.tottus.utilities.RestService.CONSULT_USERS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultTheUsers implements Task {

    private String consultUsers;
    int page;

    public ConsultTheUsers(int _page) {
    	page = _page;
        this.consultUsers = String.format(CONSULT_USERS.toString(), page);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Get.resource(consultUsers)
        );
    }

    public static ConsultTheUsers ofThePage(int page) {
        return instrumented(ConsultTheUsers.class, page);
    }
}
