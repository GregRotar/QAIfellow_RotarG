package steps;

import io.qameta.allure.Step;
import pages.TaskPage;

public class TaskSteps extends TaskPage {
    @Step("получить количество задач")
    public int getTaskCount() {
        String taskCountTextValue = taskCountText.getText();
        String taskCount = taskCountTextValue.split(" ")[2]; // Пример "1 из 30"
        return Integer.parseInt(taskCount);
    }

    @Step("открыть задачи")
    public void openTaskDetails() {

        taskLink.click();
    }
}

