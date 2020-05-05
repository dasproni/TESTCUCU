package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.annotatin.Element;
import pages.annotatin.Page;

import static com.codeborne.selenide.Selenide.$;

@Page(title = "Главная страница", url = "https://dev.n7lanit.ru")
public class MainPage extends AbstractPage{

    @Element("Вкладка темы")
    public WebElement getThemesTab() {
        return $(By.xpath("//ul[@class = 'nav navbar-nav']//a[contains(text(), 'Темы')]"));
    }
    @Element("Логин")
    public WebElement getLogin() {
        return $(By.xpath("//div[@class='control-input']/input[@id='id_username']"));
    }
}
