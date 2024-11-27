package steps;

import io.qameta.allure.Step;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();  // Create an instance of LoginPage

    @Step("вход на сайт")
    public void login(String username, String password) {
        loginPage.usernameField.sendKeys(username);
        loginPage.passwordField.sendKeys(password);
        loginPage.loginButton.click();
    }
}
