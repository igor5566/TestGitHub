package core.driver.browsers;

import core.driver.DriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications", "--start-maximized");
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
        this.driver = new ChromeDriver(options);
    }
}
