import org.junit.Assert;
import org.junit.Test;

public class TestCheckNumbers {
    //test1
    @Test
    public void testCheckNumbers1() {
        CheckNumbers checkNumbers = new CheckNumbers();
        int[] test1 = {1, 1, 1, 4, 1, 4};
        Assert.assertTrue(checkNumbers.onesAndFours(test1));
    }
    //test2
    @Test
    public void testCheckNumbers2() {
        CheckNumbers checkNumbers = new CheckNumbers();
        int[] test2 = {2, 1, 2, 2, 3, 5, 6, 7, 8};
        Assert.assertFalse(checkNumbers.onesAndFours(test2));
    }
    //test3
    @Test
    public void testCheckNumbers3() {
        CheckNumbers checkNumbers = new CheckNumbers();
        int[] test3 = {};
        Assert.assertFalse(checkNumbers.onesAndFours(test3));
    }
}
