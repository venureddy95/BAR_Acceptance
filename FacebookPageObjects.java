package com.barnardos.pageobjects;

import com.barnardos.util.WebConnector;
import org.openqa.selenium.By;

public class FacebookPageObjects extends WebConnector {

    private By email = By.id("email");
    private By pass = By.name("pass");
    private By submit = By.xpath("//input[@value='Log In']");
    private By homeLink = By.linkText("Home");

    public void typeEmail(String emailId) {
        typeText(email, emailId);
    }

    public void typePassword(String password) {
        typeText(pass, password);
    }

    public void clickOnLogin() {
        click(submit);
    }

    public boolean IsLoggedIn() {
        return IsElementPresent(homeLink);
    }
}
