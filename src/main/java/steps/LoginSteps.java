package steps;

import pages.LoginPage;

public class LoginSteps extends LoginPage {

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

    }
}