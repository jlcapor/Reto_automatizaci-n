package co.com.challenge.utest.user.tasks;
import co.com.challenge.utest.user.model.UtestData;
import co.com.challenge.utest.user.userinterface.UtestRegisterUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class Register implements Task {

    private List<UtestData> data;

    public Register(List<UtestData> data) {
        this.data = data;
    }

    public static Register fill(List<UtestData> data) {
        return Tasks.instrumented(Register.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrNombre()).into(UtestRegisterUserPage.FIRST_NAME),
                Enter.theValue(data.get(0).getStrApellido()).into(UtestRegisterUserPage.LAST_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(UtestRegisterUserPage.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(data.get(0).getStrMesNacimiento()).from(UtestRegisterUserPage.MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDiaNacimiento()).from(UtestRegisterUserPage.DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrAnoNacimiento()).from(UtestRegisterUserPage.YEAR),
                Click.on(UtestRegisterUserPage.NEXT_LOCATION)
        );
    }
}
