package test;

import org.junit.jupiter.api.Test;
import steps.*;

public class TrekIntoTest {
    @Test
    public void clickOnProjectsTest(){
        new Authorization().authorization("AT1", "Qwerty123");
        new Authorization().clickOnProjects();
    }
}
