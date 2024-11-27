package steps;

import pages.CreateTaskPage;

public class CreateTaskSteps extends CreateTaskPage {
    public void createTask(String description) {
        descriptionField.sendKeys(description);
        createButton.click();
    }
}
