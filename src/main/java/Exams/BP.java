package Exams;

import java.time.LocalDate;

public class BP extends Exam{
    private final int sysPressure;
    private final int diasPressure;
    private final String term;
    public BP(int examYear, int examMonth, int examDay, int sysPressure, int diasPressure, String term) {
        super(examYear, examMonth, examDay);
        this.sysPressure=sysPressure;
        this.diasPressure=diasPressure;
        this.term=term;
    }

    public LocalDate getBPDate() {
        return LocalDate.of(examYear, examMonth, examDay);
    }
    public int getSysPressure() {
        return sysPressure;
    }
    public int getDiasPressure() {
        return diasPressure;
    }
    public String getTerm() {
        return term;
    }

    //The following methods are for the sake of abstraction, not to be used.
    @Override
    public LocalDate getMRIDate() {
        return null;
    }
    @Override
    public String getImageURL() {
        return null;
    }
    @Override
    public int getMRIStrength() {
        return 0;
    }
}
