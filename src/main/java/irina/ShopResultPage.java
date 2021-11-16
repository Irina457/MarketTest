package irina;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

@Data
public class ShopResultPage {
    //предупреждение, что тележка пуста пуста
    private final SelenideElement warning = $(By.cssSelector("p.alert.alert-warning"));
}
