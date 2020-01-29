import java.util.ArrayList;

public class Nurse extends Employee{
    ArrayList<Patient> patients = new ArrayList<>();

public Nurse (String name, int IDNumber){
        super(name, IDNumber);
}
    @Override
    public int calculatePay() {
        return 50000;
    }
}
