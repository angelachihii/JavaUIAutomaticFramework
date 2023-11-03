package com.opencart.pageobjects;

import com.opencart.managers.ScrollManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Page {
public RegisterPage(WebDriver driver){
    super();
}
@FindBy (id = "input-firstname")
    private WebElement firstNameInput;
@FindBy(id = "input-lastname")
    private  WebElement lastNameInput;
@FindBy(id = "input-email")
    private WebElement emailInput;
@FindBy(id = "input-password")
    private WebElement passwordInput;

@FindBy(css = "input[name='agree;]")
private WebElement getPrivacyToggle;

@FindBy(xpath = "//button[normalize-space()='Continue]")
    private WebElement continueButton;

public void  fillInTheRegisterFrom(String firstName,String lastName, String email,String password){
    firstNameInput.sendKeys(firstName);
    System.out.println("The entered first name is :"+ firstName);

    lastNameInput.sendKeys(lastName);
    System.out.println("The entered last name is:"+ lastName);

    emailInput.sendKeys(email);
    System.out.println("The entered email is:"+ email);

    passwordInput.sendKeys(password);
    System.out.println("The entered password is :"+ password);

    if (getPrivacyToggle.isDisplayed() && getPrivacyToggle.isEnabled()){
        ScrollManager.scrollToTheElement(getPrivacyToggle);
        getPrivacyToggle.click();
    }

}

    public void clickOnContinueButton() {
    }
}
