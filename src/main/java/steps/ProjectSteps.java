package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import pages.ProjectPage;

public class ProjectSteps extends ProjectPage {

    @Step("Открыть 'Проекты'")
    public void goToTestProject() {
        projectLink.click();
        testLink.click();
        Assertions.assertTrue(taskHeader.exists(), "Заголовок страницы 'Открытые задачи' отсутствует");
    }
}

