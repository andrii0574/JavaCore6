package Module_6;

/**
 * Created by Z570 on 31.03.2017.
 */
public final class User {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final int salary;
    private final int balance;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getBalance() {
        return balance;
    }

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }
}
