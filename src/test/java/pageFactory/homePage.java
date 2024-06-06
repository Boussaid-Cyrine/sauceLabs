package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCarte1;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCarte2;
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;
    @FindBy(id = "logout_sidebar_link")
    WebElement logOutButton;
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement shoppingButton;
    @FindBy(id="remove-sauce-labs-backpack")
    WebElement removeButton;



    WebDriver driver;
    public homePage(WebDriver driver){
        this.driver= driver ;
        PageFactory.initElements(driver,this);

    }
    public void setAddCarte1() {
        addToCarte1.click();
    }
    public void setAddCarte2() {
        addToCarte2.click();
    }
    public void setShopping() {
        shoppingButton.click();
    }
    public void setMenu() {
        menuButton.click();
    }
    public void setLogoutButton() {
        logOutButton.click();
    }
    public void setRemoveButton() {
        removeButton.click();
    }

}
