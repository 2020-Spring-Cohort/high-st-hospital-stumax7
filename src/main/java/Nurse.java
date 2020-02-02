import java.util.ArrayList;
import java.util.HashMap;

public class Nurse extends Employee implements MedicalStaff{
    HashMap<Integer, Patient> patientsList = new HashMap<>();


public Nurse (String name, int IDNumber, boolean isPaid){
        super(name, IDNumber, isPaid);
}
    @Override
    public int paySalary() {
        return 50000;
    }

    public HashMap<Integer, Patient> getPatientsList(){
    return patientsList;
    }

    public void addPatientToPatientsList(int patientID, Patient testPatient){
    patientsList.put(patientID, testPatient);
    }





    @Override
    public void drawBlood(Patient testPatient) {
        testPatient.giveBloodToNurse();
    }

    @Override
    public void careForPatient(Patient testPatient) {
        testPatient.receiveCareFromNurse();
    }
    @Override
    public String toString() {
        return "Position= nurse, name= " + getName()
                + ", ID Number= " + getIDNumber()
                + ", number of patients= " + patientsList.size()
                + ", salary= " + paySalary()
                + ", is paid= " + getIsPaid();
    }
}
