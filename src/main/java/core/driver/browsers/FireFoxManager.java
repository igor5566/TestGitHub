package core.driver.browsers;

import core.driver.DriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver.exe");
        this.driver = new FirefoxDriver();
    }
}
