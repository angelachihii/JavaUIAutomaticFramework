package com.opencart;

import com.opencart.managers.DriverManager;
import com.opencart.managers.RandomDataManager;
import com.opencart.pageobjects.HomePages;
import com.opencart.pageobjects.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextRunner {
    public static void main(String[] args) throws InterruptedException {
        DriverManager manager = DriverManager.getInstance();
        WebDriver driver = manager.getDriver();

        driver.get("https://andreisecuqa.host/");

        HomePages homePages = new HomePages(driver);
        homePages.navigateToRegisterPageFromHeader();

        RegisterPage registerPage = new RegisterPage(driver);

        String firstName = RandomDataManager.generateRandomFirstName();
        String lastName = RandomDataManager.generateRandomLastName();
        String email = RandomDataManager.generateRandomEmail();
        String password = RandomDataManager.generateRandomPassword();

        WebElement privacyPol = driver.findElement(By.cssSelector("input[value='1'][name='agree']"));
        privacyPol.click();
        WebElement registerBtn = driver.findElement(By.cssSelector("button[type='submit']"));

        registerPage.fillInTheRegisterForm(firstName, lastName, email, password);

        System.out.println("email");

        Thread.sleep(5000);

        registerPage.clickOnContinueButton();

        driver.quit();
        System.out.println("The execution is over.");


    }
}
