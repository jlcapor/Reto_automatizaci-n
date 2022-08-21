package co.com.challenge.utest.user.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AddressPage extends PageObject {

    public static final Target CITY = Target.the("Ciudad")
            .located(By.id("city"));


    public static final Target POSTAL_CODE = Target.the("Codigo Postal")
            .located(By.id("zip"));



    public static final Target CONTAINER_CONTRY = Target.the("Contenedor de paises")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));



    public static final Target COUNTRY = Target.the("Pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));


    public static final Target NEXT_DEVICES = Target.the("Boton que lleva a la siguiente diapositiva")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}



