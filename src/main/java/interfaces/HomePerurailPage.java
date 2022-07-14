package interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePerurailPage {

    public static final Target BOX_FORMULARIO = Target.the("Caja del formualario").locatedBy("//*[@class='content-box-reserva']");
    public static final Target TXT_ALERTA = Target.the("Alerta de datos incompletos").locatedBy("//*[@id='error-inputs']");
    public static final Target SELECT_DESTINO = Target.the("Campo para seleccion de destino").locatedBy("//*[@id='destinoSelect']");
    public static final Target SELECT_RUTA = Target.the("Campo para seleccion de la ruta").locatedBy("//*[@id=\"rutaSelect\"]");
}
