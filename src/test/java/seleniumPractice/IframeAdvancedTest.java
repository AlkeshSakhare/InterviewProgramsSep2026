package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeAdvancedTest extends BaseTest {

    @Test
    void sandBoxiframeTest() throws InterruptedException {
        gotoPage("iframes_advanced");
        //sandbox frame
        WebElement sandboxIframe = driver.findElement(By.id("sandboxed-frame"));
        WebElement messageLogTxt = driver.findElement(By.id("message-log"));
        driver.switchTo().frame(sandboxIframe);
        driver.findElement(By.id("send-message")).click();
        driver.switchTo().defaultContent();
        System.out.println("MSG LOG: " + messageLogTxt.getText());
        waitForSeconds(2);
        //srcdoc
        WebElement srcdocIframe = driver.findElement(By.id("srcdoc-frame"));
        driver.switchTo().frame(srcdocIframe);
        WebElement inputTxt = driver.findElement(By.id("srcdoc-input"));
        String inputValue = "Test entering text";
        inputTxt.sendKeys(inputValue);
        inputTxt = driver.findElement(By.id("srcdoc-input"));
        waitForSeconds(2);
        System.out.println("Input value: " + inputTxt.getDomProperty("value"));
        Assert.assertTrue(inputTxt.getDomProperty("value").equals(inputValue));
        driver.switchTo().defaultContent();

        //shadowdom iframe
// Locate Shadow Host
        WebElement frameHost = driver.findElement(By.id("frame-host"));
// Access Shadow Root
        SearchContext shadowRoot = frameHost.getShadowRoot();
// Locate iframe inside Shadow DOM
        WebElement iframe = shadowRoot.findElement(By.id("shadow-frame"));
// Switch to iframe
        driver.switchTo().frame(iframe);
        WebElement button = driver.findElement(By.id("send-message"));
        button.click();
        waitForSeconds(2);
        driver.switchTo().defaultContent();
    }
}
