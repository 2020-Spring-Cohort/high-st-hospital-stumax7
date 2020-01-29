import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {

    @Test
    public void patientShouldHaveBloodLevelOfTwenty() {
        Patient underTest = new Patient();
        int result = underTest.getBloodLevel();
        assertEquals(20, result);
    }
    @Test
    public void patientShouldHaveHealthLevelOfTen(){
        Patient underTest = new Patient();
        int result = underTest.getHealthLevel();
        assertEquals(10, result);
    }
}
