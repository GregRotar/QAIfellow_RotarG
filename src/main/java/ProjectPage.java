import org.openqa.selenium.*;

public class ProjectPage {
    private WebDriver driver;

    // Локатор для проекта "Test"
    private By projectLink = By.xpath("//a[contains(text(),'Test')]");

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public TaskPage goToTestProject() {
        driver.findElement(projectLink).click();
        return new TaskPage(driver);
    }
}