package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPage {
    private WebDriver driver;

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    // Локатор для проекта "pages.Test"
    private By projectLink = By.xpath("//a[contains(text(),'pages.Test')]");


    public ProjectPage goToTestProject() {
        driver.findElement(projectLink).click();
        return this;
    }
}