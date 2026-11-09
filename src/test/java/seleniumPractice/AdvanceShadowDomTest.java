package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdvanceShadowDomTest extends BaseTest {
    @Test
    void advancedshadowdom() throws InterruptedException {
        gotoPage("shadowdom_advanced");
        WebElement result = driver.findElement(By.id("nested-result"));
        System.out.println(result.getText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = (WebElement) js.executeScript("return document.querySelector('outer-card').shadowRoot.querySelector('inner-card').shadowRoot.querySelector('button')");
        button.click();
        waitForSeconds(2);
        System.out.println(result.getText());

        WebElement star5button = (WebElement) js.executeScript("return document.querySelector('star-rating').shadowRoot.querySelector('#star-5')");
        star5button.click();
        System.out.println(star5button.getText());
        waitForSeconds(2);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String rating = driver.findElement(By.id("form-result")).getText();
        System.out.println(rating);
        Assert.assertTrue(rating.equals("Submitted name: , rating: 5"));
    }
}
