package com.automation.driver;

import com.automation.driver.browsers.ChromeDriverManager;
import com.automation.driver.browsers.FireFoxManager;
import com.automation.driver.browsers.IEDriverManager;

public class DriverManagerFactory {

    public static DriverManager getDriverManager(DriverType type) {
        DriverManager driverManager;
        switch (type) {
            case IE:
                driverManager = new IEDriverManager();
                break;
            case FIREFOX:
                driverManager = new FireFoxManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;
    }
}
