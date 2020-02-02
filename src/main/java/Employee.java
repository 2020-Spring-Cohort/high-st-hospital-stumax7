public class Employee {
    private String name;
    private int IDNumber;
    private boolean isPaid;

    public Employee (String name, int IDNumber, boolean isPaid){
        this.name = name;
        this.IDNumber = IDNumber;
        this.isPaid = isPaid;
    }
    public String getName(){
        return name;
    }
    public int getIDNumber(){
        return IDNumber;
    }
    public boolean getIsPaid() {return isPaid;}

    public int paySalary(){
     return 0;
    }

    public void receivePay(){
        isPaid = true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", IDNumber=" + IDNumber +
                '}';
    }
}
