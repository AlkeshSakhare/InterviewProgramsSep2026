package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptAlertTest extends BaseTest {

    @Test
    void jsTest() throws InterruptedException {
        gotoPage("javascript_alerts");
        // accept js alert
        WebElement alertBtn = driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]"));
        alertBtn.click();
        Alert alert = driver.switchTo().alert();
        String alertMSG = alert.getText();
        System.out.println("Alert MSG: " + alertMSG);
        alert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());
        waitForSeconds(2);

        // dismiss confirm alert
        WebElement confirmAletBtn = driver.findElement(By.xpath("//*[contains(text(),'Click for JS Confirm')]"));
        confirmAletBtn.click();
        Alert confirmalert = driver.switchTo().alert();
        String confirmAlertMSG = confirmalert.getText();
        System.out.println("Alert MSG: " + confirmAlertMSG);
        confirmalert.dismiss();
        System.out.println(driver.findElement(By.id("result")).getText());
        waitForSeconds(2);

        // send input to prompt
        driver.findElement(By.xpath("//*[contains(text(),'Click for JS Prompt')]")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt MSG: " + promptAlert.getText());
        promptAlert.sendKeys("Im Entering Text here");
        promptAlert.accept();
        System.out.println(driver.findElement(By.id("result")).getText());
        waitForSeconds(2);
    }
}
