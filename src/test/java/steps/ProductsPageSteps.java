package steps;

import com.thoughtworks.gauge.Step;
import pages.ProductsPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import static factory.InitializeBrowser.page;

public class ProductsPageSteps {

    private ProductsPage productsPage = new ProductsPage(page);

    @Step("The user adds backpack to cart.")
    public void clickAddBackpackToCart(){
        productsPage.clickAddBackpackToCart();
    }

    @Step("The user clicks on shopping cart.")
    public void clickCart(){
        productsPage.clickCart();
    }
}
