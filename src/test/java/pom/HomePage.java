package pom;

import org.openqa.selenium.By;


public class HomePage {
   private String titleHomePage = "Testing | imalittletester";
    private By latestComics = By.id("comp-iiyocj9v5label");

    public By getLatestComics() {
        return latestComics;
    }

    public String getTitleHomePage() {
        return titleHomePage;
    }
}
