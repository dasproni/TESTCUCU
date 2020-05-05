public class Apptest {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\Chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
    }

    @Test
    public void A_loginTest() {
        open("https://dev.n7lanit.ru/");
        open("https://regex101.com/");

    }

    @Test
    public void B_chooseRandom() {

    }

    @Test
    public void C_anotherOne() {

    }
}
