public class Receptionist extends Employee {
    private boolean onPhone;

    public Receptionist(String name, int IDNumber, boolean onPhone){
        super(name, IDNumber);
        this.onPhone = onPhone;
    }

    public boolean getOnPhone(){
        return onPhone;
    }

    @Override
    public int calculatePay() {
        return 45000;
    }
}
