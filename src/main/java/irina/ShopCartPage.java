package irina;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Data
public class ShopCartPage {
    @Getter
    private static final String BASE_URL = "http://automationpractice.com";

    //найти кнопку тележки
    private final SelenideElement searchCart = $(By.cssSelector("a[title = 'View my shopping cart']"));
}
