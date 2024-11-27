package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectPage {

    public final static SelenideElement projectLink = $x("//a[text() = 'Проекты']");
    public final static SelenideElement testLink = $x("//a[text() = 'Test (TEST)']");
    public final static SelenideElement taskHeader = $x("//span[text() = 'Открытые задачи']");
}