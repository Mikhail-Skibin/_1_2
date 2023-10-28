import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTests {

    @Test
    void selenideSearchTest() {
        // Configuration.browser = "FIREFOX";

        open ("https://google.com");

        $( "[name=q]").setValue ("Selenide").pressEnter();

        $( "[id=search]").shouldHave (text("selenide.org"));
    }
}
