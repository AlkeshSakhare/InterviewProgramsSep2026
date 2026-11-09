package seleniumPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SPATest extends BaseTest {
    @Test
    void verifyRouteTest() throws InterruptedException {
        gotoPage("spa");
        waitForSeconds(2);

        //goto about page and verify content
        gotoPage("spa/about");
        String actualAboutText = driver.findElement(By.id("view-text")).getText();
        Assert.assertEquals(actualAboutText, "This view was drawn by JavaScript.");
        waitForSeconds(2);

        //goto contact page and verify content
        gotoPage("spa/contact");
        String actualContactText = driver.findElement(By.id("view-text")).getText();
        Assert.assertEquals(actualContactText, "Write to us at contact@example.com.");
        waitForSeconds(2);

        //goto Home page and verify content
        gotoPage("spa");
        String actualHomeText = driver.findElement(By.id("view-text")).getText();
        Assert.assertEquals(actualHomeText, "Welcome to the single-page app.");
        waitForSeconds(2);

    }
}
