package core.driver;

import core.driver.browsers.ChromeDriverManager;
import core.driver.browsers.FireFoxManager;
import core.driver.browsers.IEDriverManager;

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
