package com.ui.automation.tests;

import com.ui.automation.base.TestBase;
import com.ui.automation.pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    private static final Logger log = LoggerFactory.getLogger(LoginPageTest.class);
    LoginPage loginPage;

    LoginPageTest() {
        super();
    }

    @BeforeMethod
    void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    void verifyLoginPage() {
        loginPage.loginPage(username, password);
        Assert.assertTrue(testUtil.elementDisplayed(loginPage.getOrangeHRMSLogo()));
    }
}
