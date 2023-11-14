package com.opencart.stepdefinition;

import com.opencart.managers.DriverManager;
import com.opencart.managers.RandomDataManager;
import com.opencart.pageobjects.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RegisterPageSteps {
    WebDriver driver = DriverManager.getInstance().getDriver();
    RegisterPage registerPage = new RegisterPage(driver);

    @When("the register form is populated with valid random data")
    public void theRegisterFormIsPopulatedWithValidRandomData() {
        String randomEmail = RandomDataManager.generateRandomEmail();
        String password = RandomDataManager.generateRandomPassword();

        System.out.println(randomEmail);
        System.out.println(password);

        registerPage.fillInTheRegisterFrom(RandomDataManager.generateRandomFirstName(),
                RandomDataManager.generateRandomLastName(),randomEmail,password);
        registerPage.fillInTheRegisterFrom(RandomDataManager.generateRandomFirstName(),RandomDataManager.generateRandomLastName(),randomEmail,password);

        System.out.println("The register form is populated with valid random data");
    }

    @And("Continue button is cliked")
    public void continueButtonIsCliked() {
        registerPage.clickOnContinueButton();
        System.out.println("The register button has been clicked");
    }
}
