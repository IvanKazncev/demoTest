package test;
import data.ValidData;
import org.junit.jupiter.api.Test;

import pages.PracticeFormPage;
import settings.BaseTest;

import static com.codeborne.selenide.Selenide.*;


public class UiTest extends BaseTest {
    ValidData validData = new ValidData();
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    @Test
    void openPageCheck(){
        open("https://demoqa.com/automation-practice-form");
        practiceFormPage.setName(validData.getName())
                        .setLastName(validData.getLastName())
                .checkPageName(validData.getPageName());
    }
}
