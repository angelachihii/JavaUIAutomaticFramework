package com.opencart.stepdefinition;

import com.opencart.managers.DriverManager;
import com.opencart.managers.RandomDataManager;
import com.opencart.pageobjects.HomePages;
import com.opencart.pageobjects.LoginPage;
import com.opencart.pageobjects.RegisterPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestRegistrationFlow {
    static WebDriver driver;
    HomePages homePages;
    RegisterPage registerPage;

    @BeforeAll
    public static void executeThisMethodBeforeAllTheTests(){
        System.out.println("The execution of the test suite has started.");
    }

    @BeforeEach
    public void executeTheCodeBeforeEachTest(){
        System.out.println("The code is executed before each test case.");
        driver = DriverManager.getInstance().getDriver();
        driver.get("https://andreisecuqa.host/");
        homePages = new HomePages(driver);
        registerPage = new RegisterPage(driver);
        homePages.navigateToRegisterPageFromHeader();
    }
    @Test
    @DisplayName("The registration of a new user with valid data redirect to the Account Page")
    public void test1() throws InterruptedException {
        System.out.println("This is the test number1");

        String firstName = RandomDataManager.generateRandomFirstName();
        String lastName = RandomDataManager.generateRandomLastName();
        String randomEmail = RandomDataManager.generateRandomEmail();
        String password = RandomDataManager.generateRandomPassword();

        System.out.println(randomEmail);
        System.out.println(password);

        registerPage.fillInTheRegisterFrom(RandomDataManager.generateRandomFirstName(),
                RandomDataManager.generateRandomLastName(),randomEmail,"1");

        registerPage.clickOnContinueButton();
Thread.sleep(500);
        String currentUrl =driver.getCurrentUrl();

        boolean doesAccountUrlContainSuccessAccountRute =currentUrl.contains("route=account/success");
    Assertions.assertTrue(doesAccountUrlContainSuccessAccountRute,"The current Url"+currentUrl+" contains:route=account/success");
    }

    @Test
    @DisplayName("The test is remaining on Register page when trying to register with invalid password")
    public void test2(){
        System.out.println("This is the test number2");

        String firstName = RandomDataManager.generateRandomFirstName();
        String lastName = RandomDataManager.generateRandomLastName();
        String randomEmail = RandomDataManager.generateRandomEmail();
        String password = RandomDataManager.generateRandomPassword();

        System.out.println(randomEmail);
        System.out.println(password);

        registerPage.fillInTheRegisterFrom(RandomDataManager.generateRandomFirstName(),
                RandomDataManager.generateRandomLastName(),randomEmail,password);

        registerPage.clickOnContinueButton();
String actualUrl = driver.getCurrentUrl();
String expectedUrl = "https://andreisecuqa.host/index.php?route=account/register&language=en-gb";

Assertions.assertEquals(expectedUrl,actualUrl,"The Url should be equals");


    }
    @Test
    @DisplayName("Error message is displayed on Register flow when password is less than 4 chars")
    public void errorMessageIsDisplayedWhenInvalidDataIsUsedForRegisterFlow()throws InterruptedException{
        System.out.println("This is the test number2");

        String randomEmail = RandomDataManager.generateRandomEmail();
        System.out.println(randomEmail);
        String randomPassword = RandomDataManager.generateRandomPassword();
        System.out.println(randomPassword);

        registerPage.fillInTheRegisterFrom(RandomDataManager.generateRandomFirstName(),
                RandomDataManager.generateRandomLastName(),randomEmail,"Aa1");

        registerPage.clickOnContinueButton();
        Thread.sleep(500);
        String expectedErrorMessageForInvalidPassword = "Password must be between 4 and 20 characters.";
      String actualErrorMessage = driver.findElement(By.id("error-password")).getText();

        Assertions.assertEquals(expectedErrorMessageForInvalidPassword,actualErrorMessage);
    }
    @AfterEach
    public void afterEachTestCase(){
        DriverManager.getInstance().tearDown();
        System.out.println(("The test case execution has been finished."));
    }

    @AfterAll
    public static void afterAllMethod(){
        System.out.println("The test suite execution is finished");
    }

    }

