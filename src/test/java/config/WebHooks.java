package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebHooks {

    protected WebDriver driver;

    @BeforeEach
    public void initBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://edujira.ifellow.ru/");
    }

    @AfterEach
    public void closeDriver() {
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
