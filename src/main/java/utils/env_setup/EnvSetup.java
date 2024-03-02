package utils.env_setup;

import com.microsoft.playwright.Page;
import com.thoughtworks.gauge.AfterSpec;
import com.thoughtworks.gauge.BeforeSpec;
import factory.DriverFactory;
import factory.InitializeBrowser;
import pages.LoginPage;

import javax.naming.Context;

public class EnvSetup {

    public Page page;

    @BeforeSpec
    public void BeforeSpec(){
        new InitializeBrowser();
        LoginPage loginPage = new LoginPage(InitializeBrowser.page);
        loginPage.getLoginPage();
    }

    @AfterSpec
    public void AfterSpec(){
    }
}
