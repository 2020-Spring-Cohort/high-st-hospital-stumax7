import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {
    @Test
    public void nurseCanAddPatientsToList(){
        Nurse underTest = new Nurse("testNurse", 3, false);
        Patient testPatient = new Patient("testPatient", 1);
        underTest.addPatientToPatientsList(1, testPatient);
        int result = underTest.getPatientsList().size();
        assertEquals(1, result);
    }

    @Test
    public void nurseCanDrawBlood(){
        Nurse underTest = new Nurse("testNurse", 3, false);
        Patient testPatient = new Patient("testPatient", 1);
        underTest.drawBlood(testPatient);
        int result = testPatient.getBloodLevel();
        assertEquals(17, result);
    }

    @Test
    public void nurseCanProvideCare(){
        Nurse underTest = new Nurse("testNurse", 3, false);
        Patient testPatient = new Patient("testPatient", 1);
        underTest.careForPatient(testPatient);
        int result = testPatient.getHealthLevel();
        assertEquals(15, result);
    }


}
