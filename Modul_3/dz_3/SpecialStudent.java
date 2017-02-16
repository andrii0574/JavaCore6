package Modul_3.dz_3;

/**
 * Created by Z570 on 12.02.2017.
 */
public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }

    public SpecialStudent() {
    }

    public long getSecretKey() {
        return secretKey;
    }


    public String getEmail() {
        return email;
    }
}
