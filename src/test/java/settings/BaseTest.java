package settings;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.browserCapabilities;

public class BaseTest {
    private static void setLocalDriver() {
        browser = "chrome";
        browserSize = "1920x1080";
        headless = false;
        timeout = 3000;
        pageLoadTimeout = 10000000;
        downloadsFolder = "target";
        var options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--allow-running-insecure-content");
        browserCapabilities = options;
    }
    @BeforeAll
    static void setUp(){
        setLocalDriver();
    }
    @AfterEach
    void tearDown(){
        Selenide.closeWebDriver();
    }
}
