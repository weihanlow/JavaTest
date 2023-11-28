package HospitalDatabase;

import Exams.*;

public class Database {
    //List of MRIs
    public final MRI OramMRI = new MRI(2023, 9, 14, "https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2);
    public final MRI ComptonMRI = new MRI(2023, 11, 19, "https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4);

    //List of BPs
    public final BP OramBP = new BP(2023, 9, 15, 130, 70,"ST");
    public final BP ComptonBP = new BP(2023, 11, 20, 150, 80, "VST");

    //List of Patients
    public final Patient DaphVO = new Patient("Daphne Von Oram", "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg", 62, OramMRI, OramBP);
    public final Patient SebComp = new Patient("Sebastian Compton", "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg", 31, ComptonMRI, ComptonBP);

}
