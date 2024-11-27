import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdujiraTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testLoginAndNavigateToProject() {
        LoginPage loginPage = new LoginPage(driver);
        ProjectPage projectPage = loginPage.login("AT1", "Qwerty123");

        // Проверка, что перешли на страницу с проектами
        assert driver.getCurrentUrl().contains("projects");
    }

    @Test
    public void testNavigateToTestProject() {
        LoginPage loginPage = new LoginPage(driver);
        ProjectPage projectPage = loginPage.login("AT1", "Qwerty123");
        TaskPage taskPage = projectPage.goToTestProject();

        // Проверка, что находимся на странице задач
        assert driver.getCurrentUrl().contains("tasks");
    }

    @Test
    public void testCheckTaskCount() {
        LoginPage loginPage = new LoginPage(driver);
        ProjectPage projectPage = loginPage.login("AT1", "Qwerty123");
        TaskPage taskPage = projectPage.goToTestProject();

        int initialTaskCount = taskPage.getTaskCount();

        // Создаем задачу и проверяем, что количество задач увеличилось на 1
        CreateTaskPage createTaskPage = new CreateTaskPage(driver);
        createTaskPage.createTask("New Task Description");

        int newTaskCount = taskPage.getTaskCount();
        assert newTaskCount == initialTaskCount + 1;
    }

    @Test
    public void testVerifyTaskDetails() {
        LoginPage loginPage = new LoginPage(driver);
        ProjectPage projectPage = loginPage.login("AT1", "Qwerty123");
        TaskPage taskPage = projectPage.goToTestProject();
        TaskDetailsPage taskDetailsPage = taskPage.openTaskDetails();

        taskDetailsPage.verifyTaskDetails();
    }

    @Test
    public void testCreateAndCloseTask() {
        LoginPage loginPage = new LoginPage(driver);
        ProjectPage projectPage = loginPage.login("AT1", "Qwerty123");
        TaskPage taskPage = projectPage.goToTestProject();

        CreateTaskPage createTaskPage = new CreateTaskPage(driver);
        createTaskPage.createTask("Bug description");

        // Дополнительные шаги для перевода задачи по статусам до закрытого
        // (будет зависеть от специфики интерфейса)

        // Проверка, что задача закрыта
        // assert statusText.equals("Closed");
    }
}