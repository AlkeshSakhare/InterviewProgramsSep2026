package seleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleTest extends BaseTest {


    @Test
    public void assertTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "The Internet";
        Assert.assertEquals(actualTitle, expectedTitle, "Title not matched");
    }
}
