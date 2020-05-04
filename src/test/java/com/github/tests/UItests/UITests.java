package com.github.tests.UItests;

import core.utils.MavenUtils;
import com.github.base.BaseTest;
import core.utils.TestListener;
import com.github.pages.LoginPage;
import com.github.pages.MainPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@Listeners({TestListener.class})
public class UITests extends BaseTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private MainPage mainPage;
    private final String url = "http://github.com/login";

    @BeforeTest
    public void setUp(ITestContext context) {
        driver = getDriver();
        context.setAttribute("webDriver", driver);
    }

    @Test(description = "Verify Home page is opened.")
    public void loginTest() {
        open(url);
        loginPage = new LoginPage(driver);
        mainPage = loginPage.logIn(MavenUtils.getEmail(), MavenUtils.getPass());
        log.info("Some info from logger.");
        assertThat(mainPage.isDashboardVisible()).as("Cannot login into the account.").isTrue();
    }
}
