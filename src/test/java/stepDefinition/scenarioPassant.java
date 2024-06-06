package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageFactory.carts;
import pageFactory.homePage;
import pageFactory.loginPage;
import utils.configReader;
import utils.elementutils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class scenarioPassant {
    WebDriver driver;
    loginPage login;
    homePage home;
    carts cart;
    elementutils element;

    Properties prop;
    configReader site;

    @Given("Je me rends sur le site SwagLabs")

    public void je_me_rends_sur_le_site_swag_labs() {
        site = new configReader();
        prop =site.ConfigurationManager();

        driver =  new ChromeDriver();
        driver.get(site.getUrl());
        driver.manage().window().maximize();
    }
    @When("Je saisie le username")
    public void je_saisie_le_username() {
            login=new loginPage(driver);
            login.setUser_name(site.getusername());

    }
    @When("Je saisie le password")
    public void je_saisie_le_password() {

        login.setPassword(site.getPassword());
    }
    @When("Je clique sur le bouton Login")
    public void je_clique_sur_le_bouton_login() throws InterruptedException {
        Thread.sleep(3000);

        login.setButton();
    }
    @Then("La page des produit s affichent")
    public void la_page_des_produit_s_affichent() {
        element=new elementutils(driver);

        element.confirmation("https://www.saucedemo.com/inventory.html");
    }
    @When("Je clique sur le bouton Add to cart du produit BackPack")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_back_pack() throws InterruptedException {
        home=new homePage(driver);
        Thread.sleep(3000);

        home.setAddCarte1();
    }
    @When("Je clique sur le bouton Add to cart du produit T-Shirt")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_t_shirt() {
        home.setAddCarte2();
    }
    @Then("Les produit s ajoutent dans le panier")
    public void les_produit_s_ajoutent_dans_le_panier() {
        element.validation("Remove");
    }
    @When("Je clique sur l icone panier")
    public void je_clique_sur_l_icone_panier() throws InterruptedException {
        home=new homePage(driver);
        Thread.sleep(3000);

        home.setShopping();
    }
    @When("Je clique sur le bouton remove")
    public void je_clique_sur_le_bouton_remove() {
        home.setRemoveButton();
    }

    @Then("Le produit sera supprimé du panier")
    public void le_produit_sera_supprimé_du_panier() {
        element=new elementutils(driver);
        element.validation("Remove");
    }

    @When("Je clique sur le bouton checkout")
    public void je_clique_sur_le_bouton_checkout() throws InterruptedException {
        cart=new carts(driver);
        Thread.sleep(3000);

        cart.setCheckoutButton();
    }
    @When("Je rempli le username")
    public void je_rempli_le_username() throws InterruptedException {
        Thread.sleep(3000);

        cart.setFirstName("Syrine");
    }
    @When("Je saisie le lastname")
    public void je_saisie_le_lastname() throws InterruptedException {
        Thread.sleep(3000);

        cart.setLastName("Boussaid");
    }
    @When("Je saisie le code postal")
    public void je_saisie_le_code_postal() throws InterruptedException {
        Thread.sleep(3000);

        cart.setCodePostal("8090");
    }
    @When("je clique sur le bouton continue")
    public void je_clique_sur_le_bouton_continue() throws InterruptedException {
        Thread.sleep(3000);

        cart.setContinueButton();
    }
    @Then("une page overview s affiche")
    public void une_page_overview_s_affiche() {
        element=new elementutils(driver);

        element.validation("Checkout: Overview");
   }
    @When("je clique sur le bouton finish")
    public void je_clique_sur_le_bouton_finish() throws InterruptedException {
        element.javaScriptscrollByPixels(5);
        Thread.sleep(3000);
        cart.setFinishbutton();
    }
    @Then("une page Checkout:Complete s affiche")
    public void une_page_checkout_complete_s_affiche() {
        element=new elementutils(driver);

        element.validation("Checkout: Complete!");

    }



    @When("Je clique sur le menu burger")
    public void je_clique_sur_le_menu_burger() {
        login=new loginPage(driver);
        login.setMenu();
    }

    @When("Je clique surle bouton Logout")
    public void je_clique_surle_bouton_logout() throws InterruptedException {
        Thread.sleep(3000);
        login.setLogoutButton();
    }

    @Then("Je me redirige vers la page d authentification {string}")
    public void je_me_redirige_vers_la_page_d_authentification(String string) {
        element=new elementutils(driver);

        element.validation("Swag Labs");

     }
}
