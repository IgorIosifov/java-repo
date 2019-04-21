import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestReturns {

    //test 1
    @Test
    public void testReturns1() {

        ReturnsAfter returnsAfter = new ReturnsAfter();
        int[] test1 = {1, 2, 3, 4, 5, 6, 7};
        int[] expect1 = {5, 6, 7};
        Assert.assertArrayEquals(expect1, returnsAfter.LastFour(test1));
    }

    //test 2
    @Test
    public void testReturns2() {
        ReturnsAfter returnsAfter = new ReturnsAfter();
        int[] test2 = {4, 4, 4, 4, 7, 6, 5};
        int[] expect2 = {7, 6, 5};
        Assert.assertArrayEquals(expect2, returnsAfter.LastFour(test2));
    }

    //test 3
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testReturns3() throws RuntimeException {
        ReturnsAfter returnsAfter = new ReturnsAfter();
        int[] test3 = {1, 2, 3, 5, 6, 7};
        exception.expect(RuntimeException.class);
        returnsAfter.LastFour(test3);
    }
}
