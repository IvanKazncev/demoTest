package data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class PracticeFormPageData {
    Faker faker = new Faker(new Locale("RU"));
    private final String firstName = faker.name().firstName();
    private final String title = "Practice Form";

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }
}
