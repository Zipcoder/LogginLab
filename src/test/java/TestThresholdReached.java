import org.junit.Assert;
import org.junit.Test;

public class TestThresholdReached {
    @Test
    public void test1() {
        // given
        LogginLab logginLab = new LogginLab();
        int threshold = 5;
        logginLab.setThreshold(threshold);
        int limit = 10;
        boolean expected = true;

        // when
        boolean outcome = logginLab.thresholdReached(limit);

        //then
        Assert.assertEquals(expected, outcome);
    }

    @Test
    public void test2() {
        // given
        LogginLab logginLab = new LogginLab();
        int threshold = 5;
        logginLab.setThreshold(threshold);
        int limit = 2;
        boolean expected = false;

        // when
        boolean outcome = logginLab.thresholdReached(limit);

        //then
        Assert.assertEquals(expected, outcome);
    }
}
