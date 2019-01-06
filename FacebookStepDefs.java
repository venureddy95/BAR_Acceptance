package com.barnardos.stepdefs;

import com.barnardos.pageobjects.FacebookPageObjects;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;


public class FacebookStepDefs {

    private FacebookPageObjects fbPageObjects = new FacebookPageObjects();

    private static String url = "https://www.facebook.com";

    private Scenario scenario;

//    @Before
//    public void runBeforeScenario(Scenario scenario) {
//        this.scenario = scenario;
//        fbPageObjects.openBrowser("chrome");
//    }

    @Given("^I am on facebook login page$")
    public void i_am_on_facebook_login_page() {
        fbPageObjects.navigate(url);
    }

    @Given("^I enter username \"([^\"]*)\"$")
    public void i_enter_username(String email){
        fbPageObjects.typeEmail(email);
    }

    @Given("^I enter password \"([^\"]*)\"$")
    public void i_enter_password(String password){
        fbPageObjects.typePassword(password);
    }

    @When("^I click on submit button$")
    public void i_click_on_submit_button(){
        fbPageObjects.clickOnLogin();
    }

    @Then("^I logged in$")
    public void i_logged_in(){
        Assert.assertTrue("not logged in", fbPageObjects.IsLoggedIn());
    }


//    Given("^I am on facebook login page$") {
//        fbPageObjects.navigate(url);
//    }
//
//    Given("^I enter username \"([^\"]*)\"$",(String email) ->
//
//    {
//        fbPageObjects.typeEmail(email);
//    });
//
//    Given("^I enter password \"([^\"]*)\"$",(String password) ->
//
//    {
//        fbPageObjects.typePassword(password);
//    });
//
//    When("^I click on submit button$",() ->
//
//    {
//        fbPageObjects.clickOnLogin();
//    });
//
//    Then("^I logged in$",() ->
//
//    {
//        //  Assert.assertEquals("Not logged in", );
//    });

//    @After
//    public void runAfterScenario() {
//        if (scenario.isFailed()) {
//            try{
//                // To create reference of TakesScreenshot
//                TakesScreenshot screenshot=(TakesScreenshot)fbPageObjects.driver;
//                // Call method to capture screenshot
//                File src=screenshot.getScreenshotAs(OutputType.FILE);
//                // Copy files to specific location
//                FileUtils.copyFile(src, new File("src/test/resources"+System.currentTimeMillis()+".png"));
//                System.out.println("Successfully captured a screenshot");
//            }catch (Exception e){
//                System.out.println("Exception while taking screenshot "+e.getMessage());
//            }
//        }
//        fbPageObjects.quit();
//    }
}
