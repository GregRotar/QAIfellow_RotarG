package test;

import config.WebHooks;
import org.junit.jupiter.api.Test;
import steps.LoginSteps;

public class EdujiraTest extends WebHooks {

    @Test
    public void testLoginAndNavigateToProject() {
        new LoginSteps().login("AT1", "Qwerty123");


    }
}