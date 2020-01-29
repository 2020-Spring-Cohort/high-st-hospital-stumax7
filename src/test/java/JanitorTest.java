import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JanitorTest {
    @Test
    public void janitorSweeps(){
        Janitor underTest = new Janitor("testName", 5, true);
        boolean result = underTest.getIsSweeping();
        assertTrue(result);
    }
}
