package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoFactorTest extends BaseTest {
    @Test
    void twoFactorLoginTest() {
        gotoPage("two_factor");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        String otp = driver.findElement(By.id("otp-code")).getText();
        driver.findElement(By.id("code")).sendKeys(otp);
        driver.findElement(By.cssSelector("[type='submit']")).click();
        String expectedsuccessMSG = "Welcome! You logged in with a password and a one-time code.";
        String actualsuccessMSG = driver.findElement(By.cssSelector(".subheader")).getText();
        System.out.println("actualsuccessMSG : " + actualsuccessMSG);
        Assert.assertEquals(actualsuccessMSG, expectedsuccessMSG);
        WebElement logoutBtn = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
        logoutBtn.click();
        String actuallogoutMsg = driver.findElement(By.id("flash")).getText();
        String expectedLogoutMsg = "You logged out of the secure area!";
        System.out.println("actuallogoutMsg :" + actuallogoutMsg);
        Assert.assertTrue(actuallogoutMsg.contains(expectedLogoutMsg));
    }
}
