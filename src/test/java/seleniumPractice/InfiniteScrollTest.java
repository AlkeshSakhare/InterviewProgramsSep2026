package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class InfiniteScrollTest extends BaseTest {

    @Test
    void inifiniteScrollTest() throws InterruptedException {
        gotoPage("infinite_scroll");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int i = 1;
        while (i <= 100) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            //   js.executeScript("window.scrollTo({top: document.body.scrollHeight, behavior: 'smooth'});");
            System.out.println("Scrolling : " + i);
            i++;
        }
        waitForSeconds(2);
        js.executeScript("window.scrollTo(0, 0);");
        waitForSeconds(2);
    }
}
