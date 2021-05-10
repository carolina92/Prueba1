package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistroPage extends PageObject {

    @FindBy(id = "id_gender1")
    private WebElementFacade raddioButtonSr;
    @FindBy(id = "customer_firstname")
    private WebElementFacade inputPrimerNombre;
    @FindBy(id = "customer_lastname")
    private WebElementFacade inputSegundoNombre;
    @FindBy(id = "passwd")
    private WebElementFacade inputPassword;
    @FindBy(id = "days")
    private WebElementFacade selectDiaNacimiento;
    @FindBy(id = "months")
    private WebElementFacade selectMesNacimiento;
    @FindBy(id = "years")
    private WebElementFacade selectAnioNacimiento;
    @FindBy(id="company")
    private WebElementFacade inputCompany;
    @FindBy(id = "address1")
    private WebElementFacade inputDireccion1;
    @FindBy(id = "address2")
    private WebElementFacade inputDireccion2;
    @FindBy(id = "city")
    private WebElementFacade inputCiudad;
    @FindBy(id = "postcode")
    private WebElementFacade inputCodigoPostal;
    @FindBy(id = "other")
    private WebElementFacade inputOtraInformacion;
    @FindBy(id = "phone_mobile")
    private WebElementFacade inputTelefonoMovil;

    @FindBy(id = "address_delivery")
    private WebElementFacade textInformacionRegistrada;

    @FindBy(id="submitAccount")
    private WebElementFacade btnRegistro;

    public void registrarUsuario(String primerNombre, String segundoNombre, String password,
                                 String company,
                                 String direccion1, String direccion2, String ciudad, String cdigoPostal,
                                 String otraInformacion, String telefonoMovil) {
        raddioButtonSr.click();
        inputPrimerNombre.sendKeys(primerNombre);
        inputSegundoNombre.sendKeys(segundoNombre);
        inputPassword.sendKeys(password);
        getDriver().findElement(By.cssSelector("#uniform-days")).click();
        getDriver().findElement(By.cssSelector("select[id*='day']> option:nth-child(2)")).click();
        getDriver().findElement(By.cssSelector("#uniform-months")).click();
        getDriver().findElement(By.cssSelector("select[id*='month']> option:nth-child(2)")).click();
        getDriver().findElement(By.cssSelector("#uniform-years")).click();
        getDriver().findElement(By.cssSelector("select[id*='year']> option:nth-child(4)")).click();
        inputDireccion1.sendKeys(direccion1);
        inputDireccion2.sendKeys(direccion2);
        inputCiudad.sendKeys(ciudad);
        getDriver().findElement(By.cssSelector("#uniform-id_state")).click();
        getDriver().findElement(By.cssSelector("select[id*='state']> option:nth-child(4)")).click();
        inputCodigoPostal.sendKeys(cdigoPostal);
        inputOtraInformacion.sendKeys(otraInformacion);
        inputTelefonoMovil.sendKeys(telefonoMovil);
        btnRegistro.click();
    }

    public String getTextInformacionRegistrada() {
        return textInformacionRegistrada.getText();
    }


}
