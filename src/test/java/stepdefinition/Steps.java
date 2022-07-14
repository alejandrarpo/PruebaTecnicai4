package stepdefinition;

import interfaces.HomePerurailPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Steps {
    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
        theActorCalled("Alejandra");
    }
    @Cuando("estoy en la home de perurail")
    public void estoyEnLaHomeDePerurail() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.perurail.com/es/"));
    }

    @Entonces("el sistema me muestra un formulario booking")
    public void elSistemaMeMuestraUnFormularioBooking() {
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(HomePerurailPage.BOX_FORMULARIO), WebElementStateMatchers.isVisible()));

    }


}
