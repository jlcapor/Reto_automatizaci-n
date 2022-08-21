package co.com.challenge.utest.user.tasks;

import co.com.challenge.utest.user.model.UtestData;
import co.com.challenge.utest.user.userinterface.LastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Setup implements Task {

    private List<UtestData> data;

    public Setup(List<UtestData> data) {
        this.data = data;
    }

    public static Setup lastSetup(List<UtestData> data) {
        return Tasks.instrumented(Setup.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrPassword()).into(LastStepPage.PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(LastStepPage.CONFIRM_PASSWORD),
                Click.on(LastStepPage.UP_TO_DATA1),
                Click.on(LastStepPage.ACCEPT_TERMS_US_USE2),
                Click.on(LastStepPage.ACCEPT_THE_PRIVACY3)

        );
    }
}
