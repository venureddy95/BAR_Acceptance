package com.barnardos.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebConnector {

    public static WebDriver driver;

    public void openBrowser(String browser) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                String errorMessage = String.format("browser %s not set", browser);
                throw new RuntimeException(errorMessage);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void navigate(String url) {
        driver.navigate().to(url);
    }

    protected void typeText(By element, String value){
        driver.findElement(element).sendKeys(value);
    }

    protected void click(By element) {
        driver.findElement(element).click();
    }

    protected boolean IsElementPresent(By element) {
        return driver.findElement(element).isDisplayed();
    }

    public void quit() {
        driver.quit();
    }
}
