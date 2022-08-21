package co.com.challenge.utest.user.userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegisterUserPage extends PageObject{

    public static final Target FIRST_NAME = Target.the("Primer Nombre")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Apellido")
            .located(By.id("lastName"));

    public static final Target EMAIL_ADDRESS = Target.the("Email")
            .located(By.id("email"));

    public static final Target MONTH = Target.the("Mes")
            .located(By.xpath("//*[@id='birthMonth']"));

    public static final Target DAY = Target.the("Dia")
            .located(By.xpath("//*[@id='birthDay']"));

    public static final Target YEAR = Target.the("Año")
            .located(By.xpath("//*[@id='birthYear']"));

    public static final Target NEXT_LOCATION = Target.the("Boton que lleva a la seccion de Direccion")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}
