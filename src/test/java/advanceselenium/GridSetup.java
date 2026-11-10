package advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridSetup {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setPlatform(Platform.WIN11);
        dc.setBrowserName(Browser.EDGE.browserName());
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.31.1:4444/wd/hub"), dc);
        try {
            driver.get("https://www.google.com");
            System.out.println("Title: " + driver.getTitle());
            driver.findElement(By.name("q")).sendKeys("teachmeselenium");
        } finally {
            driver.quit();
        }
    }
}