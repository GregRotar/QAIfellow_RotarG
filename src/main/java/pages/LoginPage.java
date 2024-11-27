package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    public final static SelenideElement usernameField = $x("//input[@name='os_username']");
    public final static SelenideElement passwordField = $x("//input[@name='os_password']");
    public final static SelenideElement loginButton = $x("//input[@name=\"login\"]");
    public final static SelenideElement startHeader = $x("//h1[text() = 'System Dashboard']");
}
