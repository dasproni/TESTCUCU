package stepdefs;

import com.codeborne.selenide.Condition;
import cucumber.api.java.ru.И;

import java.lang.reflect.InvocationTargetException;

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
        getPageByTitle(site).getElementByName(tabName);
    }

    @И("на странице {string} ввести логин в поле {string}")
    public void наСтраницеВвестиЛогинВПоле(String site, String login) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        getPageByTitle(site).getElementByName(login);
    }
}
