package com.github.tests.UItests;

import com.automation.utils.MavenUtils;
import com.github.base.BaseTest;
import com.github.base.TestListener;
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

    @BeforeTest
    public void setUp(ITestContext context) {
        driver = getDriver(MavenUtils.getDriverType());
        context.setAttribute("webDriver", driver);
    }

    @Test(description = "Verify Home page is opened.")
    public void loginTest() {
        open(MavenUtils.getUrl());
        loginPage = new LoginPage(driver);
        mainPage = loginPage.logIn(MavenUtils.getEmail(), MavenUtils.getPass());
        log.info("Some info");
        assertThat(mainPage.isDashboardVisible()).as("Cannot login into the account.").isTrue();
    }
}
