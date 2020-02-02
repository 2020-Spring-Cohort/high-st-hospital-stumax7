import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {

    @Test
    public void patientShouldHaveBloodLevelOfTwenty() {
        Patient underTest = new Patient("testPatient", 1);
        int result = underTest.getBloodLevel();
        assertEquals(20, result);
    }
    @Test
    public void patientShouldHaveHealthLevelOfTen(){
        Patient underTest = new Patient("testPatient", 1);
        int result = underTest.getHealthLevel();
        assertEquals(10, result);
    }
    @Test
    public void patientShouldGiveBloodToNurse(){
        Patient underTest = new Patient("testPatient", 1);
        underTest.giveBloodToNurse();
        int result = underTest.getBloodLevel();
        assertEquals(17, result);
    }
    @Test
    public void patientShouldReceiveCareFromNurse(){
        Patient underTest = new Patient("testPatient", 1);
        underTest.receiveCareFromNurse();
        int result = underTest.getHealthLevel();
        assertEquals(15, result);
    }
    @Test
    public void patientShouldGiveBloodToDoctor(){
        Patient underTest = new Patient("testPatient", 1);
        underTest.giveBloodToDoctor();
        int result = underTest.getBloodLevel();
        assertEquals(15, result);
    }
    @Test
    public void patientShouldReceiveCareFromDoctor(){
        Patient underTest = new Patient("testPatient", 1);
        underTest.receiveCareFromDoctor();
        int result = underTest.getHealthLevel();
        assertEquals(20, result);
    }
}
