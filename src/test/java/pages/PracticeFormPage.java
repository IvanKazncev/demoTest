package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import data.ValidData;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPage {

    SelenideElement nameInput = $("#firstName");
    SelenideElement lastNameInput = $("#lastName");
    SelenideElement pageName = $(".text-center");

    public PracticeFormPage setName(String name){
        nameInput.setValue(name);
        return this;
    }
    public PracticeFormPage setLastName(String name){
        lastNameInput.setValue(name);
        return this;
    }
    public PracticeFormPage checkPageName(String name){
        Assertions.assertEquals(name,pageName.getText(),"Что то не так");
        return this;
    }
}
