package com.github.base;

import core.driver.DriverManager;
import core.driver.DriverManagerFactory;
import core.driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {

    private DriverManager driverManager;
    private WebDriver driver;

    public WebDriver getDriver(DriverType type) {
        driverManager = DriverManagerFactory.getDriverManager(type);
        return this.driver = driverManager.getWebDriver();
    }

    public void open(String url) {
        driver.get(url);
    }

    @AfterSuite
    public void threadDown() {
        driverManager.quitWebDriver();
    }
}
