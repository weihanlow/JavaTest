package HospitalDatabase;

import java.time.LocalDate;

public class Admin extends People implements AccessData {

    public Admin(String fullName) {
        super(fullName);
    }

    @Override
    public void getDetails(Patient patient) {
        String patientName = patient.getFullName();
        int MRIStrength = patient.getMRI().getMRIStrength();
        LocalDate MRIDate = patient.getMRI().getMRIDate();
        String BPterm = patient.getBP().getTerm();
        LocalDate BPDate = patient.getBP().getBPDate();

        System.out.print("Patient: " + patientName + ": ");
        System.out.print( "MRI: " + MRIStrength + " Tesla, " + MRIDate.toString() + ": ");
        System.out.print("BP: " + BPterm + ", " + BPDate.toString());
        System.out.println(" ");

    }
}
