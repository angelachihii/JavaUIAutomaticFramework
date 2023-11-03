package com.opencart;

import com.opencart.pageobjects.HomePages;
import com.opencart.pageobjects.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class TestRegistrationFlowWithJunit {

    static WebDriver driver;
    HomePages homePages;
    RegisterPage registerPage;


    public static void beforeAll(){
        System.out.println("The execution starts");
    }

}
