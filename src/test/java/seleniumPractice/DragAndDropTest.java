package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {
    @Test
    void dragdropTest() {
        gotoPage("drag_and_drop");
        WebElement source = driver.findElement(By.id("column-a"));
        WebElement destination = driver.findElement(By.id("column-b"));
        WebElement sourceHeader = source.findElement(By.tagName("header"));
        WebElement destinationHeader = destination.findElement(By.tagName("header"));
        System.out.println("Before Drag And Drop");
        System.out.println("sourceHeader: " + sourceHeader.getText());
        System.out.println("destinationHeader: " + destinationHeader.getText());
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, destination);
        actions.perform();
        System.out.println("After Drag And Drop");
        sourceHeader = source.findElement(By.tagName("header"));
        destinationHeader = destination.findElement(By.tagName("header"));
        System.out.println("sourceHeader: " + sourceHeader.getText());
        System.out.println("destinationHeader: " + destinationHeader.getText());

    }
}
