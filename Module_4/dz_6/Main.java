package Module_4.dz_6;

import Module_4.dz_1.Bank;
import Module_4.dz_2.Currency;
import Module_4.dz_3.ChinaBank;
import Module_4.dz_3.EUBank;
import Module_4.dz_3.USBank;
import Module_4.dz_4.User;
import Module_4.dz_5.BankSystemImpl;

/**
 * Created by Z570 on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        USBank bankOfUS1 = new USBank();
        bankOfUS1.setId(1);
        bankOfUS1.setBankCountry("USA");
        bankOfUS1.setCurrency(Currency.USD);
        bankOfUS1.setNumberOfEmployees(25);
        bankOfUS1.setAvrSalaryOfEmployee(2000);
        bankOfUS1.setRating(3);
        bankOfUS1.setTotalCapital(25000000);

        USBank bankOfUS2 = new USBank();
        bankOfUS2.setId(2);
        bankOfUS2.setBankCountry("USA");
        bankOfUS2.setCurrency(Currency.EUR);
        bankOfUS2.setNumberOfEmployees(20);
        bankOfUS2.setAvrSalaryOfEmployee(2000);
        bankOfUS2.setRating(5);
        bankOfUS2.setTotalCapital(26000000);

        EUBank bankOfEU1 = new EUBank();
        bankOfEU1.setId(3);
        bankOfEU1.setBankCountry("England");
        bankOfEU1.setCurrency(Currency.EUR);
        bankOfEU1.setNumberOfEmployees(23);
        bankOfEU1.setAvrSalaryOfEmployee(2000);
        bankOfEU1.setRating(6);
        bankOfEU1.setTotalCapital(3000000);

        EUBank bankOfEU2 = new EUBank();
        bankOfEU2.setId(4);
        bankOfEU2.setBankCountry("Poland");
        bankOfEU2.setCurrency(Currency.USD);
        bankOfEU2.setNumberOfEmployees(17);
        bankOfEU2.setAvrSalaryOfEmployee(1000);
        bankOfEU2.setRating(12);
        bankOfEU2.setTotalCapital(2000000);

        ChinaBank bankOfChina1 = new ChinaBank();
        bankOfChina1.setId(5);
        bankOfChina1.setBankCountry("China");
        bankOfChina1.setCurrency(Currency.USD);
        bankOfChina1.setNumberOfEmployees(31);
        bankOfChina1.setAvrSalaryOfEmployee(1000);
        bankOfChina1.setRating(8);
        bankOfChina1.setTotalCapital(3500000);

        ChinaBank bankOfChina2 = new ChinaBank();
        bankOfChina2.setId(6);
        bankOfChina2.setBankCountry("China");
        bankOfChina2.setCurrency(Currency.EUR);
        bankOfChina2.setNumberOfEmployees(30);
        bankOfChina2.setAvrSalaryOfEmployee(1200);
        bankOfChina2.setRating(7);
        bankOfChina2.setTotalCapital(3200000);



        User user1 = new User(1, "Alex", 3000, 2, "SoftWareCompany1", 2000, bankOfUS1);

        User user2 = new User(2, "Max", 5000, 3, "SoftWareCompany2", 2300, bankOfUS2);

        User user3 = new User(3, "Edvard", 300, 3, "SoftWareCompany3", 2100, bankOfEU1);

        User user4 = new User(4, "Maven", 1000, 5, "SoftWareCompany4", 1700, bankOfEU2);

        User user5 = new User(5, "Kelvin", 5000, 3, "SoftWareCompany5", 2300, bankOfChina1);

        User user6 = new User(6, "Cin", 100, 8, "SoftWareCompany6", 1600, bankOfChina2);

        BankSystemImpl bankSystemImpl = new BankSystemImpl();

        bankSystemImpl.withdrawOfUser(user1, 1000);
        bankSystemImpl.withdrawOfUser(user2, 200);
        bankSystemImpl.withdrawOfUser(user3, 800);
        bankSystemImpl.withdrawOfUser(user4, 500);
        bankSystemImpl.withdrawOfUser(user5, 800);
        bankSystemImpl.withdrawOfUser(user6, 100);

        bankSystemImpl.fundUser(user1, 1000);
        bankSystemImpl.fundUser(user2, 2000);
        bankSystemImpl.fundUser(user3, 1500);
        bankSystemImpl.fundUser(user4, 800);
        bankSystemImpl.fundUser(user5, 400);
        bankSystemImpl.fundUser(user6, 10000);

        bankSystemImpl.transferMoney(user1, user4, 300);

        bankSystemImpl.paySalary(user1);
        bankSystemImpl.paySalary(user2);
        bankSystemImpl.paySalary(user3);
        bankSystemImpl.paySalary(user4);
        bankSystemImpl.paySalary(user5);
        bankSystemImpl.paySalary(user6);
    }
}
