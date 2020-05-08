package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.annotatin.Element;
import pages.annotatin.Page;



@Page(title = "Главная страница", url = "https://dev.n7lanit.ru")
public class MainPage extends AbstractPage{

    @Element("Темы")
    public WebElement getThemesTab() {
        return $(By.xpath("//ul[@class = 'nav navbar-nav']"));
    }
    @Element("Войти")
    public WebElement getIn() {
        return $(By.xpath("//div[@class='nav nav-guest']/button[@class='btn navbar-btn btn-default btn-sign-in']"));
    }
    @Element("Логин")
    public WebElement getLogin() {
        return $(By.xpath("//div[@class='control-input']/input[@id='id_username']"));
    }
    @Element("Пароль")
    public WebElement getPassword() {
        return $(By.xpath("//div[@class='control-input']/input[@id='id_password']"));
    }
    @Element("Тему")
    public WebElement getThemes() {
        return $(By.xpath("//a[contains(text(),'NewTopic')]"));
    }
    @Element("поле ответа")
    public WebElement getFieldAnswer() {
        return  $(By.xpath("//textarea[@id='editor-textarea']"));
    }
    @Element("отправить ответ")
    public WebElement getSendAnswer() {
       return $(By.xpath("//button[@class='btn btn-primary btn-sm pull-right'][@type='submit']"));
    }
    @Element("сообщение на экране")
    public WebElement getVisible() {
        return $(By.xpath("//div[@class='post-body']/article[last()]"));
    }

}