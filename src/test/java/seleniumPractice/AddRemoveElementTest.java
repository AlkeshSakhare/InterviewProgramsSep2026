package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddRemoveElementTest extends BaseTest {
    @Test
    void addremoveTest() throws InterruptedException {
        gotoPage("add_remove_elements/");
        waitForSeconds(2);
        WebElement addBtn = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        addBtn.click();
        waitForSeconds(2);
        List<WebElement> removeBtn = driver.findElements(By.xpath("//*[@id='elements']/button"));
        if (removeBtn.size() > 0) {
            Assert.assertTrue(true);
        } else Assert.assertFalse(false, "Button not added");
        removeBtn.get(0).click();
        removeBtn = driver.findElements(By.xpath("//*[@id='elements']/button"));
        if (removeBtn.size() == 0) {
            Assert.assertTrue(true);
        } else Assert.assertFalse(false, "Button not removed");
        waitForSeconds(2);
    }
}
