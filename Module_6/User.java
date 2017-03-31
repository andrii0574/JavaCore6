package Module_6;

/**
 * Created by Z570 on 31.03.2017.
 */
public final class User {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final int salary;
    private int balance;

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

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getId() != user.getId()) return false;
        if (getSalary() != user.getSalary()) return false;
        if (getBalance() != user.getBalance()) return false;
        if (!getFirstName().equals(user.getFirstName())) return false;
        return getLastName().equals(user.getLastName());

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getSalary();
        result = 31 * result + getBalance();
        return result;
    }
}
