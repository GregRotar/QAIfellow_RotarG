package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskPage {

    // Локаторы для задачи
    public final static SelenideElement taskCountText = $x("//span[@class='task-count']");
    public final static SelenideElement taskLink = $x("//a[contains(text(),'TestSeleniumATHomework')]");

}