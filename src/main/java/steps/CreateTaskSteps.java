package steps;

import io.qameta.allure.Step;
import pages.CreateTaskPage;

public class CreateTaskSteps extends CreateTaskPage {
    @Step("создание задачи")
    public void createTask(String description) {
        descriptionField.sendKeys(description);
        createButton.click();
    }
}
