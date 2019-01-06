package com.barnardos.stepdefs;
import com.barnardos.pageobjects.donatePageObjects;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class donateStepDefs {

    private donatePageObjects donatePO= new donatePageObjects();
    private static String url = "https://barnardos:believe@dev.barnardos.org.uk/search-anything";
    private Scenario scenario;

    @Before
    public void runBeforeScenario(Scenario scenario) {
        this.scenario = scenario;
        donatePO.openBrowser("firefox");
    }

    @Given("^I am on donate page$")
    public void i_am_on_donate_page() {
        donatePO.navigate(url);
    }

    @When("^I enter all the mandatory donation fileds$")
    public void i_enter_all_the_mandatory_donation_fileds() throws Throwable {

    }

    @When("^I choose to pay using Card$")
    public void i_choose_to_pay_using_Card() throws Throwable {

    }

    @Then("^I verify the Paysage page is displayed$")
    public void i_verify_the_Paysage_page_is_displayed() throws Throwable {

    }

    @When("^I enter all the mandatory payment details$")
    public void i_enter_all_the_mandatory_payment_details() throws Throwable {

    }

    @When("^click on Pay now button$")
    public void click_on_Pay_now_button() throws Throwable {

    }

    @Then("^I verify the payment successful page displayed to the user$")
    public void i_verify_the_payment_successful_page_displayed_to_the_user() throws Throwable {

    }

    @After
    public void runAfterScenario() {
        if (scenario.isFailed()) {
            try{
                // To create reference of TakesScreenshot
                TakesScreenshot screenshot=(TakesScreenshot)donatePO.driver;
                // Call method to capture screenshot
                File src=screenshot.getScreenshotAs(OutputType.FILE);
                // Copy files to specific location
                FileUtils.copyFile(src, new File("src/test/resources"+System.currentTimeMillis()+".png"));
                System.out.println("Successfully captured a screenshot");
            }catch (Exception e){
                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
        }
        donatePO.quit();
    }
}
