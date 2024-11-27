package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Локаторы
    private By usernameField = By.xpath("//input[@name='os_username']");
    private By passwordField = By.xpath("//input[@name='os_password']");
    private By loginButton = By.xpath("//input[@name=\"login\"]");


    public LoginPage login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();

        // Дождаться загрузки страницы проекта (например, наличие элемента на странице)
        new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Projects')]")));

        return new LoginPage(driver);
    }
}