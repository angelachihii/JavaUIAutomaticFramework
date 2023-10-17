package com.opencart.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
    private static String webDriverType = "Chrome";
    private  static DriverManager instance;
    private WebDriver driver;

private  DriverManager(){
    switch (webDriverType.toUpperCase()){
        case "CHROME":
            driver = new ChromeDriver();
            System.out.println("The Chrome Drive is valid.");
    break;
        case "FIREFOX":
            driver = new FirefoxDriver();
            System.out.println("The Fire Fox Driver is valid.");
break;
        case "SAFARI":
            driver = new SafariDriver();
            System.out.println("The Safari driver is valid.");
break;
        default:
            System.out.println("There is not such a driver." + webDriverType);
    }
}
public static DriverManager getInstance(){
    if (instance == null){
        instance = new DriverManager();
    }
    return instance;
}
public  WebDriver getDriver(){
    return driver;
}


}
