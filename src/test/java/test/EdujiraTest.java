package test;

import config.WebHooks;
import org.junit.jupiter.api.Test;
import pages.CreateTaskPage;
import pages.LoginPage;
import pages.ProjectPage;
import pages.TaskPage;

public class EdujiraTest extends WebHooks {

    @Test
    public void testLoginAndNavigateToProject() {
        LoginPage loginPage = new LoginPage(driver); // Используем driver из WebHooks
        loginPage.login("AT1", "Qwerty123");

        // Проверка, что перешли на страницу с проектами
        assert driver.getCurrentUrl().contains("projects");
    }

    @Test
    public void testNavigateToTestProject() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("AT1", "Qwerty123");
        new ProjectPage(driver).goToTestProject();

        // Проверка, что находимся на странице задач
        assert driver.getCurrentUrl().contains("tasks");
    }

    @Test
    public void testCheckTaskCount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("AT1", "Qwerty123");
        new ProjectPage(driver).goToTestProject();

        int initialTaskCount = new TaskPage(driver).getTaskCount();

        // Создаем задачу и проверяем, что количество задач увеличилось на 1
        CreateTaskPage createTaskPage = new CreateTaskPage(driver);
        createTaskPage.createTask("New Task Description");

        int newTaskCount = new TaskPage(driver).getTaskCount();
        assert newTaskCount == initialTaskCount + 1;
    }
}
