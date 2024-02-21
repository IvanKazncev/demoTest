package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeFormPage {
    SelenideElement firstName = $("#firstName");
    SelenideElement submitButton = $("#submit");
    SelenideElement title = $(".text-center");

    public PracticeFormPage setFirstName(String name){
        firstName.setValue(name);
        return this;
    }
    public PracticeFormPage submitButtonClick(){
        submitButton.scrollIntoView(true).click();
        return this;
    }
    public PracticeFormPage titleCheck(String name){
        assertEquals(name,title.getText(),"Что-то не так");
        return this;
    }
}
