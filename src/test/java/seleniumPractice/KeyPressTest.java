package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class KeyPressTest extends BaseTest {
    @Test
    void keyPressTest() throws InterruptedException {
        gotoPage("key_presses");
        WebElement input = driver.findElement(By.id("target"));
        input.sendKeys(Keys.ESCAPE);
        waitForSeconds(2);
        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());
    }
}
