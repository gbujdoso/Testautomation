package hu.masterfield.tesco.steps;

import hu.masterfield.tesco.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TescoSteps {

    @Before
    public static void setup() {
        /* driver init */
    }

    @After
    public static void cleanup() {
        /* driver close */
    }

    @io.cucumber.java.en.Given("^nyito oldalon vagyok$")
    public void nyitoOldalonVagyok() {
        HomePage homePage = new HomePage();
        homePage.open();
    }

    @io.cucumber.java.en.And("^minden cookiet elfogadtam$")
    public void mindenCookietElfogadtam() {
        HomePage homePage = new HomePage();
        homePage.acceptCookies();
    }

    @io.cucumber.java.en.And("^a nyelv magyarra van beallitva$")
    public void aNyelvMagyarraVanBeallitva() {
    }

    @io.cucumber.java.en.When("^keresek egy letezo termeket$")
    public void keresekEgyLetezoTermeket() {

    }

    @io.cucumber.java.en.Then("^megjelenik a talalati lista$")
    public void megjelenikATalalatiLista() {
    }
}
