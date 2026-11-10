package advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ShadowDom {

    @Test
    void shadowDomJSTest() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("edge://downloads/");
        JavascriptExecutor js = driver;
        WebElement searchDownload = (WebElement) js.executeScript("return document.querySelector('downloads-full-page-app').shadowRoot.querySelector('edge-side-pane').shadowRoot.querySelector('mai-text-input').shadowRoot.querySelector('input#control')");
        searchDownload.sendKeys("Searching...");
    }

    @Test
    void shadowDomSeleniumNativeSupportTest() {

        /*
        Interview point: getShadowRoot() was introduced in Selenium 4 to provide native support for interacting with Shadow DOM elements.
        --------------------------------------------------------
        JavaScriptExecutor                 Selenium 4
        ---------------------------------------------------------
        shadowRoot                        getShadowRoot()
        querySelector()                   findElement()
        JavaScript execution               Native Selenium API
        Returns DOM element                Returns SearchContext / WebElement
        ---------------------------------------------------------
         */
        EdgeDriver driver = new EdgeDriver();
        driver.get("edge://downloads/");

        WebElement host1 = driver.findElement(By.cssSelector("downloads-full-page-app"));
        SearchContext shadow1 = host1.getShadowRoot();
        WebElement host2 = shadow1.findElement(By.cssSelector("edge-side-pane"));
        SearchContext shadow2 = host2.getShadowRoot();
        WebElement host3 = shadow2.findElement(By.cssSelector("mai-text-input"));
        SearchContext shadow3 = host3.getShadowRoot();
        WebElement searchDownload = shadow3.findElement(By.cssSelector("input#control"));

        searchDownload.sendKeys("Searching...");
    }
}
