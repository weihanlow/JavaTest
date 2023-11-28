package HospitalDatabase;

public abstract class People {
    private final String fullName;

    protected People(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
