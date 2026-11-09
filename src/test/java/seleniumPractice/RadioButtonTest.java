package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    void radioBtnTest() {
        gotoPage("radio_buttons");
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("result: " + result.getText());
        driver.findElement(By.id("red")).click();
        driver.findElement(By.cssSelector("[value='tennis']")).click();
        String expectedResult = "Color: red, Sport: tennis";
        String actualResult = result.getText();
        System.out.println("result: " + result.getText());
        Assert.assertTrue(expectedResult.equals(actualResult));


    }
}
