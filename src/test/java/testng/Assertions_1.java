package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_1 {

    @Test
    public void assertFalsetest() {
        Assert.assertFalse(true);
        Assert.assertFalse(true, "Its true");
    }

    @Test
    public void assertTruetest() {
        Assert.assertTrue(false);
        Assert.assertTrue(false, "Its false");
    }

    @Test
    public void softAssertionTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
        softAssert.assertTrue(true);
        softAssert.assertAll();
    }

    @Test
    public void assertEqualTest() {
        Assert.assertEquals("actual", "expected", "String message");
    }

    @Test
    public void assertNotEqualTest() {
        Assert.assertNotEquals("actual", "actual", "String message");
    }
}
