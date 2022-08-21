package co.com.challenge.utest.user.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {
    public static final Target JOIN_TODAY = Target.the("Boton para iniciar el registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
