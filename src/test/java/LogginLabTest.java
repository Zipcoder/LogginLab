import java.util.logging.Level;
import java.util.logging.Logger;

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

            int i = 10;
            if (lab.thresholdReached(i)) {
                logger.log(Level.INFO, "I did it! It is "+i);
                assertTrue(lab.thresholdReached(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdExceeds(i));

        }
    }
}