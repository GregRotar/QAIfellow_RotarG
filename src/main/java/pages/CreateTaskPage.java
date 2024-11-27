package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateTaskPage {
    private WebDriver driver;

    public CreateTaskPage(WebDriver driver) {
        this.driver = driver;
    }

    // Локаторы для создания задачи
    private By descriptionField = By.xpath("//textarea[@name='description']");
    private By createButton = By.xpath("//button[contains(text(),'Создать')]");


    public void createTask(String description) {
        driver.findElement(descriptionField).sendKeys(description);
        driver.findElement(createButton).click();
    }
}