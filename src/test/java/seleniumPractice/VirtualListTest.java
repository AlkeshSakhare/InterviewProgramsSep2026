package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VirtualListTest extends BaseTest {

    @Test
    void virtualList() throws InterruptedException {
        gotoPage("virtual_list");
        WebElement scrollList = driver.findElement(By.id("viewport"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", scrollList);
        waitForSeconds(2);
        WebElement lastItem = driver.findElement(By.xpath("//*[@*='virtual-row'][last()]"));
        System.out.println(lastItem.getText());
    }
}
