package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectPage {


    public final static SelenideElement projectLink = $x("//a[contains(text(),'Test')]");
}