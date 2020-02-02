public class Patient {
    private String name;
    private int patientID;
    private int bloodLevel;
    private int healthLevel;
    public Patient(String name, int patientID){
        this.name = name;
        this.patientID = patientID;
        this.bloodLevel = 20;
        this.healthLevel = 10;
    }
    public int getPatientID(){return patientID;}
    public int getBloodLevel(){
        return bloodLevel;
    }
    public int getHealthLevel(){
        return healthLevel;
    }

    public void giveBloodToNurse(){
        bloodLevel -= 3;
    }

    public void receiveCareFromNurse(){
        healthLevel += 5;
    }

    public void giveBloodToDoctor(){
        bloodLevel -= 5;
    }

    public void receiveCareFromDoctor(){
        healthLevel += 10;
    }


    @Override
    public String toString() {
        return "name= " + name
                + ", patient ID= " + patientID
                + ", bloodLevel= " + bloodLevel +
                ", healthLevel= " + healthLevel;
    }
}
