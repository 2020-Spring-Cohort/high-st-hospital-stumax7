public class Janitor extends Employee{
    private boolean isSweeping;
    public Janitor(String name, int IDNumber, boolean isPaid, boolean isSweeping){
        super(name, IDNumber, isPaid);
        this.isSweeping = isSweeping;
    }
    public boolean getIsSweeping(){
        return isSweeping;
    }

    public void Sweep(){
        isSweeping = true;
    }

    @Override
    public int paySalary() {
        return 40000;
    }

    @Override
    public String toString() {
        return "Position= janitor, name= " + getName()
                + ", ID Number= " + getIDNumber()
                + ", isSweeping= " + isSweeping
                + ", salary= " + paySalary()
                + ", is paid= " + getIsPaid();
    }
}
