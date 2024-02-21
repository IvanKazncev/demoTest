package settings;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Configuration.*;

public class BaseTest {
    private static void setLocalDriver() {
        browser = "chrome";
        browserSize = "1920x1080";
        timeout = 5000;
        pageLoadTimeout = 100000000;
        headless = false;
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

    @BeforeEach
    void openPage(){
        Selenide.open("https://demoqa.com/automation-practice-form");
    }
}
