package steps;

import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import pages.CarritoComprasPage;
import pages.CatalogoPage;

public class RegistroStep {

    @Page
    CatalogoPage catalogoPage;

    @Page
    CarritoComprasPage carritoComprasPage;

    WebDriver webDriver;

    public void ingresarALaPaginaDeCarrito() {
        catalogoPage=new CatalogoPage();
        catalogoPage.open();
        webDriver=catalogoPage.getDriver();
        catalogoPage.setDriver(webDriver);
        catalogoPage.getDriver().manage().window().maximize();
        catalogoPage.llevarAlCarritoDeCompra();
    }

    public void ingresarARegistros(){
        carritoComprasPage=new CarritoComprasPage();
        carritoComprasPage.setDriver(webDriver);
        carritoComprasPage.irARegistro("cd@gmail.com");
    }

    public void registrarLosDatosDeUsuario() {
    }

    public void verificarRegistro() {
    }
}
