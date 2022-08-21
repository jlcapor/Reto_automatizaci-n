package co.com.challenge.utest.user.tasks;

import co.com.challenge.utest.user.model.UtestData;
import co.com.challenge.utest.user.userinterface.AddressPage;
import co.com.challenge.utest.user.userinterface.UtestRegisterUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class Address implements Task {
    private List<UtestData> data;

    public Address(List<UtestData> data) {
        this.data = data;
    }

    public static Address getAddress(List<UtestData> data) {
        return Tasks.instrumented(Address.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCiudad()).into(AddressPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(AddressPage.CITY),
                Hit.the(Keys.ENTER).into(AddressPage.CITY),
                Enter.theValue(data.get(0).getStrCodigoPostal()).into(AddressPage.POSTAL_CODE),
                Click.on(AddressPage.CONTAINER_CONTRY),
                Enter.theValue(data.get(0).getStrPais()).into(AddressPage.COUNTRY),
                Click.on(AddressPage.NEXT_DEVICES)

        );
    }
}
