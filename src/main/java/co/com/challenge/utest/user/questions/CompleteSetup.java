package co.com.challenge.utest.user.questions;

import co.com.challenge.utest.user.model.UtestData;
import co.com.challenge.utest.user.userinterface.LastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class CompleteSetup implements Question<Boolean> {


    private List<UtestData> data;

    public CompleteSetup(List<UtestData> data) {
        this.data = data;
    }

    public static CompleteSetup allComplet(List<UtestData> data) {
        return new CompleteSetup(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String complete_setup = Text.of(LastStepPage.COMPLETE_SETUP).viewedBy(actor).asString();
        return data.get(0).getStrTextoFinal().equals(complete_setup);
    }
}
