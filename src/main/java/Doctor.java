public class Doctor extends Employee implements MedicalStaff {
    String specialty;

    public Doctor(String name, int IDNumber, boolean isPaid, String specialty){
        super(name, IDNumber, isPaid);
        this.specialty = specialty;
    }

    public String getSpecialty(){
        return specialty;
    }

    @Override
    public int paySalary() {
        return 90000;
    }

    @Override
    public String toString() {
        return "Position= doctor, name= " + getName() + ", ID Number= " + getIDNumber() +
                ", specialty='" + specialty + ", salary= " + paySalary() + ", is paid= " + getIsPaid();
    }

    @Override
    public void drawBlood(Patient testPatient) {
        testPatient.giveBloodToDoctor();
    }

    @Override
    public void careForPatient(Patient testPatient) {
        testPatient.receiveCareFromDoctor();
    }

}
