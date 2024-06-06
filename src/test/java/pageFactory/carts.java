package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class carts {

    @FindBy(id="checkout")
    WebElement checkoutButton;
    @FindBy(id="first-name")
    WebElement firstName;
    @FindBy(id="last-name")
    WebElement lastName;
    @FindBy(id="postal-code")
    WebElement postalCode;
    @FindBy(id="continue")
    WebElement continueButton;
    @FindBy(id="finish")
    WebElement finishButton;


    WebDriver driver;
    public carts(WebDriver driver){
        this.driver= driver ;
        PageFactory.initElements(driver,this);

    }

    public void setCheckoutButton() {
        checkoutButton.click();
    }
    public void setFirstName(String first_Name) {
        firstName.sendKeys(first_Name);
    }
    public void setLastName(String Last_Name) {
        lastName.sendKeys(Last_Name);
    }
    public void setCodePostal(String code_Postal) {
        postalCode.sendKeys(code_Postal);
    }
    public void setContinueButton() {
        continueButton.click();
    }
    public void setFinishbutton() {
        finishButton.click();
    }
}
