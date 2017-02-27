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
    private static final int COMMISSION_FIVE_PERCENT = 5;
    private static final int COMMISSION_TEN_PERCENT = 10;

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
        return COMMISSION_FIVE_PERCENT;
    }

    public static int getComis10() {
        return COMMISSION_TEN_PERCENT;
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

    public void paySalary(){
        this.balance = this.salary + this.balance;
        System.out.println("New " + this.name + " balance after pay of salary: " + this.balance + " " + this.currency);
    }

    public void withdraw(int summ){
        int commission = 0;
        if(this.balance < 1000){
            this.balance = this.balance - (summ + summ*this.COMMISSION_FIVE_PERCENT /100);
            commission = this.COMMISSION_FIVE_PERCENT;
        }else{
            this.balance = this.balance - (summ + summ*this.COMMISSION_TEN_PERCENT /100);
            commission = this.COMMISSION_TEN_PERCENT;
        }

        System.out.println("New balance after payment with commission " + commission + "%: " + this.balance+ " " + this.currency);
    }

    public void companyNameLenght(){
        System.out.println("Length of company name: " + this.companyName.length());
    }

    public void monthIncreaser(int addMonth){
        this.monthsOfEmployment += addMonth;
        System.out.println("New Month Of Employment: " + this.monthsOfEmployment + "\n");
    }
}
