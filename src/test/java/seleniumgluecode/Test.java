package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test extends TestBase {

    @Given("^El usuario se encuentra en la pagina Home de imalittleatester$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittleatester() throws Throwable {
        Assert.assertEquals(homePage.getTitleHomePage(),driver.getTitle());
    }

    @When("^hace click sobre el boton The little tester comics$")
    public void hace_click_sobre_el_boton_The_little_tester_comics() throws Throwable {
        WebElement latestComics = driver.findElement(homePage.getLatestComics());
        latestComics.click();
    }

    @Then("^se debe redirigir a la pantlla comics$")
    public void se_debe_redirigir_a_la_pantlla_comics() throws Throwable {
        WebElement pageTitleLocator = driver.findElement(comicsPage.getPageTitleLocator());
        Assert.assertTrue("No se redirecciono correctamente a la pagina de comics",pageTitleLocator.isDisplayed());
        Assert.assertEquals(comicsPage.getTitlePage(),pageTitleLocator.getText());
    }

}
