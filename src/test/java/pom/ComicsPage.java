package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComicsPage {
    private By pageTitleLocator = By.cssSelector("#comp-lc61aui31 > h2 > span > span > span");
    private String titlePage = "HE LITTLE TESTER COMICS SERIES";

    public String getTitlePage() {
        return titlePage;
    }

    public By getPageTitleLocator() {
        return pageTitleLocator;
    }
}
