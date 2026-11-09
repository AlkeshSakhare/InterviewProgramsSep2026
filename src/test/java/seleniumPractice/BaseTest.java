package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    String url = "https://the-internet.herokuapp.com/";
    WebDriver driver;

    @BeforeTest
    void openSite() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterTest
    void closeSite() {
        driver.quit();
    }

    void waitForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(seconds));
    }

    void gotoPage(String hrefPath) {
        WebElement pageLink = driver.findElement(By.xpath("//*[@*='/" + hrefPath + "']"));
        pageLink.click();
    }
}
