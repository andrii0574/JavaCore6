package Module_4.dz_5;

import Module_4.dz_4.User;

/**
 * Created by Z570 on 23.02.2017.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
