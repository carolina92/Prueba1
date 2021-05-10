package steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.*;
import org.hamcrest.core.StringContains;
import org.openqa.selenium.WebDriver;
import pages.CarritoComprasPage;
import pages.CatalogoPage;
import pages.RegistroPage;

public class RegistroStep {

    @Page
    CatalogoPage catalogoPage;

    @Page
    CarritoComprasPage carritoComprasPage;

    @Page
    RegistroPage registroPage;

    WebDriver webDriver;

    private String direccionDiligenciada;

    @Step
    public void ingresarALaPaginaDeCarrito() {
        catalogoPage=new CatalogoPage();
        catalogoPage.open();
        webDriver=catalogoPage.getDriver();
        catalogoPage.setDriver(webDriver);
        catalogoPage.getDriver().manage().window().maximize();
        catalogoPage.llevarAlCarritoDeCompra();
    }

    @Step
    public void ingresarARegistros(){
        carritoComprasPage=new CarritoComprasPage();
        carritoComprasPage.setDriver(webDriver);
        carritoComprasPage.irARegistro(String.format("cd%d@gmail.com",generateRandom()));
    }
    private int generateRandom(){
        int min = 0;
        int max = 9999;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }


    @Step
    public void registrarLosDatosDeUsuario() {
        registroPage=new RegistroPage();
        registroPage.setDriver(webDriver);
        direccionDiligenciada ="Hacker Way, Menlo Park, CA 94025";
        registroPage.registrarUsuario("mario","marulanda","carlitoMusa123+","Draco S.A.S",
                direccionDiligenciada,
                direccionDiligenciada,"California","90210",
                "533204879620","533204879620");
    }

    @Step
    public void verificarRegistro() {
        String direccionRegistrada=registroPage.getTextInformacionRegistrada();
        MatcherAssert.assertThat(direccionRegistrada, StringContains.containsString(direccionDiligenciada));
    }


}