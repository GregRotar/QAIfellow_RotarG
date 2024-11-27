package test;

import config.WebHooks;
import org.junit.jupiter.api.Test;
import steps.*;

public class TestSeleniumATHomework {
    @Test
    public void clickOnTestSeleniumTest(){
        new EdujiraStartStep().authorization("AT1", "Qwerty123");
        int count = new EdujiraProjectStep().clickOnProjects();
        new EdujiraProjectStep().searchTask("HW3", count);
        new EdujiraTestSeleniumATHomeworkStep().clickOnTestSelenium("TestSeleniumATHomework");
    }
}
