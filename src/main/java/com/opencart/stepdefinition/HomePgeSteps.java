package com.opencart.stepdefinition;

import com.opencart.managers.DriverManager;
import com.opencart.pageobjects.HomePages;
import com.opencart.pageobjects.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomePgeSteps {
    WebDriver driver = DriverManager.getInstance().getDriver();
    RegisterPage registerPage = new RegisterPage(driver);
    @Given("Home Page is Displayed")
    public void homePageIsDisplayed() {
        System.out.println("The first step is executed");
    }

    @When("registerLink from Header menu is cliked")
    public void registerlinkFromHeaderMenuIsCliked() {
        System.out.println("The second step is executed.");
    }
}
