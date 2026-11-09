package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HoverTest extends BaseTest {
    @Test
    void hoverTest() {
        gotoPage("hovers");
        List<WebElement> avatarList = driver.findElements(By.cssSelector(".figure img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(avatarList.get(0));
        actions.perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='/users/1']")));
        element.click();
        String viewProfileText = driver.findElement(By.tagName("h1")).getText();
        System.out.println("viewProfileText : " + viewProfileText);
        Assert.assertTrue(viewProfileText.equals("Not Found"));
    }
}
