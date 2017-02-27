package Module_4.dz_5;

import Module_4.dz_4.User;

/**
 * Created by Z570 on 23.02.2017.
 */
public class BankSystemImpl implements BankSystem {


    public void withdrawOfUser(User user, int amount) {
        if((user.getBank().getLimitOfWithdrawal() < amount)){
            System.out.println("Error! Limit of withdraw exceeded \n");
        }else if(user.getBalance() < (amount + user.getBank().getCommission(amount))){
            System.out.println("Error! Your withdraw is more then balance \n");
        }else{
            user.setBalance(user.getBalance() - (amount + user.getBank().getCommission(amount)));
            System.out.println("Withdraw " + amount + " " + user.getBank().getCurrency() + " with commission " + user.getBank().getCommission(amount) + " " + user.getBank().getCurrency() +" of User " + user.getName());
            System.out.println("New balance is: " + user.getBalance() + " " + user.getBank().getCurrency() + "\n");
        }

    }

    public void fundUser(User user, int amount) {
        if(user.getBank().getLimitOfFunding() < amount){
            System.out.println("Error! Limit of fund exceeded \n");
        }else {
            user.setBalance(user.getBalance() + amount);
            System.out.println("Fund " + amount + " " + user.getBank().getCurrency() + " of User " + user.getName());
            System.out.println("New balance is: " + user.getBalance() + " " + user.getBank().getCurrency() + "\n");
        }
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        if(fromUser.getBalance() < (amount + fromUser.getBank().getCommission(amount))){
            System.out.println("Error! Missing sum on the balance \n");
        }else{
            fromUser.setBalance(fromUser.getBalance() - fromUser.getBank().getCommission(amount) - amount);
            toUser.setBalance(toUser.getBalance() + amount);
        }
        System.out.println("Transfer " + amount + " with commission " + fromUser.getBank().getCommission(amount) + " " + fromUser.getBank().getCurrency()+ " from User " + fromUser.getName() + " to User " + toUser.getName() + "\n");
    }

    public void paySalary(User user) {
        double sumOfSalary = user.getMonthsOfEmployment() * user.getSalary() + (user.getSalary() / 100 * user.getBank().getMonthlyRate());
        user.setBalance(user.getBalance() + sumOfSalary);
        System.out.println("Pay Salary to User: " + user.getName());
        System.out.println(sumOfSalary + " " + user.getBank().getCurrency() + " (" + user.getMonthsOfEmployment() + " month)");
        System.out.println("New balance: " + user.getBalance() + " \n");
    }
}
