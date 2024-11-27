package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;

public class LoginSteps extends LoginPage {

    @Step("Вход на сайт")
    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        Assertions.assertTrue(startHeader.exists(), "Заголовок страницы 'System Dashboard' отсутствует");
    }
}
