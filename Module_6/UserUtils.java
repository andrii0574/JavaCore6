package Module_6;

import java.util.ArrayList;

/**
 * Created by Z570 on 31.03.2017.
 */
public final class UserUtils {

    private UserUtils() {
    }

    // finds and returns unique users (users are equal when all their field are equal
    public static User[] uniqueUsers(User[] users){
        ArrayList<User> uniqueUsersArray = new ArrayList<>();
        int equals = 0;
        int count = 0;
        for (int i = count; i < users.length; i++) {
            equals = 0;
            for (int j =  i+1; j < users.length; j++) {
                if(users[i].equals(users[j])){
                    equals ++;
                }
            }
            count ++;
            if (equals == 0){
                uniqueUsersArray.add((users[i]));
            }
        }
        User[] uniqueUsers = new User[uniqueUsersArray.size()];
        for (int i = 0; i < uniqueUsersArray.size(); i++) {
            uniqueUsers[i] = uniqueUsersArray.get(i);
        }
        return uniqueUsers;
    }

    // finds and returns the user whose balance is equal to given balance
    public static User[] usersWithContitionalBalance(User[] users, int balance){
        ArrayList<User> withBalanceUsersArrayL = new ArrayList<>();
        for (int i = 0; i < users.length; i++) {
            if(users[i].getBalance() == balance){
                withBalanceUsersArrayL.add((users[i]));
            }
        }
        User[] withBalanceUsersArray = new User[withBalanceUsersArrayL.size()];
        for (int i = 0; i < withBalanceUsersArrayL.size(); i++) {
            withBalanceUsersArray[i] = withBalanceUsersArrayL.get(i);
        }
        return withBalanceUsersArray;
    }

    // pay salary to each user balance
    public static final User[] paySalaryToUsers(User[] users){
        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        return users;
    }

    // returns an array of user IDs
    public static final long[] getUsersId(User[] users){
        long[] usersID = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            usersID[i] = users[i].getId();
        }
        return usersID;
    }

    // finds and removes empty elements of the array (as a result returns a new array with smaller size)
    public static User[] deleteEmptyUsers(User[] users){
        ArrayList<User> notEmptyUsersArrayL = new ArrayList<>();
        for (int i = 0; i < users.length; i++) {
            if(users[i].getId() != 0 && users[i].getFirstName() != null && users[i].getLastName() != null && users[i].getSalary()  != 0 &&  users[i].getBalance()  != 0){
                notEmptyUsersArrayL.add((users[i]));
            }
        }
        User[] notEmptyUsersArray = new User[notEmptyUsersArrayL.size()];
        for (int i = 0; i < notEmptyUsersArrayL.size(); i++) {
            notEmptyUsersArray[i] = notEmptyUsersArrayL.get(i);
        }
        return notEmptyUsersArray;
    }

}
