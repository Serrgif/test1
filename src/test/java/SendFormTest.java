import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SendFormTest {
    @Test
    void SendFormTestV1() {
        $("[data-test-id=name] input").setValue("Сергей Новиков");

        }

}



