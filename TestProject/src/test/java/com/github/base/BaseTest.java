package com.github.base;

import com.automation.driver.DriverManager;
import com.automation.driver.DriverManagerFactory;
import com.automation.driver.DriverType;
import com.automation.utils.MavenUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

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
