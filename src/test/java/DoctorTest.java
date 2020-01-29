import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {
    @Test
    public void doctorHasASpecialty(){
        Doctor underTest = new Doctor("testName",1, "heart");
        String result = underTest.getSpecialty();
        assertEquals("heart", result);
    }
    @Test
    public void doctorHasAPayrate(){
        Doctor underTest = new Doctor("testName",1, "heart");
        int result = underTest.calculatePay();
        assertEquals(90000, result);
    }
}
