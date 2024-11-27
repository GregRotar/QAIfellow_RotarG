package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    // Локаторы
    public final static SelenideElement usernameField = $x("//input[@name='os_username']");
    public final static SelenideElement passwordField = $x("//input[@name='os_password']");
    public final static SelenideElement loginButton = $x("//input[@name=\"login\"]");

    // Default constructor
    public LoginPage() {
        // You can add any initialization logic here, if necessary
    }
}
