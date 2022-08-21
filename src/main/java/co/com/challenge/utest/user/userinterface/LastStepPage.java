package co.com.challenge.utest.user.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LastStepPage extends PageObject {


    public static final Target PASSWORD = Target.the("Password")
            .located(By.xpath("//*[@id='password']"));


    public static final Target CONFIRM_PASSWORD = Target.the("Confirmar Password de Usuario")
            .located(By.xpath("//*[@id='confirmPassword']"));


    public static final Target UP_TO_DATA1 = Target.the("Confirmar Password de Usuario")
            .located(By.xpath(" //*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[4]/label/span"));


    public static final Target ACCEPT_TERMS_US_USE2 = Target.the("Acetar terminos y condiciones")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));


    //ACCEPT_THE_PRIVACY

    public static final Target ACCEPT_THE_PRIVACY3 = Target.the("Acetar privacidad")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));



    public static final Target COMPLETE_SETUP = Target.the("Boton configuracion completa")
            .located(By.xpath("//a[@class='btn btn-blue']//span[contains(text(), 'Complete Setup')]"));




}

