package stepdefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import cucumber.api.PendingException;
import cucumber.api.java.ru.Допустим;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static pages.AbstractPage.getPageByTitle;
import static pages.AbstractPage.getUrlByTitle;

public class MyStepDefs {
    @Допустим("открыть страницу {string}")
    public void открыть_страницу(String site) throws ClassNotFoundException {
        open(getUrlByTitle(site));
        throw new PendingException();
    }

    @Допустим("нажать кнопку войти")
    public void нажать_кнопку_войти() {
        $(By.xpath("//div[@class='nav nav-guest']/button[@class='btn navbar-btn btn-default btn-sign-in']")).click();
        Configuration.timeout = 5000;
        throw new PendingException();
    }

    @Допустим("ввести логин")
    public void ввести_логин(String login) {
        getElementByLogin(login).click();
        throw new PendingException();
    }

    @Допустим("ввести пароль")
    public void ввести_пароль() {
        $(By.xpath("//div[@class='control-input']/input[@id='id_password']")).shouldHave(Condition.appear).val("Cosmopolitanzxcv123456789").pressEnter();
        Configuration.timeout = 5000;
        throw new PendingException();
    }

    @Допустим("нажать войти")
    public void нажать_войти() {
        $(By.xpath("//div[@class='modal-footer']")).pressEnter();
        Configuration.timeout = 5000;
        throw new PendingException();
    }

    @Допустим("посмотреть отображние иконки")
    public void посмотреть_отображние_иконки() {
        $(By.xpath("//div[@id='user-menu-mount']//li[@class='dropdown']/a/img")).shouldBe(Condition.visible);
        Configuration.timeout = 5000;
        throw new PendingException();
    }

    @Допустим("открыть любую тему")
    public void открыть_любую_тему(String title, String tabName) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        getPageByTitle(title).getElementByName(tabName).click();
        $(By.xpath("//div[@class='media-body']/a[@href='/t/new-topic-vegas/909/']")).click();
        Configuration.timeout = 5000;
        throw new PendingException();
    }

    @Допустим("ввести в поле ответа {string}")
    public void ввести_в_поле_ответа(String string) {
        $(By.xpath("//textarea[@id='editor-textarea']")).val("Давайте спрева перекусим, дружелюбие появится потом").shouldHave(Condition.visible);
        Configuration.timeout = 5000;
        throw new PendingException();
    }

    @Допустим("нажать кнопку отправить ответ")
    public void нажать_кнопку_отправить_ответ() {
        $(By.xpath("//button[@class='btn btn-primary btn-sm pull-right'][@type='submit']")).click();
        Configuration.timeout = 5000;
        throw new PendingException();
    }

    @Допустим("проверить наличие сообщение на экране")
    public void проверить_наличие_сообщение_на_экране() {
        $(By.xpath("//div[@class='post-body']/article[last()]")).shouldBe(Condition.visible);
        Configuration.timeout = 5000;
    }
        throw new PendingException();
    }

    @Допустим("перейти во {string}")
    public void перейти_во(String title, String tabName) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        getPageByTitle(title).getElementByName(tabName).click();
        throw new PendingException();
    }

    @Допустим("повторить ввод сообщения")
    public void повторить_ввод_сообщения() {
        $(By.xpath("//div[@class='media-body']/a[@href='/t/new-topic-vegas/909/']")).click();
        Configuration.timeout = 5000;
        $(By.xpath("//textarea[@id='editor-textarea']")).val("Давайте спрева перекусим, дружелюбие появится потом").shouldHave(Condition.visible);
        Configuration.timeout = 5000;
        $(By.xpath("//button[@class='btn btn-primary btn-sm pull-right'][@type='submit']")).click();
        Configuration.timeout = 5000;
        $(By.xpath("//div[@class='post-body']/article[last()]")).shouldBe(Condition.visible);
        Configuration.timeout = 5000;
        throw new PendingException();
    }
}
