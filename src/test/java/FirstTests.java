import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.browser;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTests {

    @Test
    void selenideSearchTest() {

        browser = "firefox";
            // Configuration.timeout = 10000;
            // Configuration.baseUrl = "https://www.example.com";
            // Configuration.headless = true;
            // Configuration.browserSize = "1920x1080";

        open("https://www.google.com");

        $("[name=q]").setValue("Selenide").pressEnter();

        $("[id=search]").shouldHave(text("selenide.org"));
    }
}
