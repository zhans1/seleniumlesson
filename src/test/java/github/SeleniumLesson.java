package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SeleniumLesson {

    @Test
    void seleniumlesson(){
        open("https://github.com/");
        $("[data-scoped-placeholder=Search]").setValue("selenide").pressEnter();

    }

}
