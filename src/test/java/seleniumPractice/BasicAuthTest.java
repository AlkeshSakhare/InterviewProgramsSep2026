package seleniumPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest {

    @Test
    void basicAuthTest() throws InterruptedException {
        gotoPage("basic_auth");
        String username = "admin";
        String password = "admin";
        driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
        String expectedSuccessMSG = "Congratulations! You must have the proper credentials.";
        waitForSeconds(2);
        String actualSuccessMSG = driver.findElement(By.tagName("p")).getText();
        System.out.println("actualSuccessMSG: " + actualSuccessMSG);
        Assert.assertEquals(actualSuccessMSG, expectedSuccessMSG);
    }
}
