package steps;

import io.qameta.allure.Step;
import pages.ProjectPage;

public class ProjectSteps extends ProjectPage {
    @Step("открыть проект")
    public void goToTestProject() {
       projectLink.click();

    }
}

