package co.com.challenge.utest.user.tasks;

import co.com.challenge.utest.user.model.UtestData;
import co.com.challenge.utest.user.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class Devices implements Task {

    private List<UtestData> data;

    public Devices(List<UtestData> data) {
        this.data = data;
    }

    public static Devices getDevices(List<UtestData> data) {
        return Tasks.instrumented(Devices.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DevicesPage.CONTAINER_MOVILE_DEVICE),
                Enter.theValue(data.get(0).getStrDispositivoMovil()).into(DevicesPage.MOVILE_DIVICE)
                        .thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DevicesPage.CONTAINER_MODEL),
                Enter.theValue(data.get(0).getStrModelo()).into(DevicesPage.MODEL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DevicesPage.CONTAINER_OPERATING_SYSTEM),
                Enter.theValue(data.get(0).getStrSistemaOperativo()).into(DevicesPage.OPERATING_SYSTEM).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(DevicesPage.LAST_STEP)

        );
    }
}
