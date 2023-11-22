package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {

    private WebDriver driver = Hooks.getDriver();



    @Given("^El usuario se encuentra en la pagina Home de imalittleatester$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittleatester() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String titleHomePage = "Testing | imalittletester";
        Assert.assertEquals(titleHomePage,driver.getTitle());
    }

    @When("^hace click sobre el boton The little tester comics$")
    public void hace_click_sobre_el_boton_The_little_tester_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement latestComics = driver.findElement(By.id("comp-iiyocj9v5label"));
        latestComics.click();
    }

    @Then("^se debe redirigir a la pantlla comics$")
    public void se_debe_redirigir_a_la_pantlla_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement pageTitleLocator = driver.findElement(By.cssSelector("#comp-lc61aui31 > h2 > span > span > span"));
        Assert.assertTrue("No se redirecciono correctamente a la pagina de comics",pageTitleLocator.isDisplayed());
        Assert.assertEquals("HE LITTLE TESTER COMICS SERIES",pageTitleLocator.getText());
    }

}
