package com.opencart.stepdefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/opencart/features",
        glue = "com.opencart.stepdefinitions",
    tags = ""
)

public class CucumberTestRunner {
}
