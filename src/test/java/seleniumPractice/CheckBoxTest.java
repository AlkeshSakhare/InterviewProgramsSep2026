package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxTest extends BaseTest {

    @Test
    void checkboxTest() throws InterruptedException {
        gotoPage("checkboxes");
        waitForSeconds(2);
        List<WebElement> checkBoxList = driver.findElements(By.xpath("//input"));
        for (int i = 0; i < checkBoxList.size(); i++) {
            System.out.println("Is Checkbox Selected: " + checkBoxList.get(i).isSelected()); // false , true
        }
        checkBoxList.forEach(checkbox -> checkbox.click());
        waitForSeconds(2);
        for (int i = 0; i < checkBoxList.size(); i++) {
            System.out.println("Is Checkbox Selected: " + checkBoxList.get(i).isSelected()); // true , false
        }
    }
}
