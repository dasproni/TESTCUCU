package stepdefs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import cucumber.api.java.ru.И;
import org.openqa.selenium.By;

import java.lang.reflect.InvocationTargetException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static pages.AbstractPage.getPageByTitle;
import static pages.AbstractPage.getUrlByTitle;

public class MyStepdef {
    @И("открыть страницу {string}")
    public void открытьСтраницу(String site) throws ClassNotFoundException {
        open(getUrlByTitle(site));
    }

    @И("на странице {string} открыть вкладку {string}")
    public void наСтраницеОткрытьВкладку(String site, String tabName) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        getPageByTitle(site).getElementByName(tabName).click();
    }

    @И("на странице {string} нажать кнопку {string}")
    public void наСтраницеНажатьКнопку(String site, String tabName) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        getPageByTitle(site).getElementByName(tabName).click();
    }

    @И("на странице {string} ввести логин в поле {string}")
    public void наСтраницеВвестиЛогинВПоле(String site, String login) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        getPageByTitle(site).getElementByName(login).sendKeys("dasproni");
    }

    @И("ввести на {string} в поле {string} и войти")
    public void ввестиНаВПолеИВойти(String site, String password) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        getPageByTitle(site).getElementByName(password).sendKeys("Cosmopolitanzxcv123456789");
    }

    @И("посмотреть отображние иконки")
    public void посмотретьОтображниеИконки() {
        $(By.xpath("//div[@id='user-menu-mount']//li[@class='dropdown']/a/img")).shouldBe(Condition.visible);
    }

    @И("открыть на {string} любую {string}")
    public void открытьНаЛюбую(String site, String thems) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException{
        getPageByTitle(site).getElementByName(thems).click();
    }

    @И("ввести на {string} в {string} Давайте спрева перекусим, дружелюбие появится потом")
    public void ввестиНаВДавайтеСпреваПерекусимДружелюбиеПоявитсяПотом(String arg0, String arg1) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException{
        $(By.xpath("(//button[@type='button'])[7]")).click();
        Configuration.timeout = 6000;
        $(By.xpath("//textarea[@id='editor-textarea']")).click();
        Configuration.timeout = 5000;
        getPageByTitle(arg0).getElementByName(arg1).sendKeys("Давайте спрева перекусим, дружелюбие появится потом");
    }

    @И("нажать на {string} кнопку {string}")
    public void нажатьНаКнопку(String site, String but) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException{
        getPageByTitle(site).getElementByName(but).click();
    }

    @И("на {string} проверить наличие {string}")
    public void наПроверитьНаличие(String site, String mess) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException{
        if (getPageByTitle(site).getElementByName(mess).isDisplayed()){
            System.out.println("visible");
        }else { System.out.println("dont visible");}
    }

    @И("перейти на {string} во вкладку {string}")
    public void перейтиНаВоВкладку(String site, String them) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException{
        getPageByTitle(site).getElementByName(them).click();
    }
}
