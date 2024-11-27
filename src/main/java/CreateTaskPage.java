import org.openqa.selenium.*;

public class CreateTaskPage {
    private WebDriver driver;

    // Локаторы для создания задачи
    private By descriptionField = By.xpath("//textarea[@name='description']");
    private By createButton = By.xpath("//button[contains(text(),'Создать')]");

    public CreateTaskPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createTask(String description) {
        driver.findElement(descriptionField).sendKeys(description);
        driver.findElement(createButton).click();
    }
}