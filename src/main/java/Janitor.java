public class Janitor extends Employee{
    private boolean isSweeping;
    public Janitor(String name, int IDNumber, boolean isSweeping){
        super(name,IDNumber);
        this.isSweeping = isSweeping;
    }
    public boolean getIsSweeping(){
        return isSweeping;
    }

    @Override
    public int calculatePay() {
        return 40000;
    }
}
