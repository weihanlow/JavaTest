package Exams;

import java.time.LocalDate;

public class MRI extends Exam{

    private final String imageURL;
    private final int MRIStrength;

    public MRI(int examYear, int examMonth, int examDay, String imageURL, int MRIStrength) {
        super(examYear, examMonth, examDay);
        this.imageURL=imageURL;
        this.MRIStrength=MRIStrength;
    }


    public LocalDate getMRIDate() {
        return LocalDate.of(examYear, examMonth, examDay);
    }

    public String getImageURL() {
        return imageURL;
    }

    public int getMRIStrength() {
        return MRIStrength;
    }

    //The following methods are for the sake of abstraction, not to be used.
    @Override
    public LocalDate getBPDate() {
        return null;
    }
    @Override
    public int getSysPressure() {
        return 0;
    }
    @Override
    public int getDiasPressure() {
        return 0;
    }
    @Override
    public String getTerm() {
        return null;
    }

}
