package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CustomDropDownTest extends BaseTest {

    @Test
    void customDDTest() throws InterruptedException {
        gotoPage("custom_dropdown");
        WebElement dropDown = driver.findElement(By.id("fruit-combo"));
        dropDown.click();
        waitForSeconds(2);
        List<WebElement> dropDownlist = driver.findElements(By.xpath("//*[@*='fruit-listbox']/div"));
        dropDownlist.forEach(webElement -> System.out.println(webElement.getText()));
        //select Apple
        dropDownlist.get(0).click();
        System.out.println(driver.findElement(By.id("result")).getText());
        waitForSeconds(2);
        //select Mango
        dropDown.click();
        waitForSeconds(1);
        dropDownlist.get(3).click();
        System.out.println(driver.findElement(By.id("result")).getText());
        waitForSeconds(2);
        //select banana
        dropDown.click();
        waitForSeconds(1);
        dropDownlist.get(1).click();
        System.out.println(driver.findElement(By.id("result")).getText());
        waitForSeconds(2);
        //select Orange
        dropDown.click();
        waitForSeconds(1);
        dropDownlist.get(4).click();
        System.out.println(driver.findElement(By.id("result")).getText());
        waitForSeconds(2);
    }
}
