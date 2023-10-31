package com.opencart;

import com.opencart.managers.DriverManager;
import com.opencart.managers.RandomDataManager;
import com.opencart.pageobjects.HomePages;
import com.opencart.pageobjects.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TextRunerWithPageObject {
    public static void main(String[] args) throws InterruptedException {
       DriverManager manager= DriverManager.getInstance();
        WebDriver driver = manager.getDriver();
        driver.get("https://opencart.antropy.co.uk/");

        HomePages homePage = new HomePages( driver);
        homePage.navigateToRegisterPageFromHeader();

        RegisterPage registerPage = new RegisterPage(driver);

        //Thread.sleep(4000);
        //System.out.println(driver.getTitle());
        //driver.close();
        //System.out.println(driver.getCurrentUrl());


        String email = RandomDataManager.generateRandomEmail();
        System.out.println("email");



        String password = RandomDataManager.generatePasword();


        WebElement termsAndConditions = driver.findElement(By.cssSelector("div[id='information-information'] li:nth-child(1) a:nth-child(1)"));
        termsAndConditions.click();
        WebElement registerButton = driver.findElement(By.cssSelector("button[type='submit']"));

        Thread.sleep(3000);
        //driver.switchTo().window(currentWindowName);

     registerPage.clickTheContinueButton();

        driver.quit();
     System.out.println("The execution is over. ");
    }
}