package com.barnardos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@donate",
        glue = "com.barnardos.stepdefs",
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class donateRunner {
}
