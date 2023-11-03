package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePages extends Page{
    public HomePages(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//a[normalize-space()='Register']")
    private WebElement registerButton;

    public void navigateToRegisterPage(){
        registerButton.click();
        System.out.println("The MyAccount was clicked.");
    }

}
