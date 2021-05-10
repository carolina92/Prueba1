package pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class CatalogoPage extends PageObject {

    @FindBy(css = "#homefeatured li:nth-child(1) .product-image-container")
    private WebElementFacade imgItem;

    @FindBy(css = "#homefeatured li:nth-child(1) a[class*='button ajax_add_to_cart_button']")
    private WebElementFacade btnAgregarCompra;

    @FindBy(css = "a[title*='Proceed to checkout']")
    private WebElementFacade btnCheckout;



    public void llevarAlCarritoDeCompra(){
        withAction().moveToElement(imgItem).build().perform();
        withAction().moveToElement(btnAgregarCompra).build().perform();
        withAction().click(btnAgregarCompra).build().perform();
        btnCheckout.click();
        System.out.println("ejecuto");
    }



}
