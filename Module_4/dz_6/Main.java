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



        User user1 = new User();
        user1.setId(1);
        user1.setName("Alex");
        user1.setBalance(3000);
        user1.setMonthsOfEmployment(2);
        user1.setCompanyName("SoftWareCompany1");
        user1.setSalary(2000);
        user1.setBank(bankOfUS1);

        User user2 = new User();
        user2.setId(2);
        user2.setName("Max");
        user2.setBalance(5000);
        user2.setMonthsOfEmployment(3);
        user2.setCompanyName("SoftWareCompany2");
        user2.setSalary(2300);
        user2.setBank(bankOfUS2);

        User user3 = new User();
        user3.setId(3);
        user3.setName("Edvard");
        user3.setBalance(300);
        user3.setMonthsOfEmployment(3);
        user3.setCompanyName("SoftWareCompany3");
        user3.setSalary(2100);
        user3.setBank(bankOfEU1);

        User user4 = new User();
        user4.setId(4);
        user4.setName("Maven");
        user4.setBalance(1000);
        user4.setMonthsOfEmployment(5);
        user4.setCompanyName("SoftWareCompany4");
        user4.setSalary(1700);
        user4.setBank(bankOfEU2);

        User user5 = new User();
        user5.setId(5);
        user5.setName("Kelvin");
        user5.setBalance(5000);
        user5.setMonthsOfEmployment(3);
        user5.setCompanyName("SoftWareCompany5");
        user5.setSalary(2300);
        user5.setBank(bankOfChina1);

        User user6 = new User();
        user6.setId(6);
        user6.setName("Cin");
        user6.setBalance(100);
        user6.setMonthsOfEmployment(8);
        user6.setCompanyName("SoftWareCompany6");
        user6.setSalary(1600);
        user6.setBank(bankOfChina2);

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
