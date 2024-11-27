package test;

import config.WebHooks;
import org.junit.jupiter.api.Test;
import steps.*;

public class Authorization extends WebHooks {
    @Test
    public void authorizationTest(){
        new EdujiraStartStep().authorization("AT1", "Qwerty123");
    }
