import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SurgeonTest {
    @Test
    public void surgeonCanOperate() {
        Surgeon underTest = new Surgeon("testName", 2, "heart", true);
        boolean result = underTest.getIsOperating();
        assertTrue(result);
    }
}
