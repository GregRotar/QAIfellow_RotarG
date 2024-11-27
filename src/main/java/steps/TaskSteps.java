package steps;

import pages.TaskPage;

public class TaskSteps extends TaskPage {
    public int getTaskCount() {
        String taskCountTextValue = taskCountText.getText();
        String taskCount = taskCountTextValue.split(" ")[2]; // Пример "1 из 30"
        return Integer.parseInt(taskCount);
    }

    public void openTaskDetails() {

        taskLink.click();
    }
}

