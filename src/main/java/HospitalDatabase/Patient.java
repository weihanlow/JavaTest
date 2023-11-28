package HospitalDatabase;

import Exams.*;

public class Patient extends People{

    private final String pictureURL;
    private final int age;
    private final MRI mri;
    private final BP bp;

    public Patient(String fullName, String pictureURL, int age, MRI mri, BP bp) {
        super(fullName);
        this.pictureURL = pictureURL;
        this.age = age;
        this.mri = mri;
        this.bp = bp;
    }

    public String getPictureURL() {
        return pictureURL;
    }
    public int getAge() {
        return age;
    }
    public MRI getMRI() {
        return mri;
    }
    public BP getBP() {
        return bp;
    }

}
