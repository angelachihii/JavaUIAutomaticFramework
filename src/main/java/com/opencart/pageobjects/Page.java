package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

public class Page {

    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//i[@class='fa-solid fa-user']")
    protected WebElement myAccountIcon;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    protected WebElement registerBtn;

    @FindBy (xpath = "")
    protected WebElement loginBtn;

    protected Page(){

    }

    public void navigateToRegisterPageFromHeader(){
        myAccountIcon.click();
        registerBtn.click();
    }

    public void navigateToLoginFromHeader() {
        myAccountIcon.click();
        loginBtn.click();
    }
}

