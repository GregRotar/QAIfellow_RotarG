package test;

import config.WebHooks;
import org.junit.jupiter.api.Test;
import steps.*;

public class CreateNewBug {
    @Test
    public void createBag() {
        new EdujiraStartStep().authorization("AT1", "Qwerty123");
        int count = new EdujiraProjectStep().clickOnProjects();
        new EdujiraProjectStep().searchTask("HW3", count);
        new EdujiraTestSeleniumATHomeworkStep().clickOnTestSelenium("TestSeleniumATHomework");
        new EdujiraBagStep().createBag("HW3",
                "Некорректное отображение текста на странице при использовании масштабирования");
    }
}
