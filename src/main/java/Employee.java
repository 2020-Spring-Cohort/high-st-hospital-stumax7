public abstract class Employee {
    private String name;
    private int IDNumber;

    public Employee (String name, int IDNumber){
        this.name = name;
        this.IDNumber = IDNumber;
    }
    public String getName(){
        return name;
    }
    public int getIDNumber(){
        return IDNumber;
    }

    public abstract int calculatePay();
}
