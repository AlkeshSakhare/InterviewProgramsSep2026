package com.ui.automation.pages;

import com.ui.automation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//*[@*='username']")
    WebElement usernameTxt;
    @FindBy(xpath = "//*[@*='password']")
    WebElement passwordTxt;
    @FindBy(xpath = "//*[@*='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@*='client brand banner']")
    WebElement logo;

    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    public void loginPage(String un, String pw) {
        log.info("Entering login credentials");
        testUtil.enterText(usernameTxt, un, false);
        testUtil.enterText(passwordTxt, pw, false);

        log.info("Clicking on Login button");
        testUtil.click(loginBtn);
    }

    public WebElement getOrangeHRMSLogo() {
        return logo;
    }
}
