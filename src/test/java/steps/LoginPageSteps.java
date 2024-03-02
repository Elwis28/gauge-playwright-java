package steps;

import com.thoughtworks.gauge.Step;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import static factory.InitializeBrowser.page;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage(page);

    @Step("The user logs into the page.")
    public void setLanguageVowels() {
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLogin();
    }

    @Step("The title is displayed.")
    public void checkPageHeader(){
        assertTrue(loginPage.isTitleDisplayed(), "The title is not displayed");
    }

}
