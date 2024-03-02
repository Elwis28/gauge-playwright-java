package pages;

import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {

    public LoginPage(Page page) {
        super(page);
    }

    public void enterUsername() {
        page.locator("//input[@id='user-name']").fill("standard_user");
    }

    public void enterPassword() {
        page.locator("//input[@id='password']").fill("secret_sauce");
    }

    public void clickLogin() {
        page.locator("//input[@id='login-button']").click();
    }

    public Boolean isTitleDisplayed() {
        return page.locator("span[class='title']").isVisible();
    }

    public void getLoginPage(){
        page.navigate(System.getenv("url"));
    }
}
