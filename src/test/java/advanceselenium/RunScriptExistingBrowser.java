package advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.Map;

public class RunScriptExistingBrowser {

    @Test
    void runTest() {
        EdgeOptions edgeOptions = new EdgeOptions();
        //  edgeOptions.setExperimentalOption("debuggerAddress", "localhost:61460");
        WebDriver driver = new EdgeDriver(edgeOptions);
        Capabilities capabilities = ((EdgeDriver) driver).getCapabilities();
        Map<String, Object> map = capabilities.asMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            // from this get debuggerAddress and replace in line no 18
        }
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Test");
        searchBox.submit();
    }
}
