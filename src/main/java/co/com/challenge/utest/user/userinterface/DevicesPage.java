package co.com.challenge.utest.user.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class DevicesPage extends PageObject {
    public static final Target CONTAINER_MOVILE_DEVICE = Target.the("Contenedor de dispositivos")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div"));

    public  static  final  Target MOVILE_DIVICE = Target.the("Dispositivo Movil")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));


    public static final Target CONTAINER_MODEL = Target.the("Contenedor modelo dispositivo movil")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div"));


    public static final Target MODEL = Target.the("Modelo dispositivo movil")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));




    public static final Target CONTAINER_OPERATING_SYSTEM = Target.the("Contenedor de sistema operativo")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div"));



    public static final Target OPERATING_SYSTEM = Target.the("Sistema operativo")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));



    public static final Target LAST_STEP = Target.the("Boton ultimo paso")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
