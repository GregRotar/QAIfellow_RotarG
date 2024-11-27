package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskPage {
    private WebDriver driver;

    public TaskPage(WebDriver driver) {
        this.driver = driver;
    }


    // Локаторы для задачи
    private By taskCountText = By.xpath("//span[@class='task-count']");
    private By taskLink = By.xpath("//a[contains(text(),'TestSeleniumATHomework')]");


    public int getTaskCount() {
        String taskCountTextValue = driver.findElement(taskCountText).getText();
        String taskCount = taskCountTextValue.split(" ")[2]; // Пример "1 из 30"
        return Integer.parseInt(taskCount);
    }

    public TaskPage openTaskDetails() {
        driver.findElement(taskLink).click();
        return this;
    }
}