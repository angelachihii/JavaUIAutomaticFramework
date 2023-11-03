package com.opencart.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    private static String webDriverType = "CHROME";
    private static DriverManager instance;
    private WebDriver driver;

    private DriverManager() {
        switch (webDriverType.toUpperCase()) {
            case "CHROME":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("ignore-certificate-errors");
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                System.out.println("The Chrome Driver is initiated.");
                break;
            default:
                System.out.println("There is no such driver: " + webDriverType);
        }
    }

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }


    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver has been closed.");
        }
    }
}
