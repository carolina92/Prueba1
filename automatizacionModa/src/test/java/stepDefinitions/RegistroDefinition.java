package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.RegistroStep;

public class RegistroDefinition {

    @Steps
    RegistroStep registroStep;

    @Given("Ingresar a la pagina de registro de cuenta")
    public void ingresarALaPaginaDeRegistroDeCuenta() {
        registroStep.ingresarALaPaginaDeCarrito();
    }

    @When(": Registrar los datos del usuario")
    public void registrarLosDatosDelUsuario() {
        registroStep.ingresarARegistros();
		registroStep.registrarLosDatosDeUsuario();
    }

    @Then(": El sistema debe de notificarme que quedo listo el registro")
    public void elSistemaDebeDeNotificarmeQueQuedoListoElRegistro() {
        registroStep.verificarRegistro();

    }
}
