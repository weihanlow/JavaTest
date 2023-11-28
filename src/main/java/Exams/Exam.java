package Exams;

import java.time.LocalDate;

public abstract class Exam {
    protected final int examDay;
    protected final int examMonth;
    protected final int examYear;

    protected Exam(int examYear, int examMonth, int examDay) {
        this.examDay = examDay;
        this.examMonth = examMonth;
        this.examYear = examYear;
    }

    public abstract LocalDate getBPDate();
    public abstract LocalDate getMRIDate();
    public abstract int getSysPressure();
    public abstract int getDiasPressure();
    public abstract String getTerm();
    public abstract String getImageURL();
    public abstract int getMRIStrength();




}


