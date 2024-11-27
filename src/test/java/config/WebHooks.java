package config;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;

public class WebHooks {

    @BeforeEach
    public void initBrowser()  {
        WebDriverManager.chromedriver().setup();
        Configuration.pageLoadStrategy = PageLoadStrategy.EAGER.toString();
        Configuration.browser = Browsers.CHROME;
        Configuration.startMaximized = true;
        open("https://edujira.ifellow.ru/");
    }

    @AfterEach
    public void closeDriver() {
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
