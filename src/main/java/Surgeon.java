public class Surgeon extends Doctor {
    private boolean isOperating;
    public Surgeon(String name, int IDNumber, String specialty, boolean isOperating){
        super(name, IDNumber, specialty);
        this.isOperating = isOperating;
    }
    public boolean getIsOperating(){
       return isOperating;
    }
}
