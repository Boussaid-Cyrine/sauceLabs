package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
//    driver.get("https://www.saucedemo.com");
    @FindBy(id = "user-name")
    WebElement user_name;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-button")
    WebElement login_button;
    @FindBy(id = "react-burger-menu-btn")
    WebElement menuButton;
    @FindBy(id = "logout_sidebar_link")
    WebElement logOutButton;
    WebDriver driver;
    public loginPage(WebDriver driver){
        this.driver= driver ;
        PageFactory.initElements(driver,this);

    }
    public void setUser_name(String name) {
        user_name.sendKeys(name);
    }
    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }
    public void setButton() {
        login_button.click();
    }

    public void setMenu() {
        menuButton.click();
    }

    public void setLogoutButton() {
        logOutButton.click();
    }
}
