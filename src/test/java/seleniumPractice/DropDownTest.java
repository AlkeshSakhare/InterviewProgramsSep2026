package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {
    @Test
    void selectDDTest() throws InterruptedException {
        gotoPage("dropdown");
        WebElement dropdownBtn = driver.findElement(By.id("dropdown"));

        Assert.assertTrue(dropdownBtn.isDisplayed(), "Element is not displayed");

        Select dropdown = new Select(dropdownBtn);
        // no of dropdown list items
        System.out.println("No of items: " + dropdown.getOptions().size());
        for (int i = 0; i < dropdown.getOptions().size(); i++) {
            System.out.println("Options :" + i + " " + dropdown.getOptions().get(i).getText());
        }
        //select by visibleText
        dropdown.selectByVisibleText("Option 1");
        waitForSeconds(3);
        //select by index
        dropdown.selectByIndex(2);
        waitForSeconds(2);
    }
}
