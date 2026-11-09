package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicControlTest extends BaseTest {

    @Test
    void removeCheckBoxTest() {
        //   gotoPage("dynamic_controls");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();

        WebElement loading = driver.findElement(By.cssSelector("#loading"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.until(ExpectedConditions.invisibilityOf(loading));

        WebElement addBtn = driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        Assert.assertTrue(addBtn.isDisplayed());
    }

    @Test
    void enableTextFieldTest() {
        gotoPage("dynamic_controls");
        WebElement inputText = driver.findElement(By.xpath("//input[@*='text']"));
        Assert.assertFalse(inputText.isEnabled());
        WebElement enableBtn = driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
        enableBtn.click();
        WebElement loading = driver.findElement(By.cssSelector("#loading"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.until(ExpectedConditions.invisibilityOf(loading));
        Assert.assertTrue(inputText.isEnabled());
    }
}
