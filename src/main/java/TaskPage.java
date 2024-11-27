import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TaskPage {
    private WebDriver driver;

    // Локаторы для задачи
    private By taskCountText = By.xpath("//span[@class='task-count']");
    private By taskLink = By.xpath("//a[contains(text(),'TestSeleniumATHomework')]");

    public TaskPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getTaskCount() {
        String taskCountTextValue = driver.findElement(taskCountText).getText();
        String taskCount = taskCountTextValue.split(" ")[2]; // Пример "1 из 30"
        return Integer.parseInt(taskCount);
    }

    public class TaskDetailsPage {
        openTaskDetails(

                public TaskDetailsPage(WebDriver driver) {
        })

        {
            driver.findElement(taskLink).click();
            return new TaskDetailsPage(driver);
        }
    }
}