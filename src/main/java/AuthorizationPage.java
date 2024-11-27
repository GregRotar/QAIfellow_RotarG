import com.codeborne.selenide.SelenideElement;

public class AuthorizationPage {
    import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

    public class authorizationPage {
        public final static SelenideElement login = $x("//input[@name='os_username']");
        public final static SelenideElement password = $x("//input[@name='os_password']");
        public final static SelenideElement buttonEnter = $x("//input[@name=\"login\"]");
    }
}
