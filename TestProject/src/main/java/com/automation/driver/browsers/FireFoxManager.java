package com.automation.driver.browsers;

import com.automation.driver.DriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver.exe");
        this.driver = new FirefoxDriver();
    }
}
