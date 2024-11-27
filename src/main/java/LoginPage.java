import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {
    private WebDriver driver;

    // Локаторы
    private By usernameField = By.xpath("//input[@name='AT1']");
    private By passwordField = By.xpath("//input[@name='Qwerty123']");
    private By loginButton = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProjectPage login(String username, String password) {
        driver.findElement(usernameField).sendKeys(AT1);
        driver.findElement(passwordField).sendKeys(Qwerty123);
        driver.findElement(loginButton).click();

        // Дождаться загрузки страницы проекта (например, наличие элемента на странице)
        new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(),'Projects')]")));

        return new ProjectPage(driver);
    }
}