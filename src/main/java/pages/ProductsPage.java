package pages;

import com.microsoft.playwright.Page;

public class ProductsPage extends BasePage {

        public ProductsPage(Page page) {
            super(page);
        }

        public void clickAddBackpackToCart() {
            page.locator("button[data-test='add-to-cart-sauce-labs-backpack']").click();
        }

        public void clickCart() {
            page.locator("a[class='shopping_cart_link']").click();
        }
}
