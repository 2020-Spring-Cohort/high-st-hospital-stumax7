public class HospitalApplication {
    public static void main(String[] args) {
        Hospital highStreetHospital = createHospital();

        Doctor doctor1 = hireDoctor(highStreetHospital);

        Nurse nurse1 = hireNurse(highStreetHospital);

        Receptionist receptionist1 = hireReceptionist(highStreetHospital);

        Janitor janitor1 = hireJanitor(highStreetHospital);

        reportHiring(highStreetHospital);

        Patient patient1 = admitPatient1(nurse1, "Fred", 1);
        Patient patient2 = admitPatient2(nurse1, "Mary", 2);

        reportPatientsList(nurse1);

        nurseTreatsFred(nurse1, patient1);

        doctorTreatsMary(doctor1, nurse1, patient2);

        receptionistAnswersPhone(highStreetHospital, receptionist1);

        janitorSweeps(highStreetHospital, janitor1);

        payDay(highStreetHospital);
    }

    private static void reportPatientsList(Nurse nurse1) {
        System.out.println("Nurse Salvador is caring for the following patients:");
        System.out.println("");
        printPatientsList(nurse1);
        System.out.println("");
        System.out.println("");
    }

    private static void reportHiring(Hospital highStreetHospital) {
        System.out.println("High Street Hospital has hired the following employees:");
        System.out.println("");
        printEmployeeStatuses(highStreetHospital);
    }

    private static void payDay(Hospital highStreetHospital) {
        highStreetHospital.payEmployees();
        printEmployeeStatuses(highStreetHospital);
    }

    private static void janitorSweeps(Hospital highStreetHospital, Janitor janitor1) {
        janitor1.Sweep();
        System.out.println("Max sweeps the floor.");
        System.out.println("");
        System.out.println(highStreetHospital.getEmployeeList().get(4));
        System.out.println("");
        System.out.println("");
    }

    private static void receptionistAnswersPhone(Hospital highStreetHospital, Receptionist receptionist1) {
        receptionist1.answerPhone();
        System.out.println("Brad answers the phone.");
        System.out.println("");
        System.out.println(highStreetHospital.getEmployeeList().get(3));
        System.out.println("");
        System.out.println("");
    }

    private static void doctorTreatsMary(Doctor doctor1, Nurse nurse1, Patient patient2) {
        doctor1.drawBlood(patient2);
        doctor1.careForPatient(patient2);
        System.out.println("Doctor Sharon drew blood from patient Mary and cared for her.");
        System.out.println("");
        System.out.println(nurse1.getPatientsList().get(2));
        System.out.println("");
        System.out.println("");
    }

    private static void nurseTreatsFred(Nurse nurse1, Patient patient1) {
        nurse1.drawBlood(patient1);
        nurse1.careForPatient(patient1);
        System.out.println("Nurse Salvador drew blood from patient Fred and cared for him.");
        System.out.println("");
        System.out.println(nurse1.getPatientsList().get(1));
        System.out.println("");
        System.out.println("");
    }

    private static void printPatientsList(Nurse nurse1) {
        for(int patientID : nurse1.getPatientsList().keySet()) {
            Patient somePatientFromList = nurse1.getPatientsList().get(patientID);
            System.out.println(somePatientFromList);
        }
    }

    private static Patient admitPatient2(Nurse nurse1, String mary, int i) {
        Patient patient2 = new Patient(mary, i);
        nurse1.addPatientToPatientsList(i, patient2);
        return patient2;
    }

    private static Patient admitPatient1(Nurse nurse1, String fred, int i) {
        Patient patient1 = new Patient(fred, i);
        nurse1.addPatientToPatientsList(i, patient1);
        return patient1;
    }

    private static Janitor hireJanitor(Hospital highStreetHospital) {
        Janitor janitor1 = new Janitor("Max", 4, false, false);
        highStreetHospital.addEmployeeToList(janitor1);
        return janitor1;
    }

    private static Receptionist hireReceptionist(Hospital highStreetHospital) {
        Receptionist receptionist1 = new Receptionist("Brad", 3, false, false);
        highStreetHospital.addEmployeeToList(receptionist1);
        return receptionist1;
    }

    private static Nurse hireNurse(Hospital highStreetHospital) {
        Nurse nurse1 = new Nurse("Salvador", 2, false);
        highStreetHospital.addEmployeeToList(nurse1);
        return nurse1;
    }

    private static Doctor hireDoctor(Hospital highStreetHospital) {
        Doctor doctor1 = new Doctor("Sharon", 1, false, "cardiology");
        highStreetHospital.addEmployeeToList(doctor1);
        return doctor1;
    }

    private static Hospital createHospital() {
        return new Hospital();
    }

    private static void printEmployeeStatuses(Hospital highStreetHospital) {
        for(int IDNumber : highStreetHospital.getEmployeeList().keySet()){
            Employee someEmployeeFromList = highStreetHospital.getEmployeeList().get(IDNumber);
            System.out.println(someEmployeeFromList);
        }
        System.out.println("");
        System.out.println("");
    }
}
