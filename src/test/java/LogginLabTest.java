import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogginLabTest {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void thresholdExceeds() {
        Integer finalLimit = 5;

        LogginLab lab = new LogginLab();
        lab.setThreshold(finalLimit);

        for (Integer i = 1; i <= finalLimit; i++) {
            if (lab.thresholdExceeds(i)) {
                logger.log(Level.INFO, "Threshold not reached! It is " + i);
                assertTrue(lab.thresholdExceeds(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdExceeds(i));
            }
        }
    }

    @Test
    public void thisisatest(){
        LogginLab logginlab1 = new LogginLab();
        int testThreshold = 5;
        int testLimit = 6;
        logginlab1.setThreshold(testThreshold);
        logger.log(Level.INFO, "Test 1 is a go.");
        assertEquals(true, logginlab1.thresholdReached(testLimit));

    }

    @Test
    public void thisisatest2(){
        logger.log(Level.INFO, "Test 2 is a go.");
        LogginLab logginlab2 = new LogginLab();
        assertEquals(false, logginlab2.thresholdReached(0));

    }
}