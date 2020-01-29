public class Doctor extends Employee{
    String specialty;
    public Doctor(String name, int IDNumber, String specialty){
        super(name, IDNumber);
        this.specialty = specialty;
    }

    public String getSpecialty(){
        return specialty;
    }

    @Override
    public int calculatePay() {
        return 90000;
    }
}
