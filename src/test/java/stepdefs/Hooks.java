package stepdefs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    @Before
    public void before() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Configuration.timeout = 10000;
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\Chromedriver.exe");
        Configuration.timeout = 10000;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
        System.out.println("Мы в бефор хукс");
    }

    @After
    public void after() {
        //WebDriverRunner.closeWebDriver();
    }
}
