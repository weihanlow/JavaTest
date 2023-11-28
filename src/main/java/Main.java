import HospitalDatabase.*;


public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Doctor doctor = new Doctor("The Doctor");
        Admin admin = new Admin("The Administrator");

        Patient p1 = database.DaphVO;
        Patient p2 = database.SebComp;

        doctor.getDetails(p1);
        admin.getDetails(p1);

        doctor.getDetails(p2);
        admin.getDetails(p2);

    }
}