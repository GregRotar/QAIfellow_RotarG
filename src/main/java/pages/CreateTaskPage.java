package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.$x;

public class CreateTaskPage {


    // Локаторы для создания задачи
    public final static SelenideElement descriptionField = $x("//textarea[@name='description']");
    public final static SelenideElement createButton = $x("//button[contains(text(),'Создать')]");


}