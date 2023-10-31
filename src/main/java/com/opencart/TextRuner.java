package com.opencart;

import com.opencart.managers.DriverManager;
import com.opencart.managers.RandomDataManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TextRuner {
    public static void main(String[] args) throws InterruptedException {
       DriverManager manager= DriverManager.getInstance();
        WebDriver driver = manager.getDriver();

        String currentWindowName = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://opencart.antropy.co.uk/");
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        driver.close();
        WebElement myAcauntIcon = driver.findElement(By.xpath(".fa-solid.fa-user"));
        myAcauntIcon.click();
        WebElement registerOption = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        registerOption.click();
        System.out.println(driver.getCurrentUrl());

        WebElement firstNameInput = driver.findElement(By.id("input-firstname"));
        String firstName = RandomDataManager.generateFirstName();
        firstNameInput.sendKeys("firstName");
     System.out.println("firstName");

        WebElement lastNameInput = driver.findElement(By.cssSelector("#input-lastname"));
        String lastName = RandomDataManager.generateLastName();
        lastNameInput.sendKeys("lastName");
     System.out.println("lastName");

        WebElement emailImput = driver.findElement(By.cssSelector("#input-email"));
        String email = RandomDataManager.generateRandomEmail();
        emailImput.sendKeys("email");
     System.out.println("email");

        WebElement phoneInput = driver.findElement(By.cssSelector("#input-telephone"));
        String phoneNumber = RandomDataManager.generatePhoneNumber();
        phoneInput.sendKeys("phoneNumber");
     System.out.println("phoneNumber");

        WebElement passwordInput = driver.findElement(By.cssSelector("#input-password"));
        String password = RandomDataManager.generatePasword();
        passwordInput.sendKeys( password);

        WebElement conffirnPaswordInput = driver.findElement(By.cssSelector("#input-confirm"));
        conffirnPaswordInput.sendKeys(password);

        WebElement termsAndConditions = driver.findElement(By.cssSelector("div[id='information-information'] li:nth-child(1) a:nth-child(1)"));
        termsAndConditions.click();
        WebElement registerButton = driver.findElement(By.cssSelector("button[type='submit']"));

        Thread.sleep(3000);



        driver.switchTo().window(currentWindowName);
        driver.get("https://www.pexels.com/search/HD%20wallpaper/");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.quit();
        System.out.println("The execution is over. ");
        driver.close();
        driver.quit();
    }
}