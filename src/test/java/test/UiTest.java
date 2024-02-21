package test;


import data.PracticeFormPageData;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import settings.BaseTest;


public class UiTest extends BaseTest {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    PracticeFormPageData practiceFormPageData = new PracticeFormPageData();

    @Test
    void openPageCheck() {
        practiceFormPage.setFirstName(practiceFormPageData.getFirstName())
                .submitButtonClick()
                .titleCheck(practiceFormPageData.getTitle());
    }
}
