package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutoCompleteTest extends BaseTest {
    @Test
    void autocompleteTest() throws InterruptedException {
        gotoPage("autocomplete");
        enterFruitInitialAndFullName("p", "Pineapple");
        enterFruitInitialAndFullName("a", "Apricot");
    }

    void enterFruitInitialAndFullName(String initial, String fruit) throws InterruptedException {
        WebElement input = driver.findElement(By.id("autocomplete"));
        input.clear();
        input.sendKeys(initial);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#suggestions li")));
        // Print suggestions
        suggestions.forEach(e -> System.out.println(e.getText()));
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().equalsIgnoreCase(fruit)) {
                suggestion.click();
                break;
            }
        }
        String result = driver.findElement(By.id("selected")).getText();
        System.out.println(result);
        Assert.assertTrue(result.contains(fruit));
        waitForSeconds(2);
    }
}
