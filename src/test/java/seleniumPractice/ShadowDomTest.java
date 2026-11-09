package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ShadowDomTest extends BaseTest {

    @Test
    void shadowDomTest() {
        gotoPage("shadowdom");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        WebElement spanelement = (WebElement) executor.executeScript("return document.querySelector('my-paragraph span')");
        System.out.println(spanelement.getText());

        WebElement ulElement = (WebElement) executor.executeScript("return document.querySelector('my-paragraph ul')");
        List<WebElement> elements = ulElement.findElements(By.tagName("li"));
        elements.forEach(e -> System.out.println(e.getText()));
    }
}