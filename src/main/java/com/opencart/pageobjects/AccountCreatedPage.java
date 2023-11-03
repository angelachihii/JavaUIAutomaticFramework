package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends Page {
    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement logOutOption;

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    private WebElement accountIcon;

    public void logOutFromTheAccount() {
        accountIcon.click();
        logOutOption.click();
        System.out.println("The user is logged out.");
    }
}
