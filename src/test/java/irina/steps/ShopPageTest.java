package irina.steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import irina.ShopCartPage;
import irina.ShopResultPage;
import org.junit.Assert;

/*
Тестирование UI.
Необходимо протестировать кнопку «cart» на странице http://automationpractice.com
Тест-кейсы:
1. Кликнуть кнопку cart. Проверка: открылась страница тележки, товаров нет,
присутствует предупреждение об отсутствии товаров.
2. Добавить первый товар в корзину, нажать на кнопу cart. Проверка: товар присутствует в корзине.
3. Проверить, что при клике на кнопку check out, открывается тележка. Проверка: открывается div.container.
4. Удаление товара из корзины. Проверка: в тележке нет товара с таким кодом.
5. Увеличение количества товаров. Проверка: количество товаров > предыдущего количества.
 */
public class ShopPageTest {
    @BeforeAll
    public static void setBrowserConfig() {
        //зайдет в интернет, скачает образец драйвера
        Configuration.browser = "firefox";  //объявление браузера
        Configuration.startMaximized = true;    //максимального размера для окна
    }

    @Given("^I open shop page$")
    public void openStartPage() {
        Selenide.open(ShopCartPage.getBASE_URL());
    }

    @And("I click the cart button")
    public void clickOnCart() {
        ShopCartPage searchCartButton = new ShopCartPage();
        searchCartButton.getSearchCart()   //поиск кнопки корзины
                .click();   //нажатие на кнопку
    }

    @Then("I check, cart is empty")
    public void checkResult() {
        ShopResultPage resultPage = new ShopResultPage();
        Assert.assertNotNull(resultPage.getWarning());
    }

    @AfterAll
    public static void closeAll() {
        Selenide.closeWebDriver();
    }

}
