package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarritoComprasPage extends PageObject {

    @FindBy(css = "p a[title='Proceed to checkout']")
    private WebElementFacade btnCheckout;

    @FindBy(id="email_create")
    private WebElementFacade inputEmail;

    @FindBy(name = "SubmitCreate")
    private WebElementFacade btnCreateAccount;

    public void irARegistro(String correo){
        btnCheckout.click();
        inputEmail.sendKeys(correo);
        btnCreateAccount.click();
        System.out.println("llego a registro");
    }

}
