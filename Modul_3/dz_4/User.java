package Modul_3.dz_4;

/**
 * Created by Z570 on 21.02.2017.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;
    private static final int commis5 = 5;
    private static final int commis10 = 10;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public static int getComis5() {
        return commis5;
    }

    public static int getComis10() {
        return commis10;
    }

    public static void main(String[] args) {
        User User1 = new User("Alex", 2000, 3, "ITCompany", 5000, "EUR");
        User1.paySalary();
        User1.withdraw(1000);
        User1.companyNameLenght();
        User1.monthIncreaser(2);

        User User2 = new User("Max", 100, 3, "ITSoftware", 500, "EUR");
        User2.paySalary();
        User2.withdraw(200);
        User2.companyNameLenght();
        User2.monthIncreaser(3);
    }

    void paySalary(){
        this.balance = this.salary + this.balance;
        System.out.println("New " + this.name + " balance after pay of salary: " + this.balance + " " + this.currency);
    }

    void withdraw(int summ){
        int commission = 0;
        if(this.balance < 1000){
            this.balance = this.balance - (summ + summ*this.commis5/100);
            commission = this.commis5;
        }else{
            this.balance = this.balance - (summ + summ*this.commis10/100);
            commission = this.commis10;
        }

        System.out.println("New balance after payment with commission " + commission + "%: " + this.balance+ " " + this.currency);
    }

    void companyNameLenght(){
        System.out.println("Length of company name: " + this.companyName.length());
    }

    void monthIncreaser(int addMonth){
        this.monthsOfEmployment += addMonth;
        System.out.println("New Month Of Employment: " + this.monthsOfEmployment + "\n");
    }
}
